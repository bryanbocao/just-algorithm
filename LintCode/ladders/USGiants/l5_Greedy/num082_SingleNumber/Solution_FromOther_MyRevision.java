package ladders.USGiants.l5_Greedy.num082_SingleNumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution_FromOther_MyRevision {
    /**
      *@param A : an integer array
      *return : a integer 
      */
    public int singleNumber(int[] A) {
        // Write your code here
        if (A == null || A.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) set.remove(A[i]);
            else set.add(A[i]);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}
//http://www.lintcode.com/en/problem/single-number/
/*
Single Number

 Description
 Notes
 Testcase
 Judge
Given 2*n + 1 numbers, every numbers occurs twice except one, find it.

Have you met this question in a real interview? Yes
Example
Given [1,2,2,1,3,4,3], return 4

Challenge 
One-pass, constant extra space.

Tags 
Greedy
*/
//SolvedOn20170108Sun CodingDuration:4m23s85 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
