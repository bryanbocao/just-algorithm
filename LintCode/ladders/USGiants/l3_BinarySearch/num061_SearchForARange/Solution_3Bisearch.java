package ladders.USGiants.l2_IntegerArray.num061_SearchForARange;

public class Solution_3Bisearch {
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
            int len = A.length, lo = 0, hi = len - 1;
            
            //bisearch
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
                
                //bisearch the left corner index
                int left_lo = 0, left_hi = hit, left_mid = left_lo + (left_hi - left_lo) / 2;
                if (left_hi - 1 >= 0 && A[left_hi - 1] == target) {
                    while (left_lo <= left_hi) {
                        left_mid = left_lo + (left_hi - left_lo) / 2;
                        if (target == A[left_mid]) {
                            if (left_mid == 0 || A[left_mid - 1] < A[left_mid]) break; // left_mid is already the left corner
                            else if (A[left_mid - 1] == A[left_mid]) left_hi = left_mid - 1; 
                        } else if (target < A[left_mid]) left_hi = left_mid - 1;
                        else left_lo = left_mid + 1;
                    }
                    left_hi = left_mid;
                }                
                
                //bisearch the right corner index
                int right_lo = hit, right_hi = A.length - 1, right_mid = right_lo + (right_hi - right_lo) / 2;
                if (right_lo + 1 < len && A[right_lo + 1] == target) {
                    while (right_lo <= right_hi) {
                        right_mid = right_lo + (right_hi - right_lo) / 2;
                        if (target == A[right_mid]) {
                            if (right_mid == len - 1 || A[right_mid] < A[right_mid + 1]) break; // right_mid is already the left corner
                            else if (A[right_mid + 1] == A[right_mid]) right_lo = right_mid + 1;   
                        } else if (target < A[right_mid]) right_hi = right_mid - 1;
                        else right_lo = right_mid + 1;
                    }
                    right_lo = right_mid;
                }
                result[0] = left_hi;
                result[1] = right_lo;
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
//SolvedOn20170102Mon CodingDuration:23m38s75 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao

