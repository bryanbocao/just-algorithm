package mathematics.fundamentals;
import java.util.*;
public class StrangeGridAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong(), c = sc.nextLong();
		long d = 10 * ((r - 1) / 2);
		long b = (r % 2 == 0) ? 1 + (c - 1) * 2 : (c - 1) * 2;
		long sum = d + b;
		System.out.println(sum);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/strange-grid
//20160724Sun15:59 duration:21m45s39 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 