package algorithms.implementation;

import java.util.*;
public class SherlockAndTheBeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			if (N < 3) System.out.println(-1);
			else {
				int nOf5 = N, nOf3 = 0;
				boolean no = true;
				for (; nOf5 >= 0; nOf5--) {
					if (nOf5 % 3 == 0 && nOf3 % 5 == 0) {
						printNum(nOf5, nOf3);
						no = false;
						break;
					}
					nOf3++;
				}
				if(no) System.out.println(-1);
			}
		}
		sc.close();
	}

	private static void printNum(int nOf5, int nOf3) {
		for (; nOf5 > 0; nOf5--) {
			System.out.print(5);
		}
		for (; nOf3 > 0; nOf3--) {
			System.out.print(3);
		}
		System.out.println();
	}
}
//20160525Wed1355 Duration:15m00s08