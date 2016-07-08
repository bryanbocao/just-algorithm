package algorithms.search;

import java.util.*;

public class MissingNumbers20160708Fri1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lsn = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) lsn.add(sc.nextInt());
		int m = sc.nextInt();
		List<Integer> lsr = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int next = sc.nextInt();
			if (lsn.contains(next)) lsn.remove(new Integer(next));
			else if (!lsr.contains(next)) lsr.add(next);
		}
		Collections.sort(lsr);
		Iterator<Integer> it = lsr.iterator();
		while (it.hasNext()) System.out.print(it.next() + " ");
		sc.close();
	}
}
//https://www.hackerrank.com/challenges/missing-numbers
//20160708Fri12:59 duration:13m13s44 TimeOutInTestCase#4 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao