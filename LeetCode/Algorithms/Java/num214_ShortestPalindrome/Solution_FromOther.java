package num214_ShortestPalindrome;

public class Solution_FromOther {
	public String shortestPalindrome(String s) {
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) == s.charAt(j)) j += 1;
        if (j == s.length()) return s;
        String suffix = s.substring(j);
        return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
    }
}
/*
https://leetcode.com/problems/shortest-palindrome/description/
214. Shortest Palindrome
DescriptionHintsSubmissionsDiscussSolution
Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

For example:

Given "aacecaaa", return "aaacecaaa".

Given "abcd", return "dcbabcd".

Credits:
Special thanks to @ifanchu for adding this problem and creating all test cases. Thanks to @Freezen for additional test cases.
*/
//From https://leetcode.com/problems/shortest-palindrome/discuss/60098/My-7-lines-recursive-Java-solution
