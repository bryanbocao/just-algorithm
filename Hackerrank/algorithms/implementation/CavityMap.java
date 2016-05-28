package algorithms.implementation;

import java.util.*;
public class CavityMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] map = new char[n][n];
		for (int i = 0; i < n; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i - 1 < 0 || map[i - 1][j] >= map[i][j]) continue;
				if (j - 1 < 0 || map[i][j - 1] >= map[i][j]) continue;					
				if (i + 1 >= n || map[i + 1][j] >= map[i][j]) continue;						
				if (j + 1 >= n || map[i][j + 1] >= map[i][j]) continue;
				map[i][j] = 'X';
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
//20160526Thu14:13 duration:19m33s02