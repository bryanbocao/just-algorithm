package leetCodeWeeklyContest36.problem3;

import java.util.Arrays;

public class Solution {
	public static int triangleNumber(int[] A) {
	    Arrays.sort(A);
	    int count = 0, n = A.length;
	    for (int i = n - 1; i >= 2; i--) {
	        int l = 0, r = i - 1;
	        while (l < r) {
	            if (A[l] + A[r] > A[i]) {
	                count += r - l;
	                r--;
	            }
	            else l++;
	        }
	    }
	    return count;
	}
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-36/problems/valid-triangle-number/
611. Valid Triangle Number My SubmissionsBack To Contest
User Accepted: 406
User Tried: 852
Total Accepted: 413
Total Submissions: 2454
Difficulty: Medium
Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Note:
The length of the given array won't exceed 1000.
The integers in the given array are in the range of [0, 1000].
*/
/*
From https://discuss.leetcode.com/topic/92099/java-o-n-2-time-o-1-space
Author https://discuss.leetcode.com/user/compton_scatter
O(n^2) Time, O(1) Space
*/
//PracticedOn20170611Sun 7Times