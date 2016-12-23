package ladders.USGiants.l2_IntegerArray.num056_TwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
    	int[] resultArr = new int[2];
        Map<Integer, Integer> valueIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
        	Set<Integer> keySet = valueIndexMap.keySet();
        	if (keySet.isEmpty()) valueIndexMap.put(numbers[i], i);
        	else {
        		int diff = target - numbers[i];
        		if (keySet.contains(diff)) {
        			int i0 = valueIndexMap.get(diff) + 1, i1 = i + 1;
        			if (i0 > i1) {
        				int t = i0;
        				i0 = t;
        				t = i1;
        			}
        			resultArr[0] = i0;
        			resultArr[1] = i1;
        			return resultArr;
        		}
        		else valueIndexMap.put(numbers[i], i);
        	}
        }
        return resultArr;
    }
}
//https://www.lintcode.com/en/problem/two-sum/
/*
Two Sum

Description
Notes
Testcase
Judge
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are NOT zero-based.

Notice

You may assume that each input would have exactly one solution

Have you met this question in a real interview? Yes
Example
numbers=[2, 7, 11, 15], target=9

return [1, 2]

Challenge 
Either of the following solutions are acceptable:

O(n) Space, O(nlogn) Time
O(n) Space, O(n) Time
Tags 
Sort Hash Table Airbnb Array Facebook Two Pointers
Related Problems 
Medium 3Sum Closest 31 %
Medium 4Sum 21 %
Medium 3Sum 20 %
*/
//SolvedOn20161222Thu CodingDuration:14m24s71 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
