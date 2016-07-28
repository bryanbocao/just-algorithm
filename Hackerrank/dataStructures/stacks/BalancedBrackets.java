package dataStructures.stacks;
import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			boolean yes = true;
			String s = sc.next();
			Stack<Character> stk = new Stack<Character>();
			if (s.length() > 0) {
				char[] cs = s.toCharArray();
				for (int j = 0; j < cs.length; j++) {
					if (cs[j] == '(' || cs[j] == '[' || cs[j] == '{') stk.push(cs[j]);
					else {
						if (stk.size() == 0) {
							yes = false;
							break;
						} else {
							if (cs[j] == ')') {
								if (stk.pop() != '(') {
									yes = false;
									break;
								}
							} else if (cs[j] == ']') {
								if (stk.pop() != '[') {
									yes = false;
									break;
								}
							} else if (cs[j] == '}') {
								if (stk.pop() != '{') {
									yes = false;
									break;
								}
							}
						}
					}
				}
			}
			
			if (yes) {
				if (stk.size() == 0) System.out.println("YES");
				else System.out.println("NO");
			}
			else System.out.println("NO");
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/balanced-brackets
//20160728Thu14:27 duration:18m04s62 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 