package num305_NumberOfIslandsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_FromOther {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        //use an array to hold root number of each island
        int[] roots = new int[m*n];
        //initialize the array with -1, so we know non negative number is a root number
        Arrays.fill(roots, -1);

        int[] xOffset = {0, 0, 1, -1};
        int[] yOffset = {1, -1, 0, 0};

        List<Integer> result = new ArrayList<Integer>();

        for(int[] position : positions){
            //for each input cell, its initial root number is itself
            roots[position[0]*n + position[1]] = position[0]*n + position[1];
            //count variable is used to count the island in current matrix.
            //firstly, we assume current input is an isolated island
            int count = result.isEmpty()? 1 : result.get(result.size()-1) + 1;
            //check neighbor cells
            for(int i = 0; i < 4; i++){
                int newX = xOffset[i] + position[0];
                int newY = yOffset[i] + position[1];
                //if we found one neighbor is a part of island
                if(newX >= 0 && newX < m && newY >= 0 && newY < n && roots[newX * n + newY] != -1){
                    //get the root number of this island
                    int root1 = find(newX * n + newY, roots);
                    //get the root number of input island
                    int root2 = roots[position[0]*n + position[1]];
                    //if root1 and root2 are different, then we can connect two isolated island together,
                    // so the num of island - 1
                    if(root1 != root2) count--;
                    //update root number accordingly
                    roots[root1] = root2;
                }
            }
            result.add(count); 
        }

        return result;
    }

    public int find(int target, int[] roots){
        //found root
        if(roots[target] == target) return target;
        //searching for root and update the cell accordingly
        roots[target] = find(roots[target], roots);
        //return root number
        return roots[target];
    }
}
/*
https://leetcode.com/problems/number-of-islands-ii
A 2d grid map of m rows and n columns is initially filled with water. We may perform an addLand operation which turns the water at position (row, col) into a land. Given a list of positions to operate, count the number of islands after each addLand operation. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example:

Given m = 3, n = 3, positions = [[0,0], [0,1], [1,2], [2,1]].
Initially, the 2d grid grid is filled with water. (Assume 0 represents water and 1 represents land).

0 0 0
0 0 0
0 0 0
Operation #1: addLand(0, 0) turns the water at grid[0][0] into a land.

1 0 0
0 0 0   Number of islands = 1
0 0 0
Operation #2: addLand(0, 1) turns the water at grid[0][1] into a land.

1 1 0
0 0 0   Number of islands = 1
0 0 0
Operation #3: addLand(1, 2) turns the water at grid[1][2] into a land.

1 1 0
0 0 1   Number of islands = 2
0 0 0
Operation #4: addLand(2, 1) turns the water at grid[2][1] into a land.

1 1 0
0 0 1   Number of islands = 3
0 1 0
We return the result as an array: [1, 1, 2, 3]

Challenge:

Can you do it in time complexity O(k log mn), where k is the length of the positions?
*/
//From https://discuss.leetcode.com/topic/29521/my-simple-union-find-solution
//Author https://discuss.leetcode.com/user/hpplayer