package ladders.USGiants.l4_MathAndBitManipulation.num179_UpdateBits;

public class Solution_FromOther {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        // write your code here
        int ones = ~0;
        int mask = 0;
        if (j < 31) {
            int left = ones << (j + 1);
            int right = ((1 << i) - 1);
            mask = left | right;
        } else {
            mask = (1 << i) - 1;
        }
        return (n & mask) | (m << i);
    }
}
//http://www.lintcode.com/en/problem/update-bits/
/*
Update Bits

 Description
 Notes
 Testcase
 Judge
Given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits between i and j in N equal to M (e g , M becomes a substring of N located at i and starting at j)

 Notice

In the function, the numbers N and M will given in decimal, you should also return a decimal number.

Have you met this question in a real interview? Yes
Clarification
You can assume that the bits j through i have enough space to fit all of M. That is, if M=10011， you can assume that there are at least 5 bits between j and i. You would not, for example, have j=3 and i=2, because M could not fully fit between bit 3 and bit 2.

Example
Given N=(10000000000)2, M=(10101)2, i=2, j=6

return N=(10001010100)2

Challenge 
Minimum number of operations?

Tags 
Cracking The Coding Interview Bit Manipulation
Related Problems 
Hard Binary Representation
*/
//From https://www.kancloud.cn/kancloud/data-structure-and-algorithm-notes/72988
