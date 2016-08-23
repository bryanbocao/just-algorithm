package contests.date20160726Tue.rookieRank;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class MagicSquareForming {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] mss = new int[8][3][3];
		mss[0][0][0] = 2; mss[0][0][1] = 7; mss[0][0][2] = 6; mss[0][1][0] = 9; mss[0][1][1] = 5; mss[0][1][2] = 1;
		mss[0][2][0] = 4; mss[0][2][1] = 3; mss[0][2][2] = 8;
		
		mss[1][0][0] = 2; mss[1][0][1] = 9; mss[1][0][2] = 4; mss[1][1][0] = 7; mss[1][1][1] = 5; mss[1][1][2] = 3;
		mss[1][2][0] = 4; mss[1][2][1] = 3; mss[1][2][2] = 8;
		
		mss[2][0][0] = 4; mss[2][0][1] = 3; mss[2][0][2] = 8; mss[2][1][0] = 9; mss[2][1][1] = 5; mss[2][1][2] = 1;
		mss[2][2][0] = 2; mss[2][2][1] = 7; mss[2][2][2] = 6;
		
		mss[3][0][0] = 4; mss[3][0][1] = 9; mss[3][0][2] = 2; mss[3][1][0] = 3; mss[3][1][1] = 5; mss[3][1][2] = 7;
		mss[3][2][0] = 8; mss[3][2][1] = 1; mss[3][2][2] = 6;
		
		mss[4][0][0] = 6; mss[4][0][1] = 1; mss[4][0][2] = 8; mss[4][1][0] = 7; mss[4][1][1] = 5; mss[4][1][2] = 3;
		mss[4][2][0] = 2; mss[4][2][1] = 9; mss[4][2][2] = 4;
		
		mss[5][0][0] = 6; mss[5][0][1] = 7; mss[5][0][2] = 2; mss[5][1][0] = 1; mss[5][1][1] = 5; mss[5][1][2] = 9;
		mss[5][2][0] = 8; mss[5][2][1] = 3; mss[5][2][2] = 4;
		
		mss[6][0][0] = 8; mss[6][0][1] = 1; mss[6][0][2] = 6; mss[6][1][0] = 3; mss[6][1][1] = 5; mss[6][1][2] = 7;
		mss[6][2][0] = 4; mss[6][2][1] = 9; mss[6][2][2] = 2;
		
		mss[7][0][0] = 8; mss[7][0][1] = 3; mss[7][0][2] = 4; mss[7][1][0] = 1; mss[7][1][1] = 5; mss[7][1][2] = 9;
		mss[7][2][0] = 6; mss[7][2][1] = 7; mss[7][2][2] = 2;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 1; i < 10; i++) map.put(i, 0);
//		int[] sumR = new int[3], sumC = new int[3];
		//int[] leftUpD = new int[3], rightUpD = new int[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int num = sc.nextInt();
				map.put(num, map.get(num) + 1);
//				sumR[i] += num;
//				sumC[j] += num;
			}
		}
		int sumP = 0, sumN = 0;
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int num = it.next();
			if (map.get(num) > 1) sumP += num * (map.get(num) - 1);
			else if (map.get(num) < 1) sumN += Math.abs(num * (map.get(num) - 1));
		}
		System.out.println(Math.abs(sumP - sumN));
		sc.close();
	}

}
//https://www.hackerrank.com/contests/rookierank/challenges/magic-square-forming
//20160726Tue21:20 duration:32m21s91 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 