package algorithms.bitmanipulation;
import java.io.*;
import java.util.*;
public class Cipher20160508Sun1202 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		StringBuffer sb = new StringBuffer();
		sb.append("0B");
		sb.append(scn.nextInt());
		System.out.println(sb);
		int pt = Integer.parseInt(sb.toString());
//		int pt = Integer.parseInt(sb.toString());
		
		int result = 0;
		for (int i = 0; i < K; i++) {
			int temp = pt;
			pt = pt << 1;
			result = temp ^ pt;
		}
		System.out.println(Integer.toBinaryString(result));
		scn.close();
	}

}
