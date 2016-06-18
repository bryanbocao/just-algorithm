package algorithms.search;
import java.util.*;
public class CountLuck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt(), c = sc.nextInt();
			char[][] mtx = new char[r][c];
			int mr = -1, mc = -1;
			for (int j = 0; j < r; j++) {
				String s = sc.next();
				char[] cs = s.toCharArray();
				mtx[j] = cs;
				if (s.contains("M")) {
					mr = j;
					for (int ii = 0; ii < s.length(); ii++) {
						if (cs[ii] == 'M') mc = ii;
					}
				}
			}
			int k = sc.nextInt();
			int cntk = countK(mtx, mr, mc);
			if (k == cntk) System.out.println("Impressed");
			else System.out.println("Oops!");
		}
		sc.close();
	}
	
	private static int countK(char[][] mtx, int mr, int mc) {
		int dcnt = 0;
		List<Integer> ls = new ArrayList<Integer>();
		if (mtx[mr][mc] == '*') return 0;
		else{
			mtx[mr][mc] = 'X';
			if (mr - 1 >= 0 && mtx[mr - 1][mc] != 'X') {
				dcnt++;
				ls.add(mr - 1);
				ls.add(mc);
			}
			if (mc - 1 >= 0 && mtx[mr][mc - 1] != 'X') {
				dcnt++;
				ls.add(mr);
				ls.add(mc - 1);
			}
			if (mr + 1 < mtx.length && mtx[mr + 1][mc] != 'X') {
				dcnt++;
				ls.add(mr + 1);
				ls.add(mc);
			}
			if (mc + 1 < mtx[0].length && mtx[mr][mc + 1] != 'X') {
				dcnt++;
				ls.add(mr);
				ls.add(mc + 1);
			}

			if (dcnt >= 1) {
				int maxk = 0;
				Iterator<Integer> it = ls.iterator();
				while (it.hasNext()) {
					int r = it.next(), c = it.next();
					if (dcnt == 1) return countK(mtx, r, c);
					else {
						int nextK = countK(mtx, r, c) + 1;
						if (nextK > maxk) maxk = nextK;
					}
				}
				return maxk;
			} else {
				return 0;
			}
		}
	}
}
//https://www.hackerrank.com/challenges/count-luck
//20160618Sat14:02 duration:16m55s02 Accepted @github.com/BryanBo-Cao