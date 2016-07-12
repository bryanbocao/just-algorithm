package dataStructures.arrays;
import java.util.*;
public class TwoDArraysDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = -63;
		int tsum = 0;
		for (int i = 1; i < 5; i++) {
			tsum = arr[i - 1][0];
			tsum += arr[i - 1][1];
			tsum += arr[i - 1][2];
			tsum += arr[i][1];
			tsum += arr[i + 1][0];
			tsum += arr[i + 1][1];
			tsum += arr[i + 1][2];
			if (tsum > sum) sum = tsum;
			for (int j = 2; j < 5; j++) {
				tsum -= arr[i - 1][j - 2];
				tsum += arr[i - 1][j + 1];
				tsum -= arr[i][j - 1];
				tsum += arr[i][j];
				tsum -= arr[i + 1][j - 2];
				tsum += arr[i + 1][j + 1];
				if (tsum > sum) sum = tsum;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/2d-array
//20160712Tue13:41 duration:24m50s47 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao