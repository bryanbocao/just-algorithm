package algorithms.implementation;

import java.util.*;
import java.io.*;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scn.nextInt(),
					K = scn.nextInt();
			boolean cancelled = true;
			for (int j = 0; j < N; j++) {
				if (scn.nextInt() <= 0)
					K--;
				if (K <= 0) {
					cancelled = false;
//					break;
				}
			}
			if (cancelled)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scn.close();
	}

}
