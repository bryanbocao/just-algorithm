package artificialIntelligence.botBuilding;

import java.util.*;

public class BotSavesPrincess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] mtx = new char[n][n];
		for (int i = 0; i < n; i++) {
			mtx[i] = sc.next().toCharArray();
		}
		
		int mr = -1, mc = -1, pr = -1, pc = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mtx[i][j] == 'm') {
					mr = i; mc = j;
				}
				if (mtx[i][j] == 'p') {
					pr = i; pc = j;
				}
			}
		}
		
		int rdiff = mr - pr, cdiff = mc - pc;
		while (rdiff != 0) {
			if (rdiff > 0) {
				System.out.println("UP");
				rdiff--;
			} else {
				System.out.println("DOWN");
				rdiff++;
			}
		}
		while (cdiff != 0) {
			if (cdiff > 0) {
				System.out.println("LEFT");
				cdiff--;
			} else {
				System.out.println("RIGHT");
				cdiff++;
			}
		}
		sc.close();
	}
}
//20160614Tue10:54 duration:23m56s17 @BryanBo-Cao
