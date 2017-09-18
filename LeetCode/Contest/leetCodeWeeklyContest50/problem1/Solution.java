package leetCodeWeeklyContest50.problem1;

class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        char[] cs = s.toCharArray();
        
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
        	if (cs[i] != cs[j]) {
                
                boolean foundUnvalidDeletingJ = false;
        		// delete j
        		for (int ii = i, jj = j - 1; ii <= jj; ii++, jj--)
        			if (cs[ii] != cs[jj]) {
                        foundUnvalidDeletingJ = true;
                        break;
                    }
                
                if (!foundUnvalidDeletingJ) return true;
                
                boolean foundUnvalidDeletingI = false;
        		// delete i
        		for (int ii = i + 1, jj = j; ii <= jj; ii++, jj--)
        			if (cs[ii] != cs[jj]) {
                        foundUnvalidDeletingI = true;
                        break;
                    }
                
        		if (!foundUnvalidDeletingJ || !foundUnvalidDeletingI) return true;
                else return false;
        	}
        }
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
//SolvedOn20170918Mon

