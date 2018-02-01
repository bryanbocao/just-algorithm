package num448_FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

class Solution_FromOther {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int i_in_v = Math.abs(nums[i]) - 1;
            if (nums[i_in_v] > 0) nums[i_in_v] = -nums[i_in_v];
        }
        
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0) res.add(i + 1);
        return res;
    }
}
/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
448. Find All Numbers Disappeared in an Array
DescriptionHintsSubmissionsDiscussSolution
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */
//Modified from https://discuss.leetcode.com/topic/65738/java-accepted-simple-solution
//Author https://discuss.leetcode.com/user/mnv-koundinya