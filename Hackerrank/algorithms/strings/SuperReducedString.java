package algorithms.strings;
import java.util.*;
public class SuperReducedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.next());
		boolean hasSame = true;
		while (hasSame) {
			hasSame = false;
			for (int i = 0; i < sb.length(); i++) {
				if (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
					hasSame =  true;
					sb.delete(i, i + 2);
					continue;
				}
			}
		}
		if (sb.length() == 0) System.out.println("Empty String");
		else System.out.println(sb.toString());
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/reduced-string
//20160705Tue10:30 duration:16m58s92 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao