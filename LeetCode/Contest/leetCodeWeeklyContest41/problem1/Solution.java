package leetCodeWeeklyContest42.problem1;

public class Solution {
    public int[] findErrorNums(int[] nums) {
    	int len = nums.length;
        int[] res = new int[2], arr = new int[len];
        for (int i = 0; i < len; i++) {
            if (arr[nums[i] - 1] == nums[i]) res[0] = nums[i];
            else arr[nums[i] - 1] = nums[i];
        }
        for (int i = 0; i < len; i++)
            if (arr[i] == 0) res[1] = i + 1;
        return res;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-42/problems/set-mismatch/
645. Set Mismatch My SubmissionsBack to Contest
User Accepted: 1469
User Tried: 1604
Total Accepted: 1513
Total Submissions: 3783
Difficulty: Easy
The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Note:
The given array size will in the range [2, 10000].
The given array's numbers won't have any order.
*/
//SolvedOn20170722Sat