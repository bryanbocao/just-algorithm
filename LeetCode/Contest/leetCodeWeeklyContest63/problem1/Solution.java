package leetCodeWeeklyContest63.problem1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (cost == null || len == 0) return 0;
        if (len == 1) return cost[0];
        if (len == 2) return Math.min(cost[0], cost[1]);
        
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++)
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        return Math.min(dp[len - 1], dp[len - 2]);
    }
}
/*
https://leetcode.com/contest/weekly-contest-63/problems/min-cost-climbing-stairs/
746. Min Cost Climbing Stairs My SubmissionsBack to Contest
User Accepted: 7
User Tried: 10
Total Accepted: 7
Total Submissions: 11
Difficulty: Easy
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
Note:
cost will have a length in the range [2, 1000].
Every cost[i] will be an integer in the range [0, 999].
 */
//SolvedOn20171216SatNight CodingDuration:17m11s96