package algorithms.bitmanipulation;
import java.util.*;
public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if (set.contains(input)) {
				set.remove(input);
			} else {
				set.add(input);
			}
		}
		System.out.println(set.iterator().next());
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/lonely-integer
//20160520Fri duration:4m37s73 @BryanBo-Cao
