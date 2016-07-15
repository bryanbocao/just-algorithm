package dataStructures.stacks;
import java.util.Scanner;
import java.util.Stack;
public class SimpleTextEditor20160715Fri1522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		Stack<StringBuffer> stk = new Stack<StringBuffer>();
		for (int i = 0; i < n; i++) {
			int op = sc.nextInt();
			int k;
			switch(op) {
			case 1:
				stk.push(new StringBuffer(sb));
				String s = sc.next();
				sb.append(s);
				break;
			case 2:
				stk.push(new StringBuffer(sb));
				k = sc.nextInt();
				sb.delete(sb.length() - k, sb.length());
				break;
			case 3:
				k = sc.nextInt();
				System.out.println(sb.charAt(k - 1));
				break;
			case 4:
				sb = stk.pop();
				break;
			}
			
		}
		
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/simple-text-editor
//20160715Fri15:22 duration:33m26s08 TimeoutInTestCase#13 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao