package algorithms.sorting;
import java.util.*;
public class Quicksort1Partition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		List<Integer> ll = new ArrayList<Integer>(),
				el = new ArrayList<Integer>(),
				rl= new ArrayList<Integer>();
		arr[0] = sc.nextInt();
		el.add(arr[0]);
		for (int i = 1; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < arr[0]) ll.add(arr[i]);
			else if (arr[i] == arr[0]) el.add(arr[i]);
			else rl.add(arr[i]);
		}
		Iterator<Integer> itl = ll.iterator(),
				ite = el.iterator(),
				itr = rl.iterator();
		int ii = 0;
		while (itl.hasNext()) arr[ii++] = itl.next();
		while (ite.hasNext()) arr[ii++] = ite.next();
		while (itr.hasNext()) arr[ii++] = itr.next();
		for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
	}

}
//20160603Fri11:44 duration: 17m47s49 @BryanBo-Cao
