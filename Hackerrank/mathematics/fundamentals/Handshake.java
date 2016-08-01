package mathematics.fundamentals;
import java.util.*;
public class Handshake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(), cnt = 0;
			for (int ii = 0; ii < n; ii++) for (int jj = ii + 1; jj < n; jj++) cnt++;
			System.out.println(cnt);
		}
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/handshake
//20160801Mon14:31 duration:3m40s79 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
