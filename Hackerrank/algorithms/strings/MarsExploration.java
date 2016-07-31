package algorithms.strings;
import java.util.*;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int cnt = 0;
		for (int i = 0; i < cs.length;) {
			if (cs[i++] != 'S') cnt++;
			if (cs[i++] != 'O') cnt++;
			if (cs[i++] != 'S') cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/mars-exploration
//20160731Sun14:02 duration:5m52s65 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
