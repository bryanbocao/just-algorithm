package contests.date20160726Tue.rookieRank;
import java.util.*;
public class CountingValleys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level = 0, cnt = 0;
		sc.nextInt();
		String s = sc.next();
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			switch(cs[i]) {
			case 'U':
				level++;
				break;
			case 'D':
				if (level == 0) cnt++;
				level--;
				break;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}

}
//
//20160726Tue21:04 duration:6m12s25 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 