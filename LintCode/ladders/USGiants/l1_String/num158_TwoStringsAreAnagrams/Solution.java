package ladders.USGiants.l1_String.num158_TwoStringsAreAnagrams;

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s.length() != t.length()) return false;
        StringBuilder sb_t = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
        	int idx = sb_t.indexOf(s.substring(i, i + 1));
            if (idx == -1) return false;
            sb_t.replace(idx, idx + 1, "0");
        }
        return true;
    }
}
//https://www.lintcode.com/en/problem/two-strings-are-anagrams/
/*
Write a method anagram(s,t) to decide if two strings are anagrams or not.

Have you met this question in a real interview? Yes
Clarification
What is Anagram?
- Two strings are anagram if they can be the same after change the order of characters.

Example
Given s = "abcd", t = "dcab", return true.
Given s = "ab", t = "ab", return true.
Given s = "ab", t = "ac", return false.

Challenge 
O(n) time, O(1) extra space
 */
//SolvedOn20161221Wed CodingDuration:10m21s47 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao


