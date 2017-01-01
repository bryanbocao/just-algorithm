package ladders.USGiants.l3_BinarySearch.num060_SearchInsertPosition;

public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int lo_i = 0, hi_i = A.length - 1;
        while (lo_i <= hi_i) {
            int mid_i = (hi_i + lo_i) / 2;
            if (A[mid_i] == target) return mid_i;
            else if (A[mid_i] < target) lo_i = mid_i + 1;
            else hi_i = mid_i - 1;
        }
        return lo_i;
    }
}
//http://www.lintcode.com/en/problem/search-insert-position/
/*
Search Insert Position

 Description
 Notes
 Testcase
 Judge
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume NO duplicates in the array.

Have you met this question in a real interview? Yes
Example
[1,3,5,6], 5 → 2

[1,3,5,6], 2 → 1

[1,3,5,6], 7 → 4

[1,3,5,6], 0 → 0

Challenge 
O(log(n)) time

Tags 
Binary Search Sorted Array Array
*/
//SolvedOn20170101MonAt01:24 CodingDuration:lessThan10Minutes @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
