package ladders.USGiants.l2_IntegerArray.num100_RemoveDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int len = nums.length;
        List<Integer> ls = new ArrayList<Integer>();
        for (int itg : nums) {
            if (ls.contains(itg)) len--;
            else ls.add(itg);
        }
        Iterator<Integer> it = ls.iterator();
        int i = 0;
        while (it.hasNext()) nums[i++] = it.next();
        return len;
    }
}
//https://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array/
/*
Remove Duplicates from Sorted Array

 Description
 Notes
 Testcase
 Judge
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

Have you met this question in a real interview? Yes
Example
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].

Tags 
Two Pointers Array Facebook
Related Problems 
Easy Remove Element 31 %
Easy Remove Duplicates from Sorted Array II
 */
//SolvedOn20161222Thu CodingDuration:2m39s20 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
