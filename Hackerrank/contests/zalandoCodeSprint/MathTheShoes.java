package contests.zalandoCodeSprint;
import java.util.Scanner;
public class MathTheShoes {

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
				
			} else {
				break;
			}
		}
		sc.close();
	}
}
//20160604Sat13:11 duration: 44m43s76 ACCEPTED @BryanBo-Cao