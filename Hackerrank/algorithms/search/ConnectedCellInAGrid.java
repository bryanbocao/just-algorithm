package algorithms.search;
import java.util.*;
public class ConnectedCellInAGrid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();
		int[][] mtx = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mtx[i][j] = sc.nextInt();
			}
		}
		int max = 0, tempMax = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (mtx[i][j] == 1) tempMax = countThisConnection(mtx, i, j);
				if (tempMax > max) max = tempMax;
			}
		}
		System.out.println(max);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mtx[i][j] + "　");
			}
			System.out.println();
		}
		sc.close();
	}
	
	private static int countThisConnection(int[][] mtx, int it, int jt) {
		mtx[it][jt] = 0;
		int cnt = 0;
		for (int i = it - 1 < 0 ? 0 : it - 1; i < mtx.length && i <= it + 1; i++) {
			for (int j = jt - 1 < 0 ? 0 : jt - 1 ; j < mtx[0].length && j <= jt + 1; j++) {
				if (mtx[i][j] == 1) {
					mtx[i][j] = 0;
					cnt += countThisConnection(mtx, i, j);
				}
			}
		}
		return cnt + 1;
	}

}
//https://www.hackerrank.com/challenges/connected-cell-in-a-grid
//20160615Wed14:26 duration:1m57s65 Accepted @BryanBo-Cao
