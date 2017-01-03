package ladders.USGiants.l3_BinarySearch.num062_SearchInRotatedSortedArray;

class Revised_Solution_FromOther {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if (A == null || A.length ==0) return -1;
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] == target) return mid;
            if (A[lo] < A[mid]) {
                if (target >= A[lo] && target < A[mid]) hi = mid - 1;
                else lo = mid + 1;
            } else {
                if (target > A[mid] && target <= A[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return A[lo] == target ? lo : -1;
    }
}
//https://www.lintcode.com/en/problem/find-peak-element/
//https://www.lintcode.com/en/problem/search-in-rotated-sorted-array/
/*
Search in Rotated Sorted Array

Description
Notes
Testcase
Judge
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Have you met this question in a real interview? Yes
Example
For [4, 5, 1, 2, 3] and target=1, return 2.

For [4, 5, 1, 2, 3] and target=0, return -1.

Challenge 
O(logN) time

Tags 
Binary Search Sorted Array Array LinkedIn Uber Facebook
Related Problems 
Medium Search in Rotated Sorted Array II 40 %
Easy Search a 2D Matrix
*/
//Inspired from https://discuss.leetcode.com/topic/7711/revised-binary-search