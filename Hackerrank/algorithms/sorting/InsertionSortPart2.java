package algorithms.sorting;
import java.util.*;
public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar) {       
        //My Code
		if (ar.length == 1) {
			printArray(ar);
		} else {
			for (int i = 1; i < ar.length; i++) {
				printArray(insertionSortPart1(ar, i));
			}
		}
		////My Code
    }
    
	//My Code
	private static int[] insertionSortPart1(int[] arr, int ei) {
		int e = arr[ei];
		boolean isFirst = true;
		for (int i = ei; i - 1 >= 0; i--) {
			if (arr[i - 1] > e)	{
				arr[i] = arr[i - 1];
			} else {
				arr[i] = e;
				isFirst = false;
				break;
			}
		}
		if (isFirst) {
			arr[0] = e;
		}
		return arr;
	}
		
	////My Code
		
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
    }
    
}
//20160601Wed duration: 51m26s51