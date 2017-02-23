package ladders.USGiants.l9_DynamicProgramming.num029_InterleavingString;

public class Solution_FromOther_DFS_BryanBCRevision {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3) return false;
        return dfs(c1, c2, c3, 0, 0, 0, new boolean[len1 + 1][len2 + 1]);
    }

    private boolean dfs(char[] c1, char[] c2, char[] c3, int i, int j, int k, boolean[][] invalid) {
        if (invalid[i][j]) return false;
        if (k == c3.length) return true;
        boolean valid =
                (i < c1.length && c1[i] == c3[k] && dfs(c1, c2, c3, i + 1, j, k + 1, invalid)) ||
                        (j < c2.length && c2[j] == c3[k] && dfs(c1, c2, c3, i, j + 1, k + 1, invalid));
        if (!valid) invalid[i][j] = true;
        return valid;
    }
}
//http://www.lintcode.com/en/problem/interleaving-string/
/*
Interleaving String

 Description
 Notes
 Testcase
 Judge
Given three strings: s1, s2, s3, determine whether s3 is formed by the interleaving of s1 and s2.

Have you met this question in a real interview? Yes
Example
For s1 = "aabcc", s2 = "dbbca"

When s3 = "aadbbcbcac", return true.
When s3 = "aadbbbaccc", return false.

*/
//From https://discuss.leetcode.com/topic/31991/1ms-tiny-dfs-beats-94-57
//Author https://discuss.leetcode.com/user/yavinci
//PracicedOn20170223Thu 5Times