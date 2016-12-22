package ladders.USGiants.l2_IntegerArray.num138_SubarraySum;

import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    ls.add(i);
                    ls.add(j);
                    return ls;
                }
            }
        }
        return ls;
    }
}
//https://www.lintcode.com/en/problem/subarray-sum/
/*
Subarray Sum

Description
Notes
Testcase
Judge
Given an integer array, find a subarray where the sum of numbers is zero. Your code should return the index of the first number and the index of the last number.

Notice

There is at least one subarray that it's sum equals to zero.

Have you met this question in a real interview? Yes
Example
Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].

Tags 
Subarray Hash Table
Related Problems 
Medium Submatrix Sum 24 %
Medium Minimum Size Subarray Sum 26 %
Medium Subarray Sum Closest
*/
//SolvedOn2016122Thu CodingDuration:7m59s19 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao