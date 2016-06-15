package algorithms.search;
import java.util.*;
public class ConnectedCellInAGrid20160615Wed1121 {

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
		sc.close();
	}
	
	private static int countThisConnection(int[][] mtx, int it, int jt) {
		mtx[it][jt] = 0;
		for (int i = it - 1 < 0 ? 0 : it - 1; i < mtx.length && i <= it + 1; i++) {
			for (int j = jt - 1 < 0 ? 0 : jt - 1 ; j < mtx[0].length && j <= jt + 1; j++) {
				if (mtx[i][j] == 1	) {
					mtx[i][j] = 0;
					return countThisConnection(mtx, i, j) + 1;
				}
			}
		}
		return 1;
	}

}
//
//20160615Wed11:20 duration:37m54s27 WrongAnswerOnTestCase#3#6 @BryanBo-Cao
