package contests.weekOfCode21;
import java.util.*;
public class CountingTheWays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int l = sc.nextInt(), r = sc.nextInt();
		int sumf = 0;
		for (int x = l; x <= r; x++) {
			for (int i = 0; i < a.length; i++) {
				//missing the iterating all the possible combinations of different weights
			}
		}
		System.out.println(sumf);
		sc.close();
	}
}
//https://www.hackerrank.com/contests/w21/challenges/count-ways-1
//20160701Fri11:15 duration:40m43s52 unsolved