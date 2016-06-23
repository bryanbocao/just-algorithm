package algorithms.gameTheory;

import java.util.*;
public class GameOfStones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n % 7 == 0 || (n - 1) % 7 == 0) System.out.println("Second");
			else System.out.println("First");
		}
		sc.close();
	}
}
//https://www.hackerrank.com/challenges/game-of-stones-1
//20160623Thu11:31 duration:28m37s19 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao