package leetCodeWeeklyContest38.problem1;

import java.util.Arrays;

public class Solution_FromOther {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-38/problems/maximum-product-of-three-numbers/
628. Maximum Product of Three Numbers My SubmissionsBack To Contest
User Accepted: 1291
User Tried: 1427
Total Accepted: 1335
Total Submissions: 3079
Difficulty: Easy
Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:
Input: [1,2,3]
Output: 6
Example 2:
Input: [1,2,3,4]
Output: 24
Note:
The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
//From https://discuss.leetcode.com/topic/93690/java-easy-ac/4
