package ladders.USGiants.l5_Greedy.num182_DeleteDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        char[] cs = A.toCharArray();
        Arrays.sort(cs);
        List<Character> ls = new ArrayList<Character>();
        for (int i = 0, remain = cs.length - k; i < cs.length && remain > 0; i++, remain--)
            ls.add(cs[i]);
        
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
        	char c = A.charAt(i);
        	if (ls.contains(c)) {
        		result *= 10;
        		result += (int) c - 48;
        		ls.remove(new Character(c));
        	}
        }
        return Integer.toString(result);
    }
}
//http://www.lintcode.com/en/problem/delete-digits/
/*
Delete Digits

 Description
 Notes
 Testcase
 Judge
Given string A representative a positive integer which has N digits, remove any k digits of the number, the remaining digits are arranged according to the original order to become a new positive integer.

Find the smallest integer after remove k digits.

N <= 240 and k <= N,

Have you met this question in a real interview? Yes
Example
Given an integer A = "178542", k = 4

return a string "12"

Tags 
Greedy LintCode Copyright
*/
//TriedOn20170108Sun CodingDuration: 11m31s22 WrongAnswer
/*
Wrong Answer


Total Runtime: 565 ms
35% test cases passed.
Input
254193, 1
Output
25413
Expected
24193

*/