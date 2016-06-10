package algorithms.bitmanipulation;
import java.util.*;
public class MaximizingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), max = 0;
		for (int i = a; i < b; i++) {
			for (int j = i + 1; j <= b; j++) {
				int xor = i ^ j;
				if (xor > max) max = xor;
			}
		}
		System.out.println(max);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/maximizing-xor
//20160610Fri12:02 duration:10m28s24 ACCEPTED @BryanBo-Cao