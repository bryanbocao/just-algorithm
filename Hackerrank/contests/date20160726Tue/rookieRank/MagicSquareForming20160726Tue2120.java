package contests.date20160726Tue.rookieRank;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class MagicSquareForming20160726Tue2120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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