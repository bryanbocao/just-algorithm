package dataStructures.heap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class QHEAP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt(), min = 0;
		boolean minAssigned = false;
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < q; i++) {
			int qr = sc.nextInt();
			switch (qr) {
			case 1:
				int v = sc.nextInt();
				if (!ls.contains(v)) {
					ls.add(v);
                    if (minAssigned) {
                        if (v < min) min = v;
                    } else if (ls.isEmpty()) min = v;
					minAssigned = true;
				}
				break;
			case 2:
				v = sc.nextInt();
				if (v == min) minAssigned = false;
				ls.remove(new Integer(v));
				break;
			case 3:
				if (!minAssigned) {
					Collections.sort(ls);
					min = ls.get(0);
                    minAssigned = true;
                    System.out.println("line 36");
				}
				System.out.println(min);
			}
		}
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/qheap1
//20160804Thu19:24 duration:40m41s38 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

