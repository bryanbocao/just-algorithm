package algorithms.search;

import java.util.*;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lsn = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			lsn.add(sc.nextInt());
		int m = sc.nextInt();
		List<Integer> lsm = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int next = sc.nextInt();
			if (lsn.contains(next))
				lsn.remove(new Integer(next));
			else
				lsm.add(next);
		}
		Collections.sort(lsm);
		Iterator<Integer> it = lsm.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" ");
		}
		sc.close();
	}
}
//20160608Wed12:46 duration:24m01s03 NotPassedInTestCase#1 TimeOutInTestCase#4 @BryanBo-Cao