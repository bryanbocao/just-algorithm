package leetCodeWeeklyContest30.problem2.num560_SubarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

public class Solution_FromOther {
	public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
            
        }
        
        return result;
        
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-30/problems/subarray-sum-equals-k/
560. Subarray Sum Equals K My SubmissionsBack To Contest
User Accepted: 673
User Tried: 889
Total Accepted: 1272
Total Submissions: 2810
Difficulty: Medium
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
/*
From https://discuss.leetcode.com/topic/87850/java-solution-presum-hashmap
Author https://discuss.leetcode.com/user/shawngao
*/