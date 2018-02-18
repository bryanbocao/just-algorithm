package num010_RegularExpressionMatching;

public class Solution_FromOther {
	public boolean isMatch(String s, String p) {
        char[] cs = s.toCharArray(), pattern = p.toCharArray();

        boolean[][] T = new boolean[cs.length + 1][pattern.length + 1];
        
        T[0][0] = true;
        //Deals with patterns like a* or a*b* or a*b*c*
        for (int i = 1; i < T[0].length; i++)
            if (pattern[i - 1] == '*') T[0][i] = T[0][i - 2];

        //Note that indexes in 'T' should minus one for the corresponding elements in 'cs' or 'pattern'
        //For instance, the current element T[i][j] corresponds to cs[i - 1] and pattern[j - 1]
        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (pattern[j - 1] == '.' || cs[i - 1] == pattern[j - 1]) T[i][j] = T[i - 1][j - 1];
                else if (pattern[j - 1] == '*') {
                    T[i][j] = T[i][j - 2];
                    if (pattern[j - 2] == cs[i - 1] || pattern[j - 2] == '.') T[i][j] = T[i][j] || T[i - 1][j];
                } else T[i][j] = false;
            }
        }
        
        return T[cs.length][pattern.length];
    }
}
/*
https://leetcode.com/problems/regular-expression-matching
10. Regular Expression Matching
DescriptionHintsSubmissionsDiscussSolution
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
*/
//From https://www.youtube.com/watch?v=l3hda49XcDE

