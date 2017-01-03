package ladders.USGiants.l2_IntegerArray.num183_WoodCut;

import java.util.Arrays;

public class Revised_Solution_FromOther {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
      *return: The maximum length of the small pieces.
      */
    public int woodCut(int[] L, int k) {
        // write your code here
        if (L == null || L.length == 0 || k <= 0) return 0;
        Arrays.sort(L);
        int lo = 1, hi = L[L.length - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (calc(L, mid) >= k) lo = mid + 1;
            else hi = mid - 1;
        }
        return hi;
    }
    
    private int calc(int[] L, int len) {
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