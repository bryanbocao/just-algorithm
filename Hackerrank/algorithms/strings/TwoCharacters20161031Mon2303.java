package algorithm.strings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class TwoCharacters20161031Mon2303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String s = sc.next();
		char[] cs = s.toCharArray();
		List<Character> cLs = new ArrayList<Character>();
		Set<Character> noSet = new HashSet<Character>();
		
		//iterate once
		char preC = cs[0];
        cLs.add(preC);
		for (int i = 1; i < cs.length; i++) {
			if (!noSet.contains(cs[i])) {
				if (cs[i] == preC) {
					if (cLs.contains(cs[i])) {
						noSet.add(cs[i]);
						cLs.remove(new Character(cs[i]));
					}
					continue;
				}
				if (!cLs.contains(cs[i])) cLs.add(cs[i]);
				preC = cs[i];
			}
		}
		
		int maxLen = 0;
		for (int i = 0; i < cLs.size(); i++) {
			char c0 = cLs.get(i);
            
           // System.out.println("line 35");
           // System.out.println(c0);
			for (int j = i + 1; j < cLs.size(); j++) {
              //  System.out.println("line 37");
                int tLen = 1;
				char c1 = cLs.get(j);
              //  System.out.println(c1);
				int i0 = s.indexOf(c0), i1 = s.indexOf(c1);
              //  System.out.println(i0);
              //  System.out.println(i1);
				boolean i0First = (i0 < i1) ? true : false;
				while (i0 != -1 && i1 != -1) {
                   // System.out.println("line 41");
					if (i0First) {
						i0 = s.indexOf(c0, i0 + 1);
                     //   System.out.println("line 50 " + i0);
						if (i0 != -1 && i0 < i1) {
							tLen = 0;
							break;
						}
						i0First = false;
					} else {
						i1 = s.indexOf(c1, i1 + 1);
                      //  System.out.println("line 59 " + i1);
						if (i1 != -1 && i1 < i0) {
							tLen = 0;
							break;
						}
						i0First = true;
					}
					tLen++;
                    //System.out.println("line 65: " + tLen);
				}
                if (tLen > maxLen) maxLen = tLen;
			}
			
		}
		
		sc.close();
		System.out.println(maxLen);
	}

}
//https://www.hackerrank.com/challenges/two-characters
//TriedOn20161031Mon23:03 CodingDuration:1h21m21s53 WrongAnswer FailedAtTestCase{#16, #28} @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao       