package dataStructures.arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			if (map.containsKey(str)) map.put(str, map.get(str) + 1);
			else map.put(str, 1);
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			String qs = sc.next();
			if (map.containsKey(qs)) System.out.println(map.get(qs));
			else System.out.println(0);
		}
		
		sc.close();
	}

}

//https://www.hackerrank.com/challenges/sparse-arrays
//20160718Mon17:08 duration:7m11s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao