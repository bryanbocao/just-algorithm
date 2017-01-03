package ladders.USGiants.l2_IntegerArray.num061_SearchForARange;

public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] result = new int[2];
        int hit = -1;
        result[0] = hit;
        result[1] = hit;
        if (A != null && A.length > 0) {
            int lo = 0, hi = A.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (target == A[mid]) {
                    hit = mid;
                    break;
                } else if (target < A[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
            
            // found the target value
            if (lo <= hi) {
                int lo_target = hit, hi_target = hit;
                while (lo_target - 1 >= 0 && A[lo_target - 1] == target) lo_target--;
                while (hi_target + 1 < A.length && A[hi_target + 1] == target) hi_target++;
                result[0] = lo_target;
                result[1] = hi_target;
            }
        }
        
        return result;
    }
}
//https://www.lintcode.com/en/problem/search-for-a-range/
/*
Search for a Range

 Description
 Notes
 Testcase
 Judge
Given a sorted array of n integers, find the starting and ending position of a given target value.

If the target is not found in the array, return [-1, -1].

Have you met this question in a real interview? Yes
Example
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

Challenge 
O(log n) time.

Tags 
Binary Search Sorted Array Array
Related Problems 
 */
//SolvedOn20170102Mon CodingDuration:17m44s88 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao

