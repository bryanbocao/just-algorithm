package ladders.USGiants.l4_MathAndBitManipulation.num114_UniquePaths;

public class Solution_FromOther {
    public boolean checkPowerOf2(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
//http://www.lintcode.com/en/problem/unique-paths/
/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

 Notice

m and n will be at most 100.

Have you met this question in a real interview? Yes

Tags 
Dynamic Programming Array
*/
//From https://discuss.leetcode.com/topic/5623/java-dp-solution-with-complexity-o-n-m/3
//From https://discuss.leetcode.com/user/zihan
