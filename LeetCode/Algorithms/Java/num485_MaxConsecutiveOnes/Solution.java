package num485_MaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        if (nums == null || len == 0) return 0;
        int maxSum = 0, sum = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) sum++;
            else {
                if (sum > maxSum) maxSum = sum;
                sum = 0;
            }
        }
        if (sum > maxSum) maxSum = sum;
        return maxSum;
    }
}
/*
https://leetcode.com/problems/max-consecutive-ones
485. Max Consecutive Ones
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
*/
//SolvedOn20170804Fri16:23 CodingDuration:4m25s96