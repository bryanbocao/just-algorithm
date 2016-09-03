package algorithms.implementation;

import java.util.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] clds = new int[n];
    	for (int i = 0; i < n; i++) clds[i] = sc.nextInt();
    	int jumps = 0;
    	for (int i = 0; i < n - 1;) {
    		if (i + 2 < n && clds[i + 2] == 0) i += 2;
    		else if (i + 1 < n && clds[i + 1] == 0) i++;
    		jumps++;
    	}
    	System.out.println(jumps);
    	sc.close();
    }
}
//https://www.hackerrank.com/challenges/jumping-on-the-clouds
//SolvedOn20160903SatAt13:23 CodingDuration:10m07s82 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 


