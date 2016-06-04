package contests.zalandoCodeSprint;
import java.util.*;
public class TheInquiringManager20160604Sat1558 {
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
	
	private static void inquire(int[][] mtx, int inqTime, int now) {
		int max = -1;
		for (int i = now; i >= 0 && mtx[i][0] > inqTime - 60; i--) if (mtx[i][1] > max) max = mtx[i][1];
		System.out.println(max);
	}
}
//overtime