package algorithms.sorting;
import java.util.*;
public class InsertionSortPart1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size == 1) {
			System.out.println(sc.nextInt());
		} else {
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int e = arr[size - 1];
			boolean isFirst = true;
			for (int i = size - 1; i - 1 >= 0; i--) {
				if (arr[i - 1] > e)	{
					arr[i] = arr[i - 1];
					printArr(arr);
				} else {
					arr[i] = e;
					printArr(arr);
					isFirst = false;
					break;
				}
			}
			if (isFirst) {
				arr[0] = e;
				printArr(arr);
			}
		}
		sc.close();
	}
	
	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(' ');
		}
		System.out.println();
	}

}
//20160528Sat11:37 duration:19m22s31
