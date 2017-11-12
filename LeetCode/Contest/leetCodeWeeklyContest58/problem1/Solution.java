package leetCodeWeeklyContest58.problem1;

class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if (nums == null || len == 0) return -1;
        int sumL = 0, sumR = 0;
        for (int i = 1; i < len; i++) sumR += nums[i];
        for (int i = 0; i < len; i++) {
            if (sumL == sumR) return i;
            sumL += nums[i];
            if (i + 1 < len) sumR -= nums[i + 1];
        }
        return -1;
    }
}
/*
https://leetcode.com/contest/weekly-contest-58/problems/find-pivot-index/
724. Find Pivot Index My SubmissionsBack to Contest
User Accepted: 1472
User Tried: 1590
Total Accepted: 1851
Total Submissions: 4462
Difficulty: Easy
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Example 1:
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
Example 2:
Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].
*/
//SolvedOn2017Nov11Mon CodingDuration:11m36s91+