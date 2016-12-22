package ladders.USGiants.l1_String.num079_LongestCommonSubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        int max = 0;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < A.length(); i++)
            for (int j = i + 1; j <= A.length(); j++) set.add(A.substring(i, j));
        
        for (int i = 0; i < B.length(); i++)
            for (int j = i + 1; j <= B.length(); j++) {
                String ss_B = B.substring(i, j);
                if (set.contains(ss_B) && ss_B.length() > max) max = ss_B.length();
            }
            
        return max;
    }
}
//https://www.lintcode.com/en/problem/longest-common-substring/
/*
Longest Common Substring

Description
Notes
Testcase
Judge
Given two strings, find the longest common substring.

Return the length of it.

Notice

The characters in substring should occur continuously in original string. This is different with subsequence.

Have you met this question in a real interview? Yes
Example
Given A = "ABCD", B = "CBCE", return 2.

Challenge 
O(n x m) time and memory.

Tags 
String LintCode Copyright
Related Problems 
Medium Longest Common Subsequence
*/
//SolvedOn20161221Wed CodingDuration:3m14s36 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao