package ladders.USGiants.l9_DynamicProgramming.num118_DistinctSubsequences;

public class Solution_FromOther2 {
    public int numDistinct(String S, String T) {
        // array creation
        int[][] mem = new int[T.length()+1][S.length()+1];

        // filling the first row: with 1s
        for(int j=0; j<=S.length(); j++) {
            mem[0][j] = 1;
        }

        // the first column is 0 by default in every other rows but the first, which we need.

        for(int i=0; i<T.length(); i++) {
            for(int j=0; j<S.length(); j++) {
                if(T.charAt(i) == S.charAt(j)) {
                    mem[i+1][j+1] = mem[i][j] + mem[i+1][j];
                } else {
                    mem[i+1][j+1] = mem[i+1][j];
                }
            }
        }

        return mem[T.length()][S.length()];
    }
}
//http://www.lintcode.com/en/problem/distinct-subsequences/
/*
Distinct Subsequences

 Description
 Notes
 Testcase
 Judge
Given a string S and a string T, count the number of distinct subsequences of T in S.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

Have you met this question in a real interview? Yes
Example
Given S = "rabbbit", T = "rabbit", return 3.
*/
//From https://discuss.leetcode.com/topic/9488/easy-to-understand-dp-in-java
//Author https://discuss.leetcode.com/user/balint