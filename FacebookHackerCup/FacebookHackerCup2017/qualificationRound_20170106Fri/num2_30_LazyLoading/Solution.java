package qualifiactionRound_20170106Fri.num2_30_LazyLoading;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			print("Case #" + i + ": ");
			int n = sc.nextInt();
			int[] ws = new int[n];
			for (int j = 0; j < ws.length; j++) ws[j] = sc.nextInt();
			Arrays.sort(ws);
			int sI = 0, lI = ws.length - 1, trips = 0;
			while (sI < lI) {
				if (ws[lI] >= 50) lI--;
				else sI += 50 / ws[lI] + 1;
				trips++;
			}
			println(trips);
		}
		sc.close();
	}
	
	private static void print(String s) {System.out.print(s);}
	private static void println(int i) {System.out.println(i);}
}
//TriedOn20170106Fri CodingDuration:48m17s12 WrongAnswer