package algorithms.sorting;
import java.util.*;
public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), v = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input == n) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
//20160527Fri22:05 duration:7m36s81