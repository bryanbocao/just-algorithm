package algorithms.bitmanipulation;
import java.io.*;
import java.util.*;
public class Cipher20160508Sun1653 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		int pt = getIntFromBinary(scn.nextInt());
		int result = 0;
		for (int i = 0; i < K; i++) {
			int temp = pt;
			pt = pt << 1;
			result = temp ^ pt;
		}
		System.out.println(Integer.toBinaryString(result));
		scn.close();
	}

	private static int getIntFromBinary(int a) {
		char[] cs = Integer.toString(a).toCharArray();
		int b = 0;
		int m = 1;
		for (int i = cs.length - 1; i >= 0; i--) {
			if (cs[i] == '1') {
				b += m;
			}
			m *= 2;
		}
		System.out.println(Integer.toBinaryString(b));
		return b;
	}
}
