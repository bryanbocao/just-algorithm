package ladders.USGiants.l5_Greedy.num082_SingleNumber;

public class Solution_FromOther_MyRevision {
    /**
      *@param A : an integer array
      *return : a integer 
      */
    public int singleNumber(int[] A) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < A.length; i++) result ^= A[i];
        return result;
    }
}
//http://www.lintcode.com/en/problem/single-number/
/*
Single Number

 Description
 Notes
 Testcase
 Judge
Given 2*n + 1 numbers, every numbers occurs twice except one, find it.

Have you met this question in a real interview? Yes
Example
Given [1,2,2,1,3,4,3], return 4

Challenge 
One-pass, constant extra space.

Tags 
Greedy
*/
//Revised from https://discuss.leetcode.com/topic/1916/my-o-n-solution-using-xor
//Author: https://discuss.leetcode.com/user/ivantsang