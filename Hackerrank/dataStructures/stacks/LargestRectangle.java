package dataStructures.stacks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LargestRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), maxArea = 0;
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			if (h == 0 || i == n - 1) {
				int area = getMaxArea(ls);
				if (area > maxArea) maxArea = area;
				ls = new ArrayList<Integer>();
			} else if (h > 0) ls.add(h); 
		}
		System.out.println(maxArea);
		sc.close();
	}
	
	private static int getMaxArea(List<Integer> ls) {
		int maxArea = 0;
		for (int i = 0; i < ls.size(); i++) {
			int h = ls.get(i);
			int area = h;
			for (int j = i + 1; j < ls.size(); j++) if (ls.get(j) >= h) area += h;
			if (area > maxArea) maxArea = area;	
		}
		System.out.println("line 31");
		System.out.println(maxArea);
		return maxArea;
	}
}
//https://www.hackerrank.com/challenges/largest-rectangle
//TryOn20160830TueAt17:58 CodingDuration:22m33s50 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
