package regex.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {    

    public static void main(String[] args) {
        Tester tester = new Tester();
        
        // BryanBo-Cao's code ====== start
        tester.check(".{3}\\..{3}\\..{3}\\..{3}"); 
        // BryanBo-Cao's code ====== end
    }
}

class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        
        System.out.format("%s", match);
    }   
    
}
//https://www.hackerrank.com/challenges/matching-anything-but-new-line
//20160813Sat23:04 CodingDuration:6m56s17 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
