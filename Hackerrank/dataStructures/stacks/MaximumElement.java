package dataStructures.stacks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyStack mstk = new MyStack();
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
//			System.out.println();
//			mstk.printList();
			switch (c) {
				case 1:
					int next = sc.nextInt();
//					System.out.println("push " + next);
					mstk.push(next);
				break;
				case 2:
					mstk.pop();
				break;
				case 3:
					mstk.printMax();
//					System.out.println();
				break;
			}
		}
		
		sc.close();
	}
	
}

class MyStack {
	List<Integer> ls = null;
	boolean savedMax;
	int max;
	
	public MyStack() {
		ls = new ArrayList<Integer>();
		savedMax = false;
		max = 0;
	}
	
	public void push(int num) {
		ls.add(num);
		if (!savedMax) {
			if (ls.size() == 1) max = num;
			else {
				List<Integer> tls = new ArrayList<Integer>();
				tls.addAll(ls);
				Collections.sort(tls);
				max = tls.get(tls.size() - 1);
			}
		} else if (num > max) max = num;
		savedMax = true;
	}
	
	public int pop() {
		if (ls.get(ls.size() - 1) == max){
			max = 0;
			savedMax = false;
		}
		return ls.remove(ls.size() - 1);
	}
	
	public void printMax() {
		System.out.print("print max: ");
		if (savedMax) System.out.println(max);
		else {
			List<Integer> tls = new ArrayList<Integer>();
			tls.addAll(ls);
			Collections.sort(tls);
			System.out.println(tls.get(tls.size() - 1));
		}
	}
	
	public void printList() {
		Iterator<Integer> it = ls.iterator();
		System.out.print("print ls :");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" savedMax: " + savedMax);
	}
}
//https://www.hackerrank.com/challenges/maximum-element
//20160713Wed19:07 duration: 1h13m40s28 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao