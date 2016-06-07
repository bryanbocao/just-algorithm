package algorithms.strings;

import java.util.Scanner;

public class FunnyString20160606Mon1827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean isFunny = true;
		for (int i = 0; i < t; i++) {

			String s = sc.next();
			char[] cs = s.toCharArray();
			int len = cs.length;
			for (int i1 = 0; i1 < len - 1; i1++) {
				int j1 = len - i1 - 1;
				int j2 = j1 - 1;
				for (int i2 = i1 + 1; i2 < len; i2++) {
					if (cs[i2] - cs[i1] != cs[j1] - cs[j2]) {
						isFunny = false;
						break;
					}
					j2--;
					if (!isFunny)
						break;
				}
				j1--;
				if (!isFunny)
					break;
			}
			if (isFunny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");

		}

		sc.close();
	}

}
//20160606Mon1827 duration:21m39s01 Not Passed in TestCase#2 @BryanBo-Cao
