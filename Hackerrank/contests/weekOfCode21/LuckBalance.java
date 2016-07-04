package contests.weekOfCode21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class LuckBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		List<Integer> ls = new ArrayList<Integer>();
		int output = 0;
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt(), t = sc.nextInt();
			if (t == 1) ls.add(l);
			else output += l;
		}
		Collections.sort(ls);
		Collections.reverse(ls);
		Iterator<Integer> it = ls.iterator();
		while (it.hasNext()) {
			if (k-- > 0) output += it.next();
			else output -= it.next();
		}
		System.out.println(output);
		
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w21/challenges/luck-balance
//20160627Mon11:35 duration:22m38s83 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
