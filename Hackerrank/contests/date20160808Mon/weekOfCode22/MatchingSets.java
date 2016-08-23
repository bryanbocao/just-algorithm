package contests.date20160808Mon.weekOfCode22;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class MatchingSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> ls = new ArrayList<Integer>(),
				ls2 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) ls.add(sc.nextInt());
		for (int i = 0; i < n; i++) { 
			int next = sc.nextInt();
			if (ls.contains(next)) ls.remove(new Integer(next));
			else ls2.add(next);
		}
		if (ls.size() % 2 == 0) {
			Set<Integer> diffSet = new HashSet<Integer>();
			Iterator<Integer> it = ls.iterator(), it2 = ls2.iterator();
			int opCnt = 0;
			while (it.hasNext()) {
				int diff = it.next() - it2.next();
				if (diffSet.contains(-diff)) {
					diffSet.remove(-diff);
					opCnt += Math.abs(diff);
				} else diffSet.add(diff);
			}
			if (diffSet.isEmpty()) System.out.println(opCnt);
			else System.out.println(-1);
		} else System.out.println(-1);
		
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w22/challenges/box-moving
//20160810Wed09:36 CodingDuration:24m57s48 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
