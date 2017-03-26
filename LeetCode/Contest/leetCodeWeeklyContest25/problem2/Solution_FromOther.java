package leetCodeWeeklyContest25.problem2;

import java.util.stream.Stream;

public class Solution_FromOther {
    public String complexNumberMultiply(String a, String b) {
        int[] coefs1 = Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray(), 
              coefs2 = Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        return (coefs1[0]*coefs2[0] - coefs1[1]*coefs2[1]) + "+" + (coefs1[0]*coefs2[1] + coefs1[1]*coefs2[0]) + "i";
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
//From https://discuss.leetcode.com/topic/84261/java-3-liner
//Author https://discuss.leetcode.com/user/compton_scatter