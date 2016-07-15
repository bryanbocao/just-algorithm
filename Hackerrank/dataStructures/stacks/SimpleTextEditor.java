package dataStructures.stacks;
import java.util.Scanner;
import java.util.Stack;
public class SimpleTextEditor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = new String();
		Stack<String> stk = new Stack<String>();
		for (int i = 0; i < n; i++) {
			int op = sc.nextInt();
			int k;
			switch(op) {
			case 1:
				stk.push(new String(s));
				String ss = sc.next();
				s = s + ss;
				break;
			case 2:
				stk.push(new String(s));
				k = sc.nextInt();
				s = s.substring(0, s.length() - k);
				break;
			case 3:
				k = sc.nextInt();
				System.out.println(s.charAt(k - 1));
				break;
			case 4:
				s = stk.pop();
				break;
			}
			
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/simple-text-editor
//20160715Fri15:32 duration:lessThan10Minutes Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao