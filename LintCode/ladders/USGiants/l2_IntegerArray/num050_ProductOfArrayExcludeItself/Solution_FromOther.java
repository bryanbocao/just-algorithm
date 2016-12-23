package ladders.USGiants.l2_IntegerArray.num050_ProductOfArrayExcludeItself;

import java.util.ArrayList;

public class Solution_FromOther {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        //DP
        ArrayList<Long> res = new ArrayList<Long>();
        if(A == null || A.size() == 0){
            return res;
        }

        int n = A.size();
        //f[i]:product from i to end
        long[] f = new long[n];
        f[n - 1] = A.get(n - 1);
        for(int i = n - 2; i >= 0; i--){
            f[i] = A.get(i) * f[i + 1];
        }

        //从开头到当前元素之前的元素之积
        long now = 1;
        //从开头到当前元素之积
        long temp = 1;
        for(int i = 0; i < n; i++){
            now = temp;
            if(i + 1 < n){
                res.add(now * f[i + 1]);
            }else{
                res.add(now);
            }
            temp = now * A.get(i);
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