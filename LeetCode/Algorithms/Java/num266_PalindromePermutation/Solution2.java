package num266_PalindromePermutation;

import java.util.Stack;

class Solution2 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(s.charAt(i))) set.remove(c);
            else set.add(c);
        }
        if (set.size() > 1) return false;
        else return true;
    }
}
/*
https://leetcode.com/problems/palindrome-permutation/description/
266. Palindrome Permutation
DescriptionHintsSubmissionsDiscussSolution
Given a string, determine if a permutation of the string could form a palindrome.

For example,
"code" -> False, "aab" -> True, "carerac" -> True.
 */
//SolvedOn20180201Fri CodingDuration:2m39s