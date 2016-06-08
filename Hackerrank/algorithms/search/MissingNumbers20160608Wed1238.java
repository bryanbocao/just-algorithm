package algorithms.search;
import java.util.*;
public class MissingNumbers20160608Wed1238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lsn = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)	lsn.add(sc.nextInt());
		int m = sc.nextInt();
		List<Integer> lsm = new ArrayList<Integer>();
		for (int i = 0; i < m; i++)	lsm.add(sc.nextInt());
		if (n > m) {
			lsn.removeAll(lsm);
			Collections.sort(lsn);
			Iterator<Integer> it = lsn.iterator();
			while (it.hasNext()) {
				System.out.print(it.next());
				System.out.print(" ");
			}
		} else if (n < m) {
			System.out.println("n < M");
			lsm.removeAll(lsn);
			Collections.sort(lsm);
			Iterator<Integer> it = lsm.iterator();
			while (it.hasNext()) {
				System.out.print(it.next());
				System.out.print(" ");
			}
		}
		
		sc.close();
		
	}

}
