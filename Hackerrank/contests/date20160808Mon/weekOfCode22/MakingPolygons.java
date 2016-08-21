package contests.date20160808Mon.weekOfCode22;
import java.util.*;
public class MakingPolygons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0, max = 0;
		for (int i = 0; i < n; i++) {
			int next = sc.nextInt();
			if (next > max) max = next;
			sum += next;
		}
		if (sum - max <= max) System.out.println(1);
		else System.out.println(0);
		
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w22/challenges/cookie-party/submissions/code/6558617
//20160809Tue11:02 CodingDuration:14m31s74 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
