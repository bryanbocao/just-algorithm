package ladders.USGiants.l2_IntegerArray.num059_3SumClosest;

import java.util.Arrays;

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        
        Arrays.sort(numbers);
        int sum = -1;
        for (int i = 0; i + 2 < numbers.length; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) continue;
            int j = i + 1, k = numbers.length - 1;
            while (j < k) {
                int tSum = numbers[i] + numbers[j] + numbers[k];
                if (sum == -1) sum = tSum;
                else {
                    if (tSum < target) j++;
                    else k--;
                    if (Math.abs(tSum - target) < Math.abs(sum - target)) sum = tSum;
                }
            }
        }
        return sum;
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
//SolvedOn20161223Fri @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
