package contests.mayWorldCodeSprint;
import java.util.*;
import java.io.*;
public class AbsolutePermutation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scn.nextInt(), K = scn.nextInt();
			if (K == 0) {
				for (int j = 0; j < N; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			} else if (K == 1) {
				if (N == 1) System.out.println(-1);
				if (N == 2) System.out.println("2 1");
			} else {
				System.out.println(-1);
			}
		}
		scn.close();
	}

}
