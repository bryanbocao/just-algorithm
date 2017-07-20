package num505_TheMazeII;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_FromOther_BryanBCRevision {
	
	class Point {
		int x, y, len;
		public Point(int x, int y, int len) {
			this.x = x;
			this.y = y;
			this.len = len;
		}
	}
	
	public int shortestDistance(int[][] maze, int[] start, int[] destination) {
    	int row = maze.length, col = maze[0].length;
    	int[][] lens = new int[row][col];
    	int[] s = start, d = destination;
        int[][] dirs={{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        for (int[] r: lens)
            Arrays.fill(r, Integer.MAX_VALUE);
       
        Queue<Point> queue = new PriorityQueue<>((o1, o2) -> o1.len - o2.len);
        queue.offer(new Point(s[0], s[1], 0));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (lens[p.x][p.y] <= p.len) continue;
            lens[p.x][p.y] = p.len;
            for (int[] dir: dirs) {
                int nx = p.x, ny = p.y, len = p.len;
                while (nx >= 0 && ny >= 0 && nx < row && ny < col && maze[nx][ny] == 0) {
                    nx += dir[0];
                    ny += dir[1];
                    len++;
                }
                queue.offer(new Point(nx - dir[0], ny - dir[1], --len));
            }
        }
        return lens[d[0]][d[1]] == Integer.MAX_VALUE ? -1 : lens[d[0]][d[1]];
    }
}
/*
https://leetcode.com/problems/the-maze-ii/#/description
505. The Maze II
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
There is a ball in a maze with empty spaces and walls. The ball can go through empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall. When the ball stops, it could choose the next direction.

Given the ball's start position, the destination and the maze, find the shortest distance for the ball to stop at the destination. The distance is defined by the number of empty spaces traveled by the ball from the start position (excluded) to the destination (included). If the ball cannot stop at the destination, return -1.

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

Output: 12
Explanation: One shortest way is : left -> down -> left -> down -> right -> down -> right.
             The total distance is 1 + 1 + 3 + 1 + 2 + 2 + 2 = 12.

Example 2

Input 1: a maze represented by a 2D array

0 0 1 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 1 1
0 0 0 0 0

Input 2: start coordinate (rowStart, colStart) = (0, 4)
Input 3: destination coordinate (rowDest, colDest) = (3, 2)

Output: -1
Explanation: There is no way for the ball to stop at the destination.

Note:
There is only one ball and one destination in the maze.
Both the ball and the destination exist on an empty space, and they will not be at the same position initially.
The given maze does not contain border (like the red rectangle in the example pictures), but you could assume the border of the maze are all walls.
The maze contains at least 2 empty spaces, and both the width and height of the maze won't exceed 100.
*/
//From https://discuss.leetcode.com/topic/77472/similar-to-the-maze-easy-understanding-java-bfs-solution
//Author https://discuss.leetcode.com/user/ckcz123
