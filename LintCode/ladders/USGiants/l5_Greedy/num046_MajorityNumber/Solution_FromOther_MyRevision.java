package ladders.USGiants.l5_Greedy.num046_MajorityNumber;

import java.util.ArrayList;

public class Solution_FromOther_MyRevision {
    
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        int major = nums.get(0), count = 1;
        for (int i = 1; i < nums.size(); i++){
            if (count == 0){
                count++;
                major = nums.get(i);
            } else if (major == nums.get(i)) count++;
            else count--;
        }
        return major;
    }
}
//http://www.lintcode.com/en/problem/majority-number/
/*
 Majority Number

 Description
 Notes
 Testcase
 Judge
Given an array of integers, the majority number is the number that occurs more than half of the size of the array. Find it.

 Notice

You may assume that the array is non-empty and the majority number always exist in the array.

Have you met this question in a real interview? Yes
Example
Given [1, 1, 1, 1, 2, 2, 2], return 1

Challenge 
O(n) time and O(1) extra space

Tags 
Greedy Enumeration LintCode Copyright Zenefits
*/
//Revised from https://discuss.leetcode.com/topic/8692/o-n-time-o-1-space-fastest-solution/2
