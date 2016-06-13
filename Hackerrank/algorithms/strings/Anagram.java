package algorithms.strings;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			char[] cs = sc.next().toCharArray();
			if (cs.length % 2 == 0) {
				List<Character> ls = new ArrayList<Character>();
				int cnt = 0;
				for (int j = 0; j < cs.length / 2; j++) ls.add(cs[j]);
				for (int j = cs.length / 2; j < cs.length; j++) {
					if (ls.contains(cs[j])) ls.remove(new Character(cs[j]));
					else cnt++;
				}
				System.out.println(cnt);
			} else {
				System.out.println(-1);
			}
		}
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/anagram
//20160613Mon09:09 duration:10m33s92 ACCEPTED @BryanBo-Cao
