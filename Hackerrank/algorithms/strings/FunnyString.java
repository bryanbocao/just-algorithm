package algorithms.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			String s = sc.next();
			char[] cs = s.toCharArray();
			int len = cs.length;
			boolean isFunny = true;
			for (int i1 = 0; i1 < len - 1; i1++) {
				int i2 = i1 + 1, j1 = len - i1 - 1, j2 = j1 - 1;
				if (Math.abs(cs[i2] - cs[i1]) != Math.abs(cs[j2] - cs[j1])) {
					isFunny = false;
					break;
				}
			}
			if (isFunny) System.out.println("Funny");
			else System.out.println("Not Funny");

		}
		sc.close();
	}

}
//20160606Mon18:35 duration:45m36s16 SOLVED @BryanBo-Cao
