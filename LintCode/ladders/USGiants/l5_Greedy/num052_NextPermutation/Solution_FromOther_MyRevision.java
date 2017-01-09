package ladders.USGiants.l4_MathAndBitManipulation.num052_NextPermutation;

public class Solution_FromOther_MyRevision {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public int[] nextPermutation(int[] A) {
        // write your code here
        if (A == null || A.length == 0) return null;
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1]) i--; // Find 1st id i that breaks descending order
        if (i >= 0) {                           // If not entirely descending
            int j = A.length - 1;              // Start from the end
            while (A[j] <= A[i]) j--;           // Find rightmost first larger id j
            swap(A, i, j);                     // Switch i and j
        }
        reverse(A, i + 1, A.length - 1);       // Reverse the descending sequence
        return A;
    }
    
    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }
}
//http://www.lintcode.com/en/problem/next-permutation/
/*
Next Permutation

 Description
 Notes
 Testcase
 Judge
Given a list of integers, which denote a permutation.

Find the next permutation in ascending order.

 Notice

The list may contains duplicate integers.

Have you met this question in a real interview? Yes
Example
For [1,3,2,3], the next permutation is [1,3,3,2]

For [4,3,2,1], the next permutation is [1,2,3,4]

Tags 
LintCode Copyright Permutation
*/
//Revised from https://discuss.leetcode.com/topic/30212/easiest-java-solution
//Author: https://discuss.leetcode.com/user/yavinci