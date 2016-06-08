package algorithms.strings;
import java.io.*;
import java.util.*;
public class ExchangeWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			String str = scn.next();
			char[] cs = str.toCharArray();
			char tc = cs[0];
			int count = 0;
			for (int j = 1; j < cs.length; j++) {
				if (tc == cs[j]) {
					count++;
				} else {
					tc = cs[j];
				}
			}
			System.out.println(count);
		}
	}

}

//20160508Sun2249 duration:6m47s82 @BryanBo-Cao 