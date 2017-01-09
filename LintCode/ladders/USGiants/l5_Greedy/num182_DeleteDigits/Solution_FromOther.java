package ladders.USGiants.l5_Greedy.num182_DeleteDigits;

public class Solution_FromOther {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        StringBuffer sb = new StringBuffer(A);
		int i, j;
		for (i = 0; i < k; i++) {
			for (j = 0; j < sb.length() - 1
					&& sb.charAt(j) <= sb.charAt(j + 1); j++) {
			}
			sb.delete(j, j + 1);
		}
        while (sb.length() > 1 && sb.charAt(0)=='0')
            sb.delete(0,1);
		return sb.toString();
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
//From http://www.jiuzhang.com/solutions/delete-digits/