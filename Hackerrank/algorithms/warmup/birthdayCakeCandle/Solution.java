package algorithms.warmup.birthdayCakeCandle;

import java.util.Scanner;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max_h = 0, cnt = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max_h) {
                max_h = ar[i];
                cnt = 1;
            } else if (ar[i] == max_h) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
/*
https://www.hackerrank.com/challenges/birthday-cake-candles/problem
Birthday Cake Candles
by shashank21j
Problem
Submissions
Leaderboard
Discussions
Editorial
You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones.

For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out  candles successfully, since the tallest candle is of height  and there are  such candles.

Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.

Input Format

integer

Colleen's age 
 space-separated integers

candle heights 
Output Format

Print the number of candles Colleen blows out.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

We have one candle of height , one candle of height , and two candles of height . Your niece only blows out the tallest candles, meaning the candles where . Because there are  such candles, we print  on a new line.
*/
////SolvedOn2018Mar15Thu CodingDuration3m26s32