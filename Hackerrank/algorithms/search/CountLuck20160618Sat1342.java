package algorithms.search;
import java.util.*;
public class CountLuck20160618Sat1342 {

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
			System.out.println(cntk);
		}
		sc.close();
	}
	
	private static int countK(char[][] mtx, int mr, int mc) {
		int dcnt = 0;
		List<Integer> ls = new ArrayList<Integer>();
		if (mr - 1 >= 0) {
			char c = mtx[mr - 1][mc];
			if (c == '.') {
				dcnt++;
				ls.add(mr - 1);
				ls.add(mc);
				mtx[mr - 1][mc] = 'X';
			} else if (c == '*') return 0;
		}
		if (mc - 1 >= 0) {
			char c = mtx[mr][mc - 1];
			if (c == '.') {
				dcnt++;
				ls.add(mr);
				ls.add(mc - 1);
				mtx[mr][mc - 1] = 'X';
			} else if (c == '*') return 0;
		}
		if (mr + 1 < mtx.length) {
			char c = mtx[mr + 1][mc];
			if (c == '.') {
				dcnt++;
				ls.add(mr + 1);
				ls.add(mc);
				mtx[mr + 1][mc] = 'X';
			} else if (c == '*') return 0;
		}
		if (mc + 1 < mtx[0].length) {
			char c = mtx[mr][mc + 1];
			if (c == '.') {
				dcnt++;
				ls.add(mr);
				ls.add(mc + 1);
				mtx[mr][mc + 1] = 'X';
			} else if (c == '*') return 0;
		}

		if (dcnt >= 1) {
			int maxk = 0;
			Iterator<Integer> it = ls.iterator();
			while (it.hasNext()) {
				int r = it.next(), c = it.next();
				if (dcnt == 1) {
					return countK(mtx, r, c);
				}
				int nextK = countK(mtx, r, c) + 1;
				if (nextK > maxk) maxk = nextK;
			}
			return maxk;
		} else {
			return 0;
		}
	}
}
//https://www.hackerrank.com/challenges/count-luck
//20160618Sat13:42 duration:49m59s90 NotPassed @github.com/BryanBo-Cao