package algorithms.implementation;
import java.util.*;

public class Encryption {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int c = (int) Math.ceil(Math.sqrt(str.length()));
		char[] cs = str.toCharArray();
		
		//output
		for (int i = 0; i < c; i++) {
			for (int j = i; j < cs.length; j += c) {
				System.out.print(cs[j]);
			}
			System.out.print(' ');
		}
		scn.close();
	}
}

//20160508Sat 19:44 duration:49m51s63 