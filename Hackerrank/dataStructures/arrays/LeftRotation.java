package dataStructures.arrays;
import java.util.*;
public class LeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (i >= d) System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < d; i++) System.out.print(arr[i] + " ");
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/array-left-rotation
//20160717Sun12:08 duration:7m13s92 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
