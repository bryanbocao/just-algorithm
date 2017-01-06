package ladders.USGiants.l4_MathAndBitManipulation.num142_O1CheckPowerOf2;

public class Revised_Solution_FromOther {
    public boolean checkPowerOf2(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
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
//From https://github.com/shawnfan/LintCode/blob/master/Java/O(1)%20Check%20Power%20of%202.java
//From https://github.com/shawnfan
