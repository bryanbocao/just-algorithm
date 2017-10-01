package universityCodeSprint3_20170929Fri.problem1_ASmallStepTowardCalculators;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(String opr) {
        // Complete this function
        if (opr.contains("+")) {
            int i = opr.indexOf("+");
            return Integer.parseInt(opr.substring(0, i)) + Integer.parseInt(opr.substring(i + 1));
        } else {
            int i = opr.indexOf("-");
            return Integer.parseInt(opr.substring(0, i)) - Integer.parseInt(opr.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
//https://www.hackerrank.com/contests/university-codesprint-3/challenges/a-small-step-toward-calculators
//SolvedOn20170929Sat CodingDuration:10m04s05 

