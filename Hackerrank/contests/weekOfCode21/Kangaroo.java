package contests.weekOfCode21;
import java.util.*;
public class Kangaroo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
		
        if (v1 < v2) {
        	if (x1 <= x2) System.out.println("NO");
        	else {
        		while (x1 > x2) {
        			x1 += v1;
        			x2 += v2;
        		}
        		if (x1 == x2) System.out.println("YES");
        		else System.out.println("NO");
        	}
        } else if (v1 > v2) {
        	if (x1 >= x2) System.out.println("NO");
        	else {
        		while (x1 < x2) {
        			x1 += v1;
        			x2 += v2;
        		}
        		if (x1 == x2) System.out.println("YES");
        		else System.out.println("NO");
        	}
        } else {
        	if (x1 == x2) System.out.println("YES");
        	else System.out.println("NO");
        }
		
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w21/challenges/kangaroo
//20160627Mon11:12 duration:12m02s21 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao