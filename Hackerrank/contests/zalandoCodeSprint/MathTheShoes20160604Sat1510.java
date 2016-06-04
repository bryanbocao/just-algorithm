package contests.zalandoCodeSprint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class MathTheShoes20160604Sat1510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(), M = sc.nextInt(), N = sc.nextInt();
		int[][] mtx = new int[M][2];
		for (int i = 0; i < M; i++) {
			mtx[i][0] = i;
			mtx[i][1] = 0;
		}
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			mtx[input][1] = (mtx[input][1] == 0) ? 1 : mtx[input][1] + 1;
		}
		
		//print
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mtx[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
		////
		
		for (int i = 0; i < K; i++) {
			int thisMax = 0;
			int iMax = 0;
			boolean foundMax = true;
			for (int j = 0; j < M; j++) {
				if (mtx[j][1] > thisMax) {
					thisMax = mtx[j][1];
					foundMax = true;
					iMax = j;
				}
			}
			if (foundMax) {
				System.out.println(mtx[iMax][0]);
				mtx[iMax][0] = -1;
				mtx[iMax][1] = -1;
				
				//print
//				System.out.println("Print ");
//				for (int ii = 0; ii < M; ii++) {
//					for (int j = 0; j < 2; j++) {
//						System.out.print(mtx[ii][j]);
//						System.out.print(' ');
//					}
//					System.out.println();
//				}
				////
				
			} else {
				break;
			}
		}
	}
}
