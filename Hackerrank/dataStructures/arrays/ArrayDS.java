package dataStructures.arrays;
import java.util.*;
public class ArrayDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for (int i = n - 1; i >= 0; i--) System.out.print(arr[i] + " ");
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/arrays-ds
//20160621Tue11:20 duration:6m03s57 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao