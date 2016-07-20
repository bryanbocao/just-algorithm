package dataStructures.disjointSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class MergingCommunities {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		Set<Set<Integer>> setset = new HashSet<Set<Integer>>();
		for (int i = 0; i < n + q; i++) {
			String s = sc.next();
			int num = sc.nextInt();
			switch(s) {
			case "M":
				int num1 = sc.nextInt();
				boolean found = false, found1 = false;
				Iterator<Set<Integer>> it = setset.iterator();
				Set<Integer> set = null, set1 = null;
				while (it.hasNext()) {
					Set<Integer> tset = it.next();
					if (tset.contains(num) || tset.contains(num1)) {
						if (tset.contains(num)) {
							if (found) found1 = true;
							else found = true;
							if (set == null) set = tset;
							else {
								set.addAll(tset);
								setset.remove(tset);
							}
							break;
						}
						
						if (tset.contains(num1)) {
							if (found) found1 = true;
							else found = true;
							if (set1 == null) set1 = tset;
							else {
								set1.addAll(tset);
								setset.remove(tset);
							}
							break;
						}
					}
				}
				if (found) {
					if (!found1) {
						if (set == null && set1 != null) set1.add(num);
						else if (set != null && set1 == null) set.add(num1);
					}
				} else {
					Set<Integer> tset = new HashSet<Integer>();
					tset.add(num);
					tset.add(num1);
					setset.add(tset);
				}
				break;
			case "Q":
				Iterator<Set<Integer>> it2 = setset.iterator();
				found = false;
				while (it2.hasNext()) {
					Set<Integer> tset = it2.next();
					if (tset.contains(num)) {
						found = true;
						System.out.println(tset.size());
						break;
					}
				}
				if (!found) System.out.println(1);
				break;
			}
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/merging-communities
//20160720Wed14:34 duration:50m58s1 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao