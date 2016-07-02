package algorithms.bitmanipulation;
import java.io.*;
import java.util.*;
public class Cipher20160508Sun1732 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		char[] sc = scn.next().toCharArray();
		char[] bc = new char[sc.length - K + 1];
		char[][] mtx = new char[K][sc.length + K - 1];
		int scLen = sc.length;
		for (int i = 0; i < K; i++) {
			for (int a = 0; a < i; a++) {
				mtx[i][a] = '0';
			}
			for (int b = 0; b < sc.length; b++) {
				mtx[i][b] = sc[b];
			}
			for (int c = sc.length + i; c < K - 1 && c < sc.length + K - 1; c++) {
				mtx[i][c] = '0';
			}
		}
		
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < sc.length + K - 1; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
		
		scn.close();
	}

}
