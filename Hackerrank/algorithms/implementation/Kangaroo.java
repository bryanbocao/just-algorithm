package algorithms.implementation;
import java.util.*;
public class Kangaroo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(), v1 = sc.nextInt();
		int x2 = sc.nextInt(), v2 = sc.nextInt();
		
		if (x1 < x2) {
			if (v1 <= v2) System.out.println("NO");
			else {
				boolean same = false;
				while (x1 < x2) {
					x1 += v1;
					x2 += v2;
					if (x1 == x2) same = true;
				}
				if (same) System.out.println("YES");
				else System.out.println("NO");
			}
		} else if (x1 == x2) {
			if (v1 == v2) System.out.println("YES");
			else System.out.println("NO");
		} else { //x1 > x2
			if (v1 >= v2) System.out.println("NO");
			else {
				boolean same = false;
				while (x1 > x2) {
					x1 += v1;
					x2 += v2;
					if (x1 == x2) same = true;
				}
				if (same) System.out.println("YES");
				else System.out.println("NO");
			}
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/kangaroo
//20160707Thu12:24 duration:8m50s19 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
