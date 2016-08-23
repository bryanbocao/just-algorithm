package contests.date20160726Tue.rookieRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		height[0] = in.nextInt();
		int max = height[0];
		for (int height_i = 1; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > max)
				max = height[height_i];
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (height[i] == max)
				cnt++;
		}
		System.out.println(cnt);
		in.close();
	}
}
//https://www.hackerrank.com/contests/rookierank/challenges/birthday-cake-candles
//20160726Tue20:57 duration:5m59s70 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 