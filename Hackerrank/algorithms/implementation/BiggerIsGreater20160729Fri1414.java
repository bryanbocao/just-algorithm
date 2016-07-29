package algorithms.implementation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class BiggerIsGreater20160729Fri1414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			char[] cs = sc.next().toCharArray();
			if (cs.length <= 1) System.out.println("no answer");
			else {
				int len = cs.length;
				if (cs[len - 2] < cs[len - 1]) {
					char ct = cs[cs.length - 1];
					cs[cs.length - 1] = cs[cs.length - 2];
					cs[cs.length - 2] = ct;
					//print
					for (int j = 0; j < cs.length; j++) System.out.print(cs[j]);
					System.out.println();
				} else {
					int lastPeakI = -1;
					for (int j = len - 1; j > 0; j--) {
						if (cs[j - 1] < cs[j]) {
							lastPeakI = j;
							break;
						}
					}
					if (lastPeakI == -1) System.out.println("no answer");
					else {
						List<Character> ls = new ArrayList<Character>();
						ls.add(cs[lastPeakI - 1]);
						int nextMinBiggerAfterLastPeakI = -1;
						for (int j = len - 1; j > lastPeakI - 1; j--) {
							ls.add(cs[j]);
							if (cs[j] > cs[lastPeakI - 1]) {
								if (nextMinBiggerAfterLastPeakI == -1) nextMinBiggerAfterLastPeakI = j;
								else  if (cs[j] < cs[nextMinBiggerAfterLastPeakI]) nextMinBiggerAfterLastPeakI = j;
							}
						}
						ls.remove(new Character(cs[nextMinBiggerAfterLastPeakI]));
						
						//print
						for (int j = 0; j < lastPeakI - 1; j++) System.out.print(cs[j]);
						System.out.print(cs[nextMinBiggerAfterLastPeakI]);
						Collections.sort(ls);
						Iterator<Character> it = ls.iterator();
						while (it.hasNext()) System.out.print(it.next());
						System.out.println();
					}
				}
				
			}
		}
		sc.close();
	}
}
//https://www.hackerrank.com/challenges/bigger-is-greater
//20160729Fri14:14 duration:1h00m43s18 Timeout @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
