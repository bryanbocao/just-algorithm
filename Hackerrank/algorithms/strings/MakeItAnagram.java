package algorithms.strings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cs0 = sc.next().toCharArray(),
				cs1 = sc.next().toCharArray();
		List<Character> ls0 = new ArrayList<Character>();
		int sameCnt = 0;
		for (int i = 0; i < cs0.length; i++) ls0.add(cs0[i]);
		for (int i = 0; i < cs1.length; i++) {
			if (ls0.contains(cs1[i])) {
				ls0.remove(new Character(cs1[i]));
				sameCnt++;
			}
		}
		System.out.println(cs0.length + cs1.length - sameCnt * 2);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/make-it-anagram
//20160617Fri15:34 duration:22m04s18 @github.com/BryanBo-Cao