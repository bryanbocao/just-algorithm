package algorithms.search;

import java.util.*;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10001];
		for (int i = 0; i < arr.length; i++) arr[i] = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) arr[sc.nextInt()]--;
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) arr[sc.nextInt()]++;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) System.out.print(i + " ");
		}
		sc.close();
	}
}
//https://www.hackerrank.com/challenges/missing-numbers
//20160708Fri13:17 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao