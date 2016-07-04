package contests.weekOfCode21;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class DemandingMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), r = sc.nextInt();
		int[] hd = new int[h];
		Map<Integer, Set<Integer>> cnt = new HashMap<Integer, Set<Integer>>();
		for (int i = 0; i < h; i++) hd[i] = sc.nextInt();
		for (int i = 0; i < r; i++) {
			int h0i = sc.nextInt() - 1, h1i = sc.nextInt() - 1;
			
			if (cnt.containsKey(h0i)) {
				Set<Integer> set = cnt.get(h0i);
				set.add(h1i);
				cnt.put(h0i, set);
			} else {
				Set<Integer> set = new HashSet<Integer>();
				set.add(h1i);
				cnt.put(h0i, set);
			}
			
			if (cnt.containsKey(h1i)) {
				Set<Integer> set = cnt.get(h1i);
				set.add(h0i);
				cnt.put(h1i, set);
			} else {
				Set<Integer> set = new HashSet<Integer>();
				set.add(h0i);
				cnt.put(h1i, set);
			}
			
		}
		
//		Set<Set> set = new HashSet<Set>();
		Set<boolean[]> maxVisitedHousesSet = new HashSet<boolean[]>();
		int max = 0;
		for (int i = 0; i < h; i++) {
			boolean[] visited = new boolean[h];
			int d = hd[i];
			visited[i] = true;
			//skip houses
			Iterator<Integer> it = cnt.get(i).iterator();
			while (it.hasNext()) visited[it.next()] = true;
			//
			for (int j = 0; j < h && j != h && visited[j] == false; j++) {
				d += hd[j];
				visited[j] = true;
				//skip houses
				Iterator<Integer> itt = cnt.get(i).iterator();
				while (itt.hasNext()) visited[itt.next()] = true;
				//
			}
			if (d > max) {
				max = d;
				maxVisitedHousesSet = new HashSet<boolean[]>();
				maxVisitedHousesSet.add(visited);
			} else if (d == max) maxVisitedHousesSet.add(visited);
		}
		System.out.println(max + " " + maxVisitedHousesSet.size());
		
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w21/challenges/borrowing-money
//20160629Wed duration: @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
