package kickstart.year2018.roundA.problem.a.small;
import java.util.*;
import java.io.*;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for (int i_n = 1; i_n <= t; i_n++) {
			int n = in.nextInt();
			//start
			int res = 0;
			if (n < 10) {
				if (n % 2 == 1) res = 1;
			} else {
				List<Integer> digits = new ArrayList<Integer>();
				int odd_i = -1, d_i = 0, t_n = n;
				while (t_n > 0) {
					int d = t_n % 10;
					digits.add(d);
					if (d % 2 == 1)
						odd_i = d_i;
					d_i++;
					t_n /= 10;
				}
				
				if (odd_i > -1) {
					int temp_up = 0, temp_down = 0, first_odd_digit = digits.get(odd_i), len = digits.size();
					if (first_odd_digit == 9) {
						// get temp_down
						for (int i = len - 1; i >= 0; i--) {
							temp_down *= 10;
							if (i == odd_i) temp_down += first_odd_digit - 1;
							else if (i < odd_i) temp_down += 8;
							else temp_down += digits.get(i);
						}
						res = n - temp_down;
					} else {
						if (odd_i < 1) res = 1;
						else {
							// get temp_up
							for (int i = len - 1; i >= 0; i--) {
								temp_up *= 10;
								if (i == odd_i) temp_up += first_odd_digit + 1;
								else if (i < odd_i) temp_down += 0;
								else temp_up += digits.get(i);
							}
							
							// get temp_down
							for (int i = len - 1; i >= 0; i--) {
								temp_down *= 10;
								if (i == odd_i) temp_down += first_odd_digit - 1;
								else if (i < odd_i) temp_down += 8;
								else temp_down += digits.get(i);
							}
							
							res = Math.min(temp_up - n, n - temp_down);
						}
					}
				}
				
			}
			System.out.println("Case #" + i_n + " " + res);
			
			//end
		}
		in.close();
	}
}

/*
2356623
	2400000 - 2356623
3, 4	<10
	odd 1
	even 0
24690
	out: 24690 - 24688
10364
1246
*/