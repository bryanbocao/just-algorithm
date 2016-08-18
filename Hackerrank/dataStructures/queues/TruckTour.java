package dataStructures.queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckTour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), crrPtrl = 0, tryI = 0;
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int ptrl = sc.nextInt(), d = sc.nextInt();
			ls.add(ptrl); ls.add(d);
			crrPtrl += ptrl - d;
			if (crrPtrl < 0) tryI = -1;
		}
		if (tryI == 0) System.out.println(0);
		else {
			tryI = 1 * 2;
			boolean gotIndex = false;
			for (tryI = 2; tryI < ls.size(); tryI += 2) {
				crrPtrl = 0;
				for (int i = tryI; i < ls.size() + tryI; i += 2) {
					int ptrl = ls.get(i % ls.size()), d = ls.get((i + 1) % ls.size());
					crrPtrl += ptrl - d;
					if (crrPtrl < 0) break;
					if (i + 1 == ls.size() + tryI - 1) gotIndex = true;
				}
				if (gotIndex) {
					System.out.println(tryI / 2);
					break;
				}
			}
		}
		sc.close();
	}
}
//https://www.hackerrank.com/challenges/truck-tour
//SolvedOn20160818ThuAt16:14 CodingDuration:53m08s22 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
