package ladders.USGiants.l9_DynamicProgramming.num115_UniquePathsII;

public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length, col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        if (obstacleGrid[0][0] == 1) return 0;
        dp[0][0] = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0) {
                    if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else if ((i > 0 && dp[i - 1][0] == 1) || (j > 0 && dp[0][j - 1] == 1)) dp[i][j] = 1;
                } else if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if (obstacleGrid[i][j - 1] == 1 && obstacleGrid[i - 1][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[row - 1][col - 1];
    }
}
//http://www.lintcode.com/en/problem/unique-paths-ii/
/*
Unique Paths II

 Description
 Notes
 Testcase
 Judge
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

 Notice

m and n will be at most 100.

Have you met this question in a real interview? Yes
Example
For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.
 */
//SolvedOn20170304Sat10:25 Duration: 34m39s01
//Inspired by: https://www.youtube.com/watch?v=GO5QHC_BmvM
//@Author BryanBo-Cao github.com/bryanbo-cao/algorithms
