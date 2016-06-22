package algorithms.sorting;
import java.util.*;
public class SherlockAndWatson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();
		int[] arr = new int[n], narr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int ii = -k;
		for (int i = 0; i < n; i++) {
			while (ii < 0) ii += n;
			while (ii >= n) ii -= n ;
			narr[i] = arr[ii];
			ii++;
		}
		for (int i = 0; i < q; i++) System.out.println(narr[sc.nextInt()]);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/sherlock-and-watson
//20160622Wed12:16 duration:15m39s74 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao