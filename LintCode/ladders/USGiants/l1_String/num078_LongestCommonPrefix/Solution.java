package ladders.USGiants.l1_String.num078_LongestCommonPrefix;
public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        int len = strs.length;
        if (len == 0) return "";
        if (len == 1) return strs[0];
        String longestCommonPrefix = new String();
        for (String s : strs) {
            if (s.isEmpty()) return "";
            if (longestCommonPrefix.isEmpty()) longestCommonPrefix = new String(s);
            else {
                int last_one_more_index = getFirstUncommonStringLastCharIndex(longestCommonPrefix, s);
                if (last_one_more_index < longestCommonPrefix.length()) longestCommonPrefix = s.substring(0, last_one_more_index);
            }
        }
        return longestCommonPrefix;
    }
    
    private int getFirstUncommonStringLastCharIndex(String s0, String s1) {
        int min_Len = s0.length() < s1.length() ? s0.length() : s1.length();
        for (int i0 = 0, i1 = 0; i0 < min_Len && i1 < min_Len; i0++, i1++)
            if (s0.charAt(i0) != s1.charAt(i1)) return i0;
        return min_Len;   
    }
}
//https://www.lintcode.com/en/problem/longest-common-prefix/
/*
Longest Common Prefix

Description
Notes
Testcase
Judge
Given k strings, find the longest common prefix (LCP).

Have you met this question in a real interview? Yes
Example
For strings "ABCD", "ABEF" and "ACEF", the LCP is "A"

For strings "ABCDEFG", "ABCEFG" and "ABCEFA", the LCP is "ABC"

Tags 
Enumeration Basic Implementation String LintCode Copyright
*/
//SolvedOn20161221Wed CodingDuration:27m20s58 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao