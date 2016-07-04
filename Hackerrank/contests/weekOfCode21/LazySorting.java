package contests.weekOfCode21;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class LazySorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int allordercnt = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			allordercnt *= i + 1;
		}
		Arrays.sort(arr);
		int sortcnt = 1, pre = arr[0], samecnt = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > pre) {
				if (samecnt != 0) {
					for (int j = samecnt + 1; j >= 2; j--) sortcnt *= samecnt;
					samecnt = 0;
				}
			}
			else if (arr[i] == pre) samecnt++;
		}
		
		double pmnt = -1, mnt = 0;
		for (int i = 1; pmnt != mnt; i++) {
			double ithp = i * Math.pow(1 - (double) sortcnt / allordercnt, i - 1) *((double) sortcnt / allordercnt);
			pmnt = mnt;
			mnt += ithp;
		}
		DecimalFormat df = new DecimalFormat(".000000");
		String mnts = df.format(mnt);
		System.out.println(mnts);
		
		sc.close();
	}

}
//https://www.hackerrank.com/contests/w21/challenges/lazy-sorting
//20160628Tue11:38 duration:54m37s28 WrongAnserInTestCase#3 TimeoutInTestCase#4 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao