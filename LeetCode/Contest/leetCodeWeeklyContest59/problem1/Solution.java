package leetCodeWeeklyContest59.problem1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<Integer>();
        for (int n = left; n <= right; n++) {
        	int t_n = n;
        	boolean divisible = false;
        	while (t_n > 0) {
        		if (t_n == 0) break;
        		int d = t_n % 10;
        		if (n % d != 0) break;
        		if (t_n < 10) divisible = true;
        		t_n /= 10;
        	}
        	if (divisible) ls.add(n);
        }
        return ls;
    }
}
/*
https://leetcode.com/contest/weekly-contest-59/problems/self-dividing-numbers/
728. Self Dividing Numbers My SubmissionsBack to Contest
User Accepted: 0
User Tried: 0
Total Accepted: 0
Total Submissions: 0
Difficulty: Easy
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
//SolvedOn20171118Sat CodingDuration:12m35s76