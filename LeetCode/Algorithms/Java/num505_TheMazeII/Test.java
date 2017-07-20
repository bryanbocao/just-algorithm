package num505_TheMazeII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_FromOther_BryanBCRevision s = new Solution_FromOther_BryanBCRevision();
//		Solution_FromOther s = new Solution_FromOther();
		int[][] maze = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
		int[] start = {0, 4};
		int[] destination = {4, 4};
		System.out.println(s.shortestDistance(maze, start, destination));
	}

}
