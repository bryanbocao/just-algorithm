package algorithms.strings;
import java.util.*;
public class CamelCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int cnt = 1;
		for (int i = 0; i < cs.length; i++) if (Character.isUpperCase(cs[i])) cnt++;
        System.out.println(cnt);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/camelcase
//SolvedOn20160905MonAt10:06 CodingDuration:3m39s45 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
