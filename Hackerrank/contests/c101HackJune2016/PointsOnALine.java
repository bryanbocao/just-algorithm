package contests.c101HackJune2016;
import java.util.*;
public class PointsOnALine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x0 = sc.nextInt(), y0 = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        boolean tryv = false, tryh = false, isLine = true;
        
        if (x0 == x1 && y0 != y1) tryv = true;
        else if (x0 != x1 && y0 == y1) tryh = true;
        if (!tryv && !tryh) System.out.println("NO");
        else {
            for(int i = 2; i < n; i++){
                int x = sc.nextInt(), y = sc.nextInt();
                if (tryv && x != x0) {
                	isLine = false;
                	break;
                }
                if (tryh && y != y0) {
                	isLine = false;
                	break;
                }
            }
    		if (isLine) System.out.println("YES");
    		else System.out.println("NO");
        }

		sc.close();
	}

}
//https://www.hackerrank.com/contests/101hack38/challenges/points-on-a-line
//20160620MonMorning duration:30m49s18 @{hackerrank.com/BryanBoCao, github/BryanBo-Cao}