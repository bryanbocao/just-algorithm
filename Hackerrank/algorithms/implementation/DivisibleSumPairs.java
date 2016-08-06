package algorithms.implementation;
import java.util.*;
public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), cnt = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
            for (int j = i - 1; j >= 0; j--) if ((arr[i] + arr[j]) % k == 0) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
//https://www.hackerrank.com/challenges/divisible-sum-pairs
//20160805Fri23:04 duration:11m31s92 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

