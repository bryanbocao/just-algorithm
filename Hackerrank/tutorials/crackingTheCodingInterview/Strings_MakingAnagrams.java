package tutorials.crackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strings_MakingAnagrams {

    public static int numberNeeded(String first, String second) {
    	List<Character> lsF = new ArrayList<Character>(),
    			lsS = new ArrayList<Character>();
        char[] csF = first.toCharArray(), csS = second.toCharArray();
        for (int i = 0; i < csF.length; i++) lsF.add(csF[i]);
        for (int i = 0; i < csS.length; i++) lsS.add(csS[i]);
        int lenF = first.length(), lenS = second.length();
        lsF.retainAll(lsS);
        return lenF + lenS - lsF.size() * 2;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
    }
}
//https://www.hackerrank.com/challenges/ctci-making-anagrams
//TriedOn20161117Thu10:56 CodingDuration:23m04s90 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao