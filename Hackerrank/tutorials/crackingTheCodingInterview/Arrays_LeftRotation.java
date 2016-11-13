package tutorials.crackingTheCodingInterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays_LeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		// BryanBo-Cao's code ====== start 
		for (int i = 0; i < n; i++) System.out.print(a[(i + k) % n] + " ");
		// BryanBo-Cao's code ====== end
	}
}
//https://www.hackerrank.com/challenges/ctci-array-left-rotation
//SolvedOn20161113Sun16:02 CodingDuration:5m31s51 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
