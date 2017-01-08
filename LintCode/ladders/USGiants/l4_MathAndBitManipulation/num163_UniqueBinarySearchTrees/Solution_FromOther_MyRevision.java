package ladders.USGiants.l4_MathAndBitManipulation.num163_UniqueBinarySearchTrees;

public class Solution_FromOther_MyRevision {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
        if (n == 0) return 1;
        int [] G = new int[n + 1];
        G[0] = G[1] = 1;
        
        for (int i = 2; i <= n; ++i) {
        	for (int j = 1; j <= i; ++j) {
        		G[i] += G[j-1] * G[i-j];
        	}
        }
    
        return G[n];
    }
}
//http://www.lintcode.com/en/problem/unique-binary-search-trees/
/*
Unique Binary Search Trees

 Description
 Notes
 Testcase
 Judge
Given n, how many structurally unique BSTs (binary search trees) that store values 1...n?

Have you met this question in a real interview? Yes
Example
Given n = 3, there are a total of 5 unique BST's.

1           3    3       2      1
 \         /    /       / \      \
  3      2     1       1   3      2
 /      /       \                  \
2     1          2                  3
Tags 
Catalan Number Dynamic Programming
Related Problems 
Medium Generate Parentheses 35 %
Easy First Position of Target
*/
//Revised from https://discuss.leetcode.com/topic/8398/dp-solution-in-6-lines-with-explanation-f-i-n-g-i-1-g-n-i
//Author: https://discuss.leetcode.com/user/liaison