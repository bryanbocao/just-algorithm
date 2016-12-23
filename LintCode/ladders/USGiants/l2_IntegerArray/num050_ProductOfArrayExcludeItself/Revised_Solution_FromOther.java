package ladders.USGiants.l2_IntegerArray.num050_ProductOfArrayExcludeItself;

import java.util.ArrayList;

public class Revised_Solution_FromOther {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        //DP
        ArrayList<Long> res = new ArrayList<Long>();
        if(A == null || A.size() == 0) return res;

        int len = A.size();
        //pdctIToEnd[i]:product from i to end
        long[] pdctIToEnd = new long[len];
        pdctIToEnd[len - 1] = A.get(len - 1);
        for(int i = len - 2; i >= 0; i--) pdctIToEnd[i] = A.get(i) * pdctIToEnd[i + 1];

        //product of numbers from 0 to the one before current element
        long pdct0ToPrev = 1;
        //product of numbers from 0 to current element
        long pdct0ToCrrnt = 1;
        for(int i = 0; i < len; i++){
        	pdct0ToPrev = pdct0ToCrrnt;
            if(i + 1 < len) res.add(pdct0ToPrev * pdctIToEnd[i + 1]);
            else res.add(pdct0ToPrev);
            pdct0ToCrrnt = pdct0ToPrev * A.get(i);
        }
        return res;
    }
}
//https://www.lintcode.com/en/problem/product-of-array-exclude-itself/
/*
Product of Array Exclude Itself

Description
Notes
Testcase
Judge
Given an integers array A.

Define B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1], calculate B WITHOUT divide operation.

Have you met this question in a real interview? Yes
Example
For A = [1, 2, 3], return [6, 3, 2].

Tags 
Forward-Backward Traversal LintCode Copyright
Related Problems 
Hard Paint House II
*/
//from https://zhengyang2015.gitbooks.io/lintcode/content/product_of_array_exclude_itself_50.html