package leetCodeWeeklyContest50.problem1;

public class Solution_FromOther {
	public boolean validPalindrome(String s) {
	    int l = -1, r = s.length();
	    while (++l < --r) 
	        if (s.charAt(l) != s.charAt(r)) return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
	    return true;
	}

	public boolean isPalindromic(String s, int l, int r) {
	    while (++l < --r) 
	        if (s.charAt(l) != s.charAt(r)) return false;
	    return true;
	}
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-50/problems/valid-palindrome-ii/
680. Valid Palindrome II My SubmissionsBack to Contest
User Accepted: 1392
User Tried: 1912
Total Accepted: 1418
Total Submissions: 5853
Difficulty: Easy
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 */
/*
From https://discuss.leetcode.com/topic/103939/java-o-n-time-o-1-space
Author https://discuss.leetcode.com/user/compton_scatter
*/