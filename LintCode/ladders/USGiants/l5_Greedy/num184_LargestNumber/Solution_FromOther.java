package ladders.USGiants.l5_Greedy.num184_LargestNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_FromOther {
    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i]+"";
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s1.compareTo(s2);
            }
        });
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i]+res;
        }
        return res;
    }
}
//http://www.lintcode.com/en/problem/largest-number/
/*
 Largest Number

 Description
 Notes
 Testcase
 Judge
Given a list of non negative integers, arrange them such that they form the largest number.

 Notice

The result may be very large, so you need to return a string instead of an integer.

Have you met this question in a real interview? Yes
Example
Given [1, 20, 23, 4, 8], the largest formed number is 8423201.

Challenge 
Do it in O(nlogn) time complexity.

Tags 
Sort
*/

//From https://discuss.leetcode.com/topic/32442/share-my-fast-java-solution-beat-98-64
//Author: https://discuss.leetcode.com/user/monkeygocrazy