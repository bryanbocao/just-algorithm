package contests.worldCodeSprint4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MinimumDistances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> premap = new HashMap<Integer, Integer>(),
				ldmap = new HashMap<Integer, Integer>();
		int sd = -1;
		for (int i = 0; i < n; i++) {
			int next = sc.nextInt();
			if (premap.containsKey(next)) {
				int d = i - premap.get(next);
				if (sd == -1) {
					sd = d;
					ldmap.put(next, d);
				}
				if (ldmap.containsKey(next) && d <= ldmap.get(next)) {
					if (d < sd) sd = d;
					ldmap.put(next, d);
				} 
			}
			premap.put(next, i);
		}
		System.out.println(sd);
		sc.close();
	}
	
}
//https://www.hackerrank.com/contests/june-world-codesprint/challenges/minimum-distances
//20160625Sat23:03 duration:25m25s20 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
