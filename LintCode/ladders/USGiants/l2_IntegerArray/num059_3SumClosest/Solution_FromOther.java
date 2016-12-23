package ladders.USGiants.l2_IntegerArray.num059_3SumClosest;

import java.util.Arrays;

public class Solution_FromOther {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] num, int target) {
        // write your code here
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
//https://www.lintcode.com/en/problem/3sum-closest/
/*
3Sum Closest

Description
Notes
Testcase
Judge
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers.

Notice

You may assume that each input would have exactly one solution.

Have you met this question in a real interview? Yes
Example
For example, given array S = [-1 2 1 -4], and target = 1. The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Challenge 
O(n^2) time, O(1) extra space

Tags 
Two Pointers Sort Array
Related Problems 
Medium 3Sum 20 %
Medium Two Sum 28 %
*/
//from https://discuss.leetcode.com/topic/5192/java-solution-with-o-n2-for-reference
//from https://discuss.leetcode.com/user/chase1991