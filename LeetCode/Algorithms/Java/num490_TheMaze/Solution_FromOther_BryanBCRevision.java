package num490_TheMaze;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_FromOther_BryanBCRevision {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
    	int row = maze.length, col = maze[0].length;
    	int[] s = start, d = destination;
        boolean[][] visited = new boolean[row][col];
        int[][] dirs={{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        Queue<int[]> queue = new LinkedList <>();
        queue.offer(s);
        visited[s[0]][s[1]] = true;
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            if (p[0] == d[0] && p[1] == d[1])
                return true;
            for (int[] dir: dirs) {
                int nx = p[0] + dir[0];
                int ny = p[1] + dir[1];
                while (nx >= 0 && ny >= 0 && nx < row && ny < col && maze[nx][ny] == 0) {
                    nx += dir[0];
                    ny += dir[1];
                }
                int[] back = new int[] {nx - dir[0], ny - dir[1]};
                if (!visited[back[0]][back[1]]) {
                    queue.add(back);
                    visited[back[0]][back[1]] = true;
                }
            }
        }
        return false;
    }
}
/*
https://leetcode.com/problems/the-maze/#/description
490. The Maze
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
There is a ball in a maze with empty spaces and walls. The ball can go through empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall. When the ball stops, it could choose the next direction.

Given the ball's start position, the destination and the maze, determine whether the ball could stop at the destination.

The maze is represented by a binary 2D array. 1 means the wall and 0 means the empty space. You may assume that the borders of the maze are all walls. The start and destination coordinates are represented by row and column indexes.

Example 1

Input 1: a maze represented by a 2D array

0 0 1 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 1 1
0 0 0 0 0

Input 2: start coordinate (rowStart, colStart) = (0, 4)
Input 3: destination coordinate (rowDest, colDest) = (4, 4)

Output: true
Explanation: One possible way is : left -> down -> left -> down -> right -> down -> right.

Example 2

Input 1: a maze represented by a 2D array

0 0 1 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 1 1
0 0 0 0 0

Input 2: start coordinate (rowStart, colStart) = (0, 4)
Input 3: destination coordinate (rowDest, colDest) = (3, 2)

Output: false
Explanation: There is no way for the ball to stop at the destination.

Note:
There is only one ball and one destination in the maze.
Both the ball and the destination exist on an empty space, and they will not be at the same position initially.
The given maze does not contain border (like the red rectangle in the example pictures), but you could assume the border of the maze are all walls.
The maze contains at least 2 empty spaces, and both the width and height of the maze won't exceed 100.
*/
//From https://leetcode.com/problems/the-maze/#/solution
//Author https://leetcode.com/vinod23/
//PracticedOn20170725Tue 4Times