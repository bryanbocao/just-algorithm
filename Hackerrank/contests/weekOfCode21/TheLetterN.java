package contests.weekOfCode21;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class TheLetterN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> ls = new ArrayList<Point>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			Point p = new Point(x, y);
			ls.add(p);
		}
		Set<Letter> set = new MySet<Letter>();
		//start -- iterator all points
		int size = ls.size();
		for (int ia = 0; ia < size; ia++) {
			Point a = ls.get(ia);
			for (int ib = 0; ib < size; ib++) {
				if (ib == ia) continue;
				Point b = ls.get(ib);
				for (int ic = 0; ic < size; ic++) {
					if (ic == ib || ic == ia) continue;
					Point c = ls.get(ic);
					for (int id = 0; id < size; id++) {
						if (id == ic || id == ib || id == ia) continue;
//						System.out.println("line 31 ia ib ic id: " + ia + " " + ib + " " + ic + " " +id);
						Point d = ls.get(id);
						if (isN(a, b, c, d)) {
							if (!set.contains(new Letter(d, c, b, a))) {
								set.add(new Letter(a, b, c, d));
							}
							
//							if (set.contains(new Letter(a, b, c, d))) System.out.println("contains!!");
//							if (new Letter(a, b, c, d).equals(new Letter(a, b, c, d))) System.out.println("equal!");
						}
					}
				}
			}
		}
		//end -- iterator all points
		System.out.println(set.size());
//		Iterator<Letter> it = set.iterator();
//		while (it.hasNext()) {
//			Letter l = it.next();
//			System.out.println("A: " + l.a.getX() + " " + l.a.getY());
//			System.out.println("B: " + l.b.getX() + " " + l.b.getY());
//			System.out.println("C: " + l.c.getX() + " " + l.c.getY());
//			System.out.println("D: " + l.d.getX() + " " + l.d.getY());
//			System.out.println();
//		}
		
		sc.close();
	}
	
	private static boolean isN(Point a, Point b, Point c, Point d) {
		
		//condition 1 && 2
		if (c.getX() - b.getX() == 0) {
			if (c.getY() - b.getY() > 0) {
				if (a.getX() <= b.getX() || d.getX() >= b.getX()) return false;
			} else if (c.getY() - b.getY() < 0) {
				if (a.getX() >= b.getX() || d.getX() <= b.getX()) return false;
			}
		} else {
			double kbc = (double)(c.getY() - b.getY()) / (double)(c.getX() - b.getX());
			double bias = c.getY() - kbc * c.getX();
			if (kbc == 0) {
				if (c.getX() > b.getX()) {
					if (a.getY() >= 0 || d.getY() <= 0) return false;
				}
				else if (c.getX() < b.getX()) {
					if (a.getY() <= 0 || d.getY() >= 0) return false;
				}
			} else if (kbc > 0) {
				if (c.getY() > b.getY()) {
					if (a.getY() >= kbc * a.getX() + bias || d.getY() <= kbc * d.getX() + bias) return false;
				}
				else if (c.getY() < b.getY()) {
					if (a.getY() <= kbc * a.getX() + bias || d.getY() >= kbc * d.getX() + bias) return false;
				}
			} else { //kbc < 0
				if (c.getY() > b.getY()) {
					if (a.getY() <= kbc * a.getX() + bias || d.getY() >= kbc * d.getX() + bias) return false;
				}
				else if (c.getY() < b.getY()) {
					if (a.getY() >= kbc * a.getX() + bias || d.getY() <= kbc * a.getX() + bias) return false;
				}
			}
		}
		
		//condition 3
		int ab2 = (int) (Math.pow(b.getY() - a.getY(), 2) + Math.pow(b.getX() - a.getX(), 2));
		int bc2 = (int) (Math.pow(c.getY() - b.getY(), 2) + Math.pow(c.getX() - b.getX(), 2));
		int ac2 = (int) (Math.pow(c.getY() - a.getY(), 2) + Math.pow(c.getX() - a.getX(), 2));
		if (ac2 >= ab2 + bc2) return false;
		
		//condition 4
		int cd2 = (int) (Math.pow(d.getY() - c.getY(), 2) + Math.pow(d.getX() - c.getX(), 2));
		int bd2 = (int) (Math.pow(d.getY() - b.getY(), 2) + Math.pow(d.getX() - b.getX(), 2));
		if (bd2 >= bc2 + cd2) return false;
		return true;
	}

}

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
}

class Letter {
	Point a, b, c, d;
	public Letter(Point a, Point b, Point c, Point d) {
		this.a = a; this.b = b; this.c = c; this.d = d;
	}
	public boolean equals(Object o) {
		Letter l = (Letter) o;
		if (this.a == l.a && this.b == l.b && this.c == l.c && this.d == l.d) return true;
		else return false;
	}
}

class MySet<Letter> extends HashSet {
	public MySet() {super();}
	public boolean contains(Object o) {
		Letter l = (Letter) o;
		Iterator<Letter> it = this.iterator();
		while (it.hasNext()) {
			if (l.equals(it.next())) return true;
		}
		return false;
	}
}
//https://www.hackerrank.com/contests/w21/challenges/n-letter
//20160630Thu13:28 duration:1h41m50s17 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao