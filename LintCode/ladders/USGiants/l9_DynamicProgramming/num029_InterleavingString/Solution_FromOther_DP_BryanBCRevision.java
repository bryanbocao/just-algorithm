package ladders.USGiants.l9_DynamicProgramming.num029_InterleavingString;

public class Solution_FromOther_DP_BryanBCRevision {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3) return false;
        boolean [][] interleaved = new boolean[len1 + 1][len2 + 1];
        interleaved[0][0] = true;

        for (int i = 1; i <= len1; i++) {
            if (s3.charAt(i - 1) == s1.charAt(i - 1) && interleaved[i - 1][0])
                interleaved[i][0] = true;
        }
        for (int j = 1; j <= len2; j++) {
            if (s3.charAt(j - 1) == s2.charAt(j - 1) && interleaved[0][j - 1])
                interleaved[0][j] = true;
        }

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (((s3.charAt(i + j - 1) == s1.charAt(i - 1) && interleaved[i - 1][j]))
                        || (s3.charAt(i + j - 1) == s2.charAt(j - 1) && interleaved[i][j - 1]))
                    interleaved[i][j] = true;
            }
        }

        return interleaved[len1][len2];
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
//From http://www.jiuzhang.com/solutions/interleaving-string/
//PracticedOn20170223Thu 5Times