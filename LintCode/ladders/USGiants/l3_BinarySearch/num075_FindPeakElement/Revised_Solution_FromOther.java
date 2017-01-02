package ladders.USGiants.l3_BinarySearch.num075_FindPeakElement;

class Revised_Solution_FromOther {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
	public int findPeak(int[] A) {
	    int len = A.length;
	    if (len == 1) return 0;
	    
	    int left = 0, right = len - 1;
	    while (right - left > 1) {
	        int mid = left + (right - left) / 2;
	        if (A[mid] < A[mid + 1]) left = mid + 1;
	        else right = mid;
	    }
	    
	    return (left == len - 1 || A[left] > A[left + 1]) ? left : right;
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
//from https://discuss.leetcode.com/topic/29329/java-solution-and-explanation-using-invariants/2
//from https://discuss.leetcode.com/user/cosmin79