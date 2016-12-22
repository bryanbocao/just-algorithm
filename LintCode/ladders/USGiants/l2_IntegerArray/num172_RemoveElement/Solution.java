package ladders.USGiants.l2_IntegerArray.num172_RemoveElement;

public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int i = 0, len = A.length, last_exchange_i = len - 1;
        while (i < last_exchange_i + 1) {
            if (A[i] == elem) {
                int t = A[i];
                A[i] = A[last_exchange_i];
                A[last_exchange_i--] = t;
                len--;
            } else i++;
        }
        return len;
    }
}
//https://www.lintcode.com/en/problem/remove-element/
/*
Remove Element

Description
Notes
Testcase
Judge
Given an array and a value, remove all occurrences of that value in place and return the new length.

The order of elements can be changed, and the elements after the new length don't matter.

Have you met this question in a real interview? Yes
Example
Given an array [0,4,4,0,0,2,4,4], value=4

return 4 and front four elements of the array is [0,0,0,2]

Tags 
Two Pointers Array
Related Problems 
Easy Move Zeroes 30 %
Easy Remove Duplicates from Sorted Array II 30 %
Easy Remove Duplicates from Sorted Array 32 %
*/
//SolvedOn20161222Thu CodingDuration:4m37s10 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao