package algorithms.warmup;
import java.util.*;
public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int a0 = sc.nextInt(), a1 = sc.nextInt(), a2 = sc.nextInt();
		int b0 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt();
		if (a0 > b0) a++;
		else if (a0 < b0) b++;
		if (a1 > b1) a++;
		else if (a1 < b1) b++;
		if (a2 > b2) a++;
		else if (a2 < b2) b++;
		System.out.println(a + " " + b);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/compare-the-triplets
//20160714Thu14:46 duration:7m42s10 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao