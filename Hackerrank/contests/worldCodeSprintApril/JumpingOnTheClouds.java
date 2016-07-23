package worldCodeSprintApril;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = scanner.nextInt();
		}

		int jumpCount = 0;
		for (int i = 0; i < n;) {
			if (i + 2 == n - 1) { // end
				jumpCount++;
				break;
			} else if (i + 1 == n - 1) { // end
				jumpCount++;
				break;
			} else { // in progress
				if (c[i + 2] == 0) { // see if Emma can jump 2 steps
					jumpCount++;
					i += 2;
				} else { // Emma can't jump 2 steps this time
					if (c[i + 1] == 0) {
						jumpCount++;
						i++;
					}
				}
			}
		}
		System.out.println(jumpCount);
		scanner.close();
	}
}


/*

Emma is playing a new mobile game involving nn clouds numbered from 00 to n−1n−1. A player initially starts out on cloud c0c0, and they must jump to cloud cn−1cn−1. In each step, she can jump from any cloud ii to cloud i+1i+1 or cloud i+2i+2.

There are two types of clouds, ordinary clouds and thunderclouds. The game ends if Emma jumps onto a thundercloud, but if she reaches the last cloud (i.e., cn−1cn−1), she wins the game!

jump(1).png

Can you find the minimum number of jumps Emma must make to win the game? It is guaranteed that clouds c0c0 and cn−1cn−1 are ordinary-clouds and it is always possible to win the game.

Input Format

The first line contains an integer, nn (the total number of clouds). 
The second line contains nn space-separated binary integers describing clouds c0,c1,…,cn−1c0,c1,…,cn−1.

If ci=0, the ith cloud is an ordinary cloud.
If ci=1, the ith cloud is a thundercloud.
Constraints

2≤n≤100
ci∈{0,1}
c0=cn−1=0
Output Format

Print the minimum number of jumps needed to win the game.

Sample Input 0

7
0 0 1 0 0 1 0
Sample Output 0

4
Sample Input 1

6
0 0 0 0 1 0
Sample Output 1

3
Explanation

Sample Case 0: 
Because c2c2 and c5c5 in our input are both 11, Emma must avoid c2c2 and c5c5. Bearing this in mind, she can win the game with a minimum of 44 jumps:

jump(2).png

Sample Case 1: 
The only thundercloud to avoid is c4c4. Emma can win the game in 33 jumps:

jump(5).png

*/

/*
Solved
20160429Fri
*/