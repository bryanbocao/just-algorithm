package ladders.USGiants.l2_IntegerArray.num183_WoodCut;

import java.util.Arrays;

public class Solution_FromOther {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
      *return: The maximum length of the small pieces.
      */
     public int woodCut(int[] L, int k) {
         // write your code here
        if (L == null || L.length == 0 || k <= 0) return 0;
        Arrays.sort(L);
        int l = 1, r = L[L.length - 1];
        while (l <= r) {
            int m = l + (r - l)/2;
            if (calc(L, m) >= k) l = m + 1;
            else r = m - 1;
        }
        return r;
    }
    
    public int calc(int[] L, int len) {
        int res = 0;
        for (int i = 0; i < L.length; i++) res += L[i] / len;
        return res;
    }
}
//https://www.lintcode.com/en/problem/wood-cut/
/*
 Wood Cut

 Description
 Notes
 Testcase
 Judge
Accepted


Total Runtime: 2360 ms
100% test cases passed.
Unsolved Related Problems
34 % 160. Find Minimum in Rotated Sorted Array II Medium
40 % 63. Search in Rotated Sorted Array II Medium
29 % 76. Longest Increasing Subsequence Medium
38 % 93. Balanced Binary Tree Easy
22 % 95. Validate Binary Search Tree Medium
Share your acceptance to your friends!
10
*/
//From http://www.cnblogs.com/EdwardLiu/p/5104287.html