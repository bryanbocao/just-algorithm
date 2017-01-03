package ladders.USGiants.l3_BinarySearch.num159_FindMinimumInRotatedSortedArray;

public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int len = nums.length;
        if (nums == null || len == 0) return -1;
        if (nums[0] < nums[len - 1]) return nums[0];
        int lo_i = 0, hi_i = len - 1;
        while (lo_i <= hi_i) {
            int mid_i = lo_i + (hi_i - lo_i) / 2;
            if (mid_i + 1 < len && nums[mid_i] > nums[mid_i + 1]) return nums[mid_i + 1];
            else if (mid_i - 1 >= 0 && nums[mid_i - 1] > nums[mid_i]) return nums[mid_i];
            else if (nums[mid_i] > nums[lo_i]) lo_i = mid_i + 1;
            else hi_i = mid_i - 1;
        }
        return -1;
    }
}
//http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/#
/*
Find Minimum in Rotated Sorted Array

 Description
 Notes
 Testcase
 Judge
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

 Notice

You may assume no duplicate exists in the array.

Have you met this question in a real interview? Yes
Example
Given [4, 5, 6, 7, 0, 1, 2] return 0

Tags 
Binary Search
Related Problems 
Medium Find Minimum in Rotated Sorted Array II 34 %
Medium Search in Rotated Sorted Array II
*/
//SolvedOn20170101SunAt23:31 CodingDuration:9m20s56 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao

