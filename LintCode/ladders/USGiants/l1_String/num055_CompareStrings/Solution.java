package ladders.USGiants.l1_String.num055_CompareStrings;

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (B.length() > A.length()) return false;
        StringBuilder sb_A = new StringBuilder(A);
        for (int i = 0; i < B.length(); i++) {
            int idx = sb_A.indexOf(B.substring(i, i + 1));
            if (idx == -1) return false;
            sb_A.replace(idx, idx + 1, "0");
        }
        return true;
    }
}
//https://www.lintcode.com/en/problem/compare-strings/
/*
Compare two strings A and B, determine whether A contains all of the characters in B.

The characters in string A and B are all Upper Case letters.

 Notice

The characters of B in A are not necessary continuous or ordered.

Have you met this question in a real interview? Yes
Example
For A = "ABCD", B = "ACD", return true.

For A = "ABCD", B = "AABC", return false.

Tags 
Basic Implementation String LintCode Copyright
Related Problems 
Easy Two Strings Are Anagrams
 */
//SolvedOn20161221Wed CodingDuration:5m11s @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
