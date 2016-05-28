package algorithms.implementation;
import java.util.*;
public class TheGridSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			//insert large grid G
			int R = sc.nextInt(), C = sc.nextInt();
			char[][] mtx = new char[R][C];
			for (int j = 0; j < R; j++) {
				mtx[j] = sc.next().toCharArray();
			}
			
			//insert pattern
			int r = sc.nextInt(), c = sc.nextInt();
			char[][] ptn = new char[r][c];
			for (int j = 0; j < r; j++) {
				ptn[j] = sc.next().toCharArray();
			}
			
			//check if ptn in mtx
			System.out.println(chkPtnInMtx(mtx, ptn));
			
		}
		sc.close();
	}
	
	private static String chkPtnInMtx(char[][] mtx, char[][] ptn) {
		int R = mtx.length, C = mtx[0].length;
		int r = ptn.length, c = ptn[0].length;
		for (int ii = 0; ii <= R - r; ii++) {
			for (int jj = 0; jj <= C - c; jj++) {
				if (mtx[ii][jj] == ptn[0][0]) {
					boolean isPtn = true;
					int iiM = ii;
					for (int iiP = 0; iiP < r; iiP++) {
						int jjM = jj;
						for (int jjP = 0; jjP < c; jjP++) {
							if (mtx[iiM][jjM] != ptn[iiP][jjP]) {
								isPtn = false;
								break;
							}
							jjM++;
						}
						iiM++;
					}
					if (isPtn) {
						return "YES";
					}
				}
			}
		}
		return "NO";
	}
}
//20160526Thu16:07 duration: 48m30s10