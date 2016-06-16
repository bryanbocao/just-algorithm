package algorithms.search;
import java.util.*;
public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n == 1) {
				sc.nextInt();
				System.out.println("YES");
			} else if (n == 2) {
				sc.nextInt();
				sc.nextInt();
				System.out.println("NO");
			} else if (n == 3) {
				int arr0 = sc.nextInt();
				sc.nextInt();
				int arr2 = sc.nextInt();
				if (arr0 == arr2) System.out.println("YES");
				else System.out.println("NO");
			} else {
				int[] arr = new int[n];
				int sum = 0;
				for (int j = 0; j < n; j++) {
					arr[j] = sc.nextInt();
					sum += arr[j];
				}
				boolean YES = false;
				int lsum = 0, rsum = sum - arr[0];
				for (int j = 1; j < n - 1; j++) {
					lsum += arr[j - 1];
					rsum -= arr[j];
					if (rsum == lsum) {
						YES = true;
						break;
					}
				}
				if (YES) System.out.println("YES");
				else System.out.println("NO");
			}
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/sherlock-and-array
//20160616Thu10:33 duration:23s71 Accepted @github.com/BryanBo-Cao
