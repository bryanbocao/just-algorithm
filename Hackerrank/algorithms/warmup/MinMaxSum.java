package algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }
        System.out.println((sum - max) + " " + (sum - min));
        
     }
}

//https://www.hackerrank.com/challenges/mini-max-sum
