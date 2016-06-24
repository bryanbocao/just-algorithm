package algorithms.greedy;
import java.util.*;
public class GridChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			char[][] cs = new char[n][n];
			for (int j = 0; j < n; j++) {
				cs[j] = sc.next().toCharArray();
				Arrays.sort(cs[j]);
			}
			
			char pre = 0;
			boolean isLexi = true;
			for (int ci = 0; ci < n; ci++) {
				for (int ri = 0; ri < n; ri++) {
					if (ri == 0) pre = cs[ri][ci];
					if (pre > cs[ri][ci]) isLexi = false;
					else pre = cs[ri][ci];
				}
			}
			
			if (isLexi) System.out.println("YES");
			else System.out.println("NO");
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/grid-challenge
//20160624Fri11:11 duration:13m29s54 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
