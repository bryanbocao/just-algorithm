package algorithms.implementation;

import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scn.nextInt();
            int height = 1;
            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) {
                    height *= 2;
                } else {
                    height += 1;
                }
            }
            System.out.println(height);
        }
        scn.close();
    }
}