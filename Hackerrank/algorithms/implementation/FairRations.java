package algorithms.implementation;
import java.util.*;
public class FairRations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int preI = -1, cnt = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num % 2 == 1) {
				if (preI == -1) preI = i;
				else {
					cnt += (i - preI) * 2;
					preI = -1;
				}
			}
		}
		if (preI == -1) System.out.println(cnt);
		else System.out.println("NO");
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/fair-rations
//20160806Sat13:23 duration:31m58s17 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
