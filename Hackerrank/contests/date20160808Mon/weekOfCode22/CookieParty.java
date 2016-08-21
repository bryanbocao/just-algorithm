package contests.date20160808Mon.weekOfCode22;

import java.util.*;

public class CookieParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		if (n == m) System.out.println(0);
		else System.out.println(n - (m % n));
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w22/challenges
//20160808Mon20:37 CodingDuration:11m05s58 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
