package contests.zalandoCodeSprint;
import java.util.*;
public class TheInquiringManager20160604Sat1621 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mtx = new int[n][2];
		for (int i = 0; i < n; i++) {
			int type = sc.nextInt();
			switch(type) {
				case 1:
					mtx[i][1] = sc.nextInt();
					mtx[i][0] = sc.nextInt();
					break;
				case 2:
					inquire(mtx, sc.nextInt(), i);
					break;
			}
		}
		sc.close();
	}
	
	private static void inquire(int[][] mtx, int inqTime, int inow) {
		int max = -1;
//		System.out.println("Start inquire");
		for (int i = inow; i >= 0; i--) {
//			System.out.println("Start for");
			if (mtx[i][1] != 0) {
				if (inqTime - mtx[i][0] >= 60) break;
				if (mtx[i][1] > max) max = mtx[i][1];
			}
//			System.out.println("mtx[i][1]: " + mtx[i][1]);
		}
//		System.out.println("end inquire");
//		System.out.println();
		System.out.println("max: " + max);
	}
}
