package contests.c101HackJune2016;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EasyGCD20160620Mon1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>(),
				set2 = new HashSet<Integer>(),
				set3 = new HashSet<Integer>();
		for (int i = 0; i < n; i++) set.add(sc.nextInt());
		set2.addAll(set);

		Iterator<Integer> it2 = set2.iterator();
		int preInt = it2.next();
		if (set2.size() == 1) set3.add(preInt);
		while (set3.size() != 1) {
			while (it2.hasNext()) {
				int thisInt = it2.next();
				set3.add(getGCD(preInt, thisInt));
				preInt = thisInt;
			}
			if (set3.size() == 1) break;
			set2 = set3;
		}
		
		if (set3.size() == 1) {
			Iterator<Integer> it = set3.iterator();
			int next = it.next();
			if (next == 1) System.out.println(0);
			else {
				int l = k, rmd = l % next;
				while (rmd != 0) {
					l -= rmd;
					rmd = l % next;
				}
				System.out.println(l);
			}
		} else System.out.println(0);
		sc.close();
	}

	private static int getGCD(int a, int b) {
	    if (b == 0) return Math.abs(a);
	    return getGCD(b, a % b);
	}
	
}
//https://www.hackerrank.com/contests/101hack38/challenges/easy-gcd-1
//20160620MonMorning duration:53m50s28 WrongAnswer&Timeout @{hackerrank.com/BryanBoCao, github/BryanBo-Cao}
