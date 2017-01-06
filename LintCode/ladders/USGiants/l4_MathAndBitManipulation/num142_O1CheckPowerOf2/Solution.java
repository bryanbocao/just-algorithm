package ladders.USGiants.l4_MathAndBitManipulation.num142_O1CheckPowerOf2;

public class Solution {
    public boolean checkPowerOf2(int n) {
        // write your code here
        if (n <= 0) return false;
        else if (n <= 2) return true;
        String bs = Integer.toBinaryString(n).substring(1);
        if (bs.contains("1")) return false;
        else return true;
    }
}
//http://www.lintcode.com/en/problem/o1-check-power-of-2/
/*
O(1) Check Power of 2

 Description
 Notes
 Testcase
 Judge
Using O(1) time to check whether an integer n is a power of 2.

Have you met this question in a real interview? Yes
Example
For n=4, return true;

For n=5, return false;

Challenge 
O(1) time

Tags 
Bit Manipulation
Related Problems 
Easy Count 1 in Binary
*/
//SolvedOn20170104Wed CodingDuration:4m14s36 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
 
