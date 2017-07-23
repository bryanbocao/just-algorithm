package leetCodeWeeklyContest42.problem3;

public class Solution {
    public int countSubstrings(String s) {
    	if (s == null) return 0;
        int len = s.length(), cnt = len;
        if (len > 0) {
        	for (int n = 2; n <= len; n++)
        		for (int i = 0; i <= len - n; i++)
        			if (isP(s.substring(i, i + n))) cnt++;
        }
        return cnt;
    }
    private boolean isP(String s) {
    	int len = s.length(), half_len = len / 2;
    	for (int b = 0, e = len - 1; b < half_len + 1; b++, e--)
    		if (s.charAt(b) != s.charAt(e)) return false;
    	return true;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-42/problems/palindromic-substrings/
647. Palindromic Substrings My SubmissionsBack to Contest
User Accepted: 966
User Tried: 1075
Total Accepted: 981
Total Submissions: 1758
Difficulty: Medium
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
Note:
The input string length won't exceed 1000.
 */
//SolvedOn20170722Sat CodingDuration:13m21s06 