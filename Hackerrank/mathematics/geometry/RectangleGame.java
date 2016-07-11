package mathematics.geometry;
import java.util.*;
public class RectangleGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long minr = 0, minc = 0;
		for (int i = 0; i < t; i++) {
			long r = sc.nextInt();
			long c = sc.nextInt();
            if (i == 0) {
                minr = r;
                minc = c;
            }
			if (r < minr) minr = r;
			if (c < minc) minc = c;
		}
		System.out.println(minr * minc);
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/rectangular-game
//20160711Mon09:52 duration:15m14s32 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao