package contests.date20160726Tue.rookieRank;
import java.util.*;
public class ExtremelyDangerousVirus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(), b = sc.nextInt(), t = sc.nextInt();
		double result = Math.pow((a + b) / 2, t);
		System.out.println((int)(result % (Math.pow(10, 9) + 7)));
		sc.close();
	}

}
//https://www.hackerrank.com/contests/rookierank/challenges/antiprime-numbers
//20160726Tue21:32 duration:10m27s01 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 