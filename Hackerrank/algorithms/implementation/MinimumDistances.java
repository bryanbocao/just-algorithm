package algorithms.implementation;
import java.util.*;

public class MinimumDistances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int minD = -1;
		for (int i = 0; i < n; i++) {
			int next = sc.nextInt();
			int d = 0;
			if (map.containsKey(next)) {
				d = i - map.get(next);
				if (minD == -1) minD = d;
				else if (d < minD) minD = d;
			}
			map.put(next, i);
		}
		System.out.println(minD);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/minimum-distances
//20160708Fri10:55 duration:6m18s07 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
