package ladders.USGiants.l3_BinarySearch.num062_SearchInRotatedSortedArray;

public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if (A == null || A.length ==0) return -1;
        int len = A.length, left = 0, right = len - 1, mid = left + (right - left) / 2, preLeft = left, preRight = right;
        while (left <= right) {
            if (A[mid] == target) return mid;
            if (A[left] == target) return left;
            if (A[right] == target) return right;
            
            mid = left + (right - left) / 2;
            
            if (A[left] < A[right]) {
                if (target < A[mid]) right = mid - 1;
                else if (A[mid] < target) left = mid + 1;
            } else {
                if (A[left] < A[mid]) {
                    if (target < A[mid]) {
                        if (A[left] < target) right = mid - 1;
                        else left = mid + 1;
                    } else if (A[mid] < target) left = mid + 1;
                } else if (A[left] > A[mid]) {
                    if (target < A[mid]) right = mid - 1;
                    else if (A[mid] < target) {
                        if (target < A[right]) left = mid + 1;
                        else right = mid - 1;
                    }
                }
            }
            
            if (preLeft == left && preRight == right) return -1;
            preLeft = left;
            preRight = right;
        }
        return mid;
    }
}
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
//TriedOn20170102Mon CodingDuration:36m11s08 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao

