package dataStructures.queues;
import java.util.Scanner;
import java.util.Stack;
public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int tp = sc.nextInt();
			switch(tp) {
			case 1:
				int num = sc.nextInt();
				stk.push(num);
				break;
			case 2:
				if (!stk.isEmpty()) stk.remove(0);
				break;
			case 3:
				System.out.println(stk.firstElement());
				break;
			}
		}
		
		sc.close();
	}
	
}
//https://www.hackerrank.com/challenges/queue-using-two-stacks
//20160725Mon17:52 duration:20m16s61 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 