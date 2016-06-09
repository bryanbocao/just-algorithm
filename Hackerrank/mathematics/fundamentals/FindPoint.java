package mathematics.fundamentals;
import java.util.*;
public class FindPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int px = sc.nextInt(), py = sc.nextInt();
			int qx = sc.nextInt(), qy = sc.nextInt();
			System.out.print(qx * 2 - px + " ");
			System.out.println(qy * 2 - py);
		}
	}
}
//https://www.hackerrank.com/challenges/find-point
//20160609Fri11:39 duration:3m34s56 ACCEPTED @BryanBo-Cao