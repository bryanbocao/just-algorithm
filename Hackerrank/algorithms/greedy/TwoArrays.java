package algorithms.greedy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class TwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(), k = sc.nextInt();
			List<Integer> lsa = new ArrayList<Integer>(),
					lsb = new ArrayList<Integer>();
			int suma = 0, sumb = 0;
			for (int j = 0; j < n; j++) {
				int next = sc.nextInt();
				suma += next;
				lsa.add(next);
			}
			for (int j = 0; j < n; j++) {
				int next = sc.nextInt();
				sumb += next;
				lsb.add(next);
			}
			if (suma + sumb < k * n) System.out.println("NO");
			else {
				Collections.sort(lsa);
				Collections.sort(lsb);
				Collections.reverse(lsb);
				Iterator<Integer> ita = lsa.iterator(),
						itb = lsb.iterator();
				boolean exists = true;
				while (ita.hasNext()) {
					if (ita.next() + itb.next() < k) {
						exists = false;
						break;
					}
				}
				if (exists) System.out.println("YES");
				else System.out.println("NO");
			}
			
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/two-arrays
//20160705Tue13:01 duration:12m21s27 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
