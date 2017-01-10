package qualifiactionRound_20170106Fri.num3_45_FightingTheZombie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
//			System.out.println();System.out.println();
			print("Case #" + i + ": ");
			int H = sc.nextInt(), S = sc.nextInt();
			double maxP = 0;
			for (int j = 0; j < S; j++) {
//				System.out.println();
				String s = sc.next();
				if (maxP == 1) continue;
				double p = probabilityOfDefeating(s, H);
				if (p == 1) maxP = p;
				else if (p > maxP) maxP = p;
				System.out.println("line 22 p: " + p);
			}
			println(maxP);
		}
		sc.close();
	}
	private static double probabilityOfDefeating(String s, int H) {
		int indexOfD = s.indexOf("d"),
			numOfTimes = Integer.valueOf(s.substring(0, indexOfD)),
			dices = 4, defeatCnt = 0, eventCnt = 0;
		if (s.contains("+")) {
			int indexOfPlus = s.indexOf("+");
			dices = Integer.valueOf(s.substring(indexOfD + 1, indexOfPlus));
			int z = Integer.valueOf(s.substring(indexOfPlus + 1));
			for (int sumOfRolls = numOfTimes + z; sumOfRolls <= dices * numOfTimes + z; sumOfRolls++) {
				if (sumOfRolls >= H) defeatCnt++;
				eventCnt = getEventCount(numOfTimes, sumOfRolls, dices);
			}
		} else if (s.contains("-")) {
			int indexOfMinus = s.indexOf("-");
			dices = Integer.valueOf(s.substring(indexOfD + 1, indexOfMinus));
			int z = Integer.valueOf(s.substring(indexOfMinus + 1));
			for (int sumOfRolls = numOfTimes - z; sumOfRolls <= dices * numOfTimes - z; sumOfRolls++) {
				if (sumOfRolls >= H) defeatCnt++;
				eventCnt = getEventCount(numOfTimes, sumOfRolls, dices);
			}
		} else {
			dices = Integer.valueOf(s.substring(indexOfD + 1));
			for (int sumOfRolls = numOfTimes; sumOfRolls <= dices * numOfTimes; sumOfRolls++) {
				if (sumOfRolls >= H) defeatCnt++;
				eventCnt = getEventCount(numOfTimes, sumOfRolls, dices);
			}
			
		}
		return ((double) defeatCnt) / ((double) eventCnt);
	}
	private static int getEventCount(int numOfTimes, int sumOfRolls, int dices) {
		int num = sumOfRolls % numOfTimes, eventCnt = 0;
		if (num == 0) eventCnt++;
		else {
			int crrtEventCnt = 1;
			for (int ii = 0; ii < num; ii++) crrtEventCnt *= (dices - numOfTimes);
			eventCnt += crrtEventCnt;
		}
		return eventCnt;
	}
	
	private static void print(String s) {System.out.print(s);}
	private static void println(double d) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(6);
		System.out.println(d);
	}
	
}
//48m17s12
//TriedOn20170106Fri CodingDuration:48m17s12 WrongAnswer