package ladders.USGiants.l4_MathAndBitManipulation.num114_UniquePaths;

public class Revised_Solution_FromOther {
	/**
	* @param n, m: positive integer (1 <= n ,m <= 100)
	* @return an integer
	*/
	public int uniquePaths(int m, int n) {
	       if (m == 0 || n == 0) return 0;
	       if (m == 1 || n == 1) return 1;
	       
	       int[] dp = new int[n];
	       for (int i = 0; i < n; i++) dp[i] = 1;
	       for (int i = 1; i < m; i++)
	           for (int j = 1; j < n; j++) dp[j] += dp[j - 1];
	       return dp[n - 1];
	}
}

//http://www.lintcode.com/en/problem/unique-paths/
/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

 Notice

m and n will be at most 100.

Have you met this question in a real interview? Yes

Tags 
Dynamic Programming Array
*/
//From https://discuss.leetcode.com/topic/5623/java-dp-solution-with-complexity-o-n-m/3
//From https://discuss.leetcode.com/user/zihan
