package womensCodeSprint2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        
	    // BryanBo-Cao's code ====== start 
        Arrays.sort(keyboards);
        Arrays.sort(pendrives);
        boolean end = false;
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
        	int kP = keyboards[i];
        	for (int j = m - 1; j >= 0; j--) {
        		int pP = pendrives[j];
        		if (kP + pP == s) {
        			System.out.println(s);
        			end = true;
        			break;
        		} else if (kP + pP < s) {
        			if (kP + pP > max) max = kP + pP;
        			break;
        		}
        	}
        	if (end) break;
        }
        if (!end) System.out.println(max);
	    // BryanBo-Cao's code ====== end
        
        in.close();
    }
}
//https://www.hackerrank.com/contests/womens-codesprint-2/challenges/electronics-shop
//Result: SovledOn20161119SatNight CodingDuration:786s35 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao