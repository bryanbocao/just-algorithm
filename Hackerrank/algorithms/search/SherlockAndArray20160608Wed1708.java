package algorithms.search;

import java.util.*;

public class SherlockAndArray20160608Wed1708 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("YES");
				sc.nextInt();
				break;
			case 2:
				System.out.println("NO");
				sc.nextInt();
				sc.nextInt();
				break;
			default:
				int[] arr = new int[n];
				for (int j = 0; j < n; j++) {
					arr[j] = sc.nextInt();
				}
				boolean yes = false;
				for (int j = 1; j < n - 1; j++) {
					int lsum = 0, rsum = 0;
					for (int lj = 0; lj < j; lj++) lsum += arr[lj];
					for (int rj = j + 1; rj < n; rj++) rsum += arr[rj];
					if (lsum == rsum) yes = true;
				}
				if (yes) System.out.println("YES");
				else System.out.println("NO");
				break;
			}
		}
	}
}
//20160608Wed17:08 duration:14m47s25 TimeOutInTestCase#3And#4 @BryanBo-Cao