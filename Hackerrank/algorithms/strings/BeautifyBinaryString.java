package algorithms.strings;
import java.util.*;
public class BeautifyBinaryString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String s = sc.next();
		int cnt = 0;
		while (s.contains("010")) {
			s = s.replaceFirst("010", "011");
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/beautiful-binary-string
//20160704Mon17:49 duration:21m45s32 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao