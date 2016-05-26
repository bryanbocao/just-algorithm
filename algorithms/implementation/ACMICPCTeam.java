package algorithms.implementation;

import java.util.*;
public class ACMICPCTeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		char[][] mtx = new char[N][M];
		for (int i = 0; i < N; i++) {
			mtx[i] = sc.next().toCharArray();
		}
		int maxTopics = 0, numOfTeamToMaxTopics = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int tempMaxTopics = 0;
				for (int ii = 0; ii < M; ii++) {
					if (mtx[i][ii] == '1' || mtx[j][ii] == '1') {
						tempMaxTopics++;
					}
				}
				if (tempMaxTopics > maxTopics) {
					maxTopics = tempMaxTopics;
					numOfTeamToMaxTopics = 1;
				} else if (tempMaxTopics == maxTopics) numOfTeamToMaxTopics++;
			}
		}
		System.out.println(maxTopics);
		System.out.println(numOfTeamToMaxTopics);
		
		sc.close();
	}

}
//20160526Thu15:10 duration:16m30s32
