package qualifiactionRound_20170106Fri.num1_25_ProgressPie;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			print("Case #" + i + ": ");
			int p = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			if (p == 0) println("white");
			else {
				if (x == 50 && y == 50) println("black");
				int	dx = Math.abs(x - 50), dy = Math.abs(y - 50);
				double r = Math.sqrt(dx * dx + dy * dy);
				if (r > 50) println("white");
				else { // the point is within the r range to (50, 50)
					//println("line 21");
					if (dx == 0) {
						if (dy > 0) println("black");
						else if (p >= 50) println("black");
						else println("white");
					} else {
						double pointDegreeFromXPositiveAntiClockwise = Math.toDegrees(Math.atan2(dy, dx));
						double pDegreeFromTopClockwise = -3.6 * p - 90, pDegreeFromXPositiveAntiClockwise = -(pDegreeFromTopClockwise + 90);
						//System.out.println(pointDegreeFromXPositiveAntiClockwise);
						//System.out.println(pDegreeFromXPositiveAntiClockwise);
						if (pointDegreeFromXPositiveAntiClockwise <= pDegreeFromXPositiveAntiClockwise) println("black");
						else println("white");
					}
				}
			}
		}
		sc.close();
	}
	
	private static void print(String s) {System.out.print(s);}
	private static void println(String s) {System.out.println(s);}
}
//TriedOn20170106Fri CodingDuration:57m49s45 WrongAnswer