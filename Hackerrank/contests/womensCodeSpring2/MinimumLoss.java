package womensCodeSprint2;

import java.util.Scanner;

public class MinimumLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yCnt = sc.nextInt();
		int[] values = new int[yCnt];
		for (int i = 0; i < yCnt; i++) values[i] = sc.nextInt();
		int min = 0;
		boolean gotMin = false;
		for (int i = 0; i < yCnt; i++) {
			for (int j = i + 1; j < yCnt; j++) {
				if (values[i] > values[j]) {
					if (gotMin) {
						if (values[i] - values[j] < min) min = values[i] - values[j];
					} else {
						min = values[i] - values[j];
						gotMin = true;
					}
				}
			}
		}
		System.out.println(min);
		sc.close();
	}

}
//https://www.hackerrank.com/contests/womens-codesprint-2/challenges/minimum-loss
//TriedOn20161119ThuNight CodingDuration:10m38s51 RuntimeError @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao