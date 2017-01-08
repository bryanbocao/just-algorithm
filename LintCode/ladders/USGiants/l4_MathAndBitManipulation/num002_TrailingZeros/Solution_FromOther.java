package ladders.USGiants.l4_MathAndBitManipulation.num002_TrailingZeros;

public class Solution_FromOther {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        long r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
}
//http://www.lintcode.com/en/problem/trailing-zeros/
/*
Trailing Zeros

 Description
 Notes
 Testcase
 Judge
Write an algorithm which computes the number of trailing zeros in n factorial.

Have you met this question in a real interview? Yes
Example
11! = 39916800, so the out should be 2

Challenge 
O(log N) time

Tags 
Mathematics
*/
//From https://discuss.leetcode.com/topic/6511/o-log_5-n-solution-java
//From https://discuss.leetcode.com/user/eugene2
