package leetCodeWeeklyContest25.problem2;

public class Solution {
    public String complexNumberMultiply(String a, String b) {
    	
        int aip = a.indexOf('+'), a0 = Integer.parseInt(a.substring(0, aip)), aii = a.indexOf('i'), a1;
        a1 = Integer.parseInt(a.substring(aip + 1, aii));
        
        int bip = b.indexOf('+'), b0 = Integer.parseInt(b.substring(0, bip)), bii = b.indexOf('i'), b1;
        b1 = Integer.parseInt(b.substring(bip + 1, bii));
        
        int c0 = a0 * b0 - a1 * b1, c1 = a0 * b1 + a1 * b0;
        return new String(c0 + "+" + c1 + "i");
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-25/problems/complex-number-multiplication/
/*
537. Complex Number Multiplication My SubmissionsBack To Contest
User Accepted: 989
User Tried: 1018
Total Accepted: 999
Total Submissions: 1473
Difficulty: Medium
Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
Note:

The input strings will not have extra blank.
The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 */
/*
Runtime Error Message:
Line 10: java.lang.NumberFormatException: For input string: "0i"
Last executed input:
"1+-1i"
"0+0i"

Runtime Error Message:
Line 9: java.lang.NumberFormatException: For input string: "-86+72"
Last executed input:
"78+-76i"
"-86+72i"

Runtime Error Message:
Line 9: java.lang.NumberFormatException: For input string: "-18+-10"
Last executed input:
"20+22i"
"-18+-10i"

Input:
"1+-1i"
"1+-1i"
Output:
"0+2i"
Expected:
"0+-2i"
*/
//TriedOn20170325SatNight CodingDuration:24m39s39