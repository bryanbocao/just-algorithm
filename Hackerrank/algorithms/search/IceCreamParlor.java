package algorithms.search;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class IceCreamParlor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt(), n = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int j = 1; j <= n; j++) {
				int sunny = sc.nextInt(), johnny = m - sunny;
				if (map.containsKey(johnny)) System.out.println(map.get(johnny) + " " + j);
				else map.put(sunny, j);
			}
		}
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/icecream-parlor
//20160803Wed14:09 duration:11m59s08 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
