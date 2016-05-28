//not tested
package PracticeContests.PracticeContest;
import java.util.*;
public class ProblamA_OldMagician {

	public static void main(String[] args) {
		//input data
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int w = sc.nextInt(), b = sc.nextInt();
			String ostr = "WHITE";
			//process
			if (b % 2 == 0) ostr = "BLACK";
			System.out.println("Case #" + (i + 1) + ": " + ostr);
		}
		
	}

}
