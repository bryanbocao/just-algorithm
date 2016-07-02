package algorithms.bitmanipulation;
import java.io.*;
import java.util.*;
public class Cipher20160621Tue1116 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		char[] sc = scn.next().toCharArray();
		char[] bcL = sc.clone();
		char[] bc = new char[sc.length - K + 1];
		
		//initialize bcL
		for (int i = bcL.length - K + 1; i < bc.length; i++) {
			bcL[i] = '0';	
		}
		
		for (int i = 0; i < sc.length; i++) {
			if (i == 0)
				bcL[i] = sc[i];
			else {
				int countOne = 0, k = K - 1;
				for (int j = i - 1; j >= 0 && k >= 0; j--) {
					if (bcL[j] == '1') {
						countOne++;
					}
					k--;
				}
				if (countOne % 2 == 1) {
					if (sc[i] == '0') {
						bcL[i] = '1';
					} else {
						bcL[i] = '0';
					}
				} else {
					bcL[i] = sc[i];
				}
			}
			System.out.print(bcL[i]);
		}
		scn.close();
	}

}
