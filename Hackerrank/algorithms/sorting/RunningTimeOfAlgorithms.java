package algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
    public static void insertionSort(int[] A){
    	int swCnt = 0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            //while(j > 0 && A[j] > value){
            //MyCode
            while(j >= 0 && A[j] > value){
            ////MyCode
                A[j + 1] = A[j];
                j = j - 1;
                swCnt++;
            }
            A[j + 1] = value;
        }
        System.out.println(swCnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        insertionSort(ar);
        sc.close();
    }
}
