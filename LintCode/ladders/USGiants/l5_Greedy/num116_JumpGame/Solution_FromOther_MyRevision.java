package ladders.USGiants.l4_MathAndBitManipulation.num116_JumpGame;

public class Solution_FromOther_MyRevision {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
        int max = 0;
        for (int i = 0; i < A.length; i++){
            if (i > max) return false;
            max = Math.max(A[i] + i, max);
        }
        return true;
    }
}
//http://www.lintcode.com/en/problem/jump-game/
/*
Jump Game

 Description
 Notes
 Testcase
 Judge
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

 Notice

This problem have two method which is Greedy and Dynamic Programming.

The time complexity of Greedy method is O(n).

The time complexity of Dynamic Programming method is O(n^2).

We manually set the small data set to allow you pass the test in both ways. This is just to let you learn how to use this problem in dynamic programming ways. If you finish it in dynamic programming ways, you can try greedy method to make it accept again.

Have you met this question in a real interview? Yes
Example
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

Tags 
Greedy Dynamic Programming Array
*/
//Revised from https://discuss.leetcode.com/topic/7661/java-solution-easy-to-understand
//Author: https://discuss.leetcode.com/user/xniu