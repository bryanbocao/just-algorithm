package algorithm.strings;
import java.util.*;
public class MakeItAnagram20160607Tue2048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Character> set = new HashSet<Character>();
		char[] cs = sc.next().toCharArray();
		for (int i = 0; i < cs.length; i++)	set.add(cs[i]);
		char[] cs2 = sc.next().toCharArray();
		int sameCnt = 0, totalLen = cs.length + cs2.length;
		for (int i = 0; i < cs2.length; i++) {
			if (set.contains(cs2[i])) {
				set.remove(cs2[i]);
				sameCnt += 2;
			}
		}
		System.out.println(totalLen - sameCnt);
		sc.close();
	}

}
//20160607Tue20:40 duration:24m08s21 WrongAnswer @BryanBo-Cao