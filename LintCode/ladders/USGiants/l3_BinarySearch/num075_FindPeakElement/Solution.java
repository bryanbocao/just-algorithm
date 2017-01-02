package ladders.USGiants.l3_BinarySearch.num075_FindPeakElement;

class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int len = A.length;
        if (A == null || len == 0) return -1;
        if (len == 1) return 0;
        if (A[0] > A[1]) return 0;
        if (A[len - 1] > A[len - 2]) return len -1;
        
        // A.length >= 3
        for (int pre_i = 0, crnt_i = 1, post_i = 2; post_i < len; pre_i++, crnt_i++, post_i++)
            if (A[pre_i] < A[crnt_i] && A[crnt_i] > A[post_i]) return crnt_i;
        
        return -1;
    }
}

//https://www.lintcode.com/en/problem/find-peak-element/
/*
Find Peak Element

 Description
 Notes
 Testcase
 Judge
There is an integer array which has the following features:

The numbers in adjacent positions are different.
A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
We define a position P is a peek if:

A[P] > A[P-1] && A[P] > A[P+1]
Find a peak element in this array. Return the index of the peak.

 Notice

The array may contains multiple peeks, find any of them.

Have you met this question in a real interview? Yes
Example
Given [1, 2, 1, 3, 4, 5, 7, 6]

Return index 1 (which is number 2) or 6 (which is number 7)

Challenge 
Time complexity O(logN)

Tags 
Binary Search LintCode Copyright Array Google
*/
//SolvedOn20170102Mon CodingDuration:7m40s50 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
//Time Complexity: O(n)