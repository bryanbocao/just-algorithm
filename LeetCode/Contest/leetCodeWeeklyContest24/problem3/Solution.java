package leetCodeWeeklyContest24.problem3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
        int row = matrix.size(), col = matrix.get(0).size();
        List<List<Integer>> nM = new ArrayList<List<Integer>>();
        List<Integer> doubleCheckLs = new ArrayList<Integer>();
        for (int i = 0; i < row; i++) {
        	List<Integer> nR = new ArrayList<Integer>();
        	for (int j = 0; j < col; j++) {
        		int cell = matrix.get(i).get(j);
        		if (cell == 0) nR.add(0);
        		else {
        			int min = Integer.MAX_VALUE;
        			boolean inner = true;
        			if (i > 0) {
        				int furtherCell = matrix.get(i - 1).get(j);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			if (j < col - 1) {
        				int furtherCell = matrix.get(i).get(j + 1);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			if (i < row - 1) {
        				int furtherCell = matrix.get(i + 1).get(j);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			if (j > 0) {
        				int furtherCell = matrix.get(i).get(j - 1);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			nR.add(min + 1);
        			if (inner) {
        				doubleCheckLs.add(i);
        				doubleCheckLs.add(j);
        			}
        		}
        	}
        	nM.add(nR);
        }
        
        //check innter
        while (doubleCheckLs.size() > 0) {
        	for (int ii = 0; ii < doubleCheckLs.size();) {
        		int i = doubleCheckLs.get(ii), j = doubleCheckLs.get(ii + 1);
        		int min = Integer.MAX_VALUE;
    			if (i > 0) min = Math.min(nM.get(i - 1).get(j), min);
    			if (j < col - 1) min = Math.min(nM.get(i).get(j + 1), min);
    			if (i < row - 1) min = Math.min(nM.get(i + 1).get(j), min);
    			if (j > 0) min = Math.min(nM.get(i).get(j - 1), min);
    			int currMin = nM.get(i).get(j);
            	if (currMin < min + 1) {
            	    nM.get(i).set(j, min + 1);
            	    ii += 2;
            	} else {
            		doubleCheckLs.remove(ii);
            		doubleCheckLs.remove(ii);
            	}
        	}
        }
        return nM;
    }
    
}
//https://leetcode.com/contest/leetcode-weekly-contest-24/problems/01-matrix/
/*
542. 01 Matrix My SubmissionsBack To Contest
User Accepted: 340
User Tried: 586
Total Accepted: 344
Total Submissions: 1438
Difficulty: Medium
Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.
Example 1: 
Input:

0 0 0
0 1 0
0 0 0
Output:
0 0 0
0 1 0
0 0 0
Example 2: 
Input:

0 0 0
0 1 0
1 1 1
Output:
0 0 0
0 1 0
1 2 1
Note:
The number of elements of the given matrix will not exceed 10,000.
There are at least one 0 in the given matrix.
The cells are adjacent in only four directions: up, down, left and right.
 */
//SolvedOn20170318SatNight CodingDuration:1h27m46s56
