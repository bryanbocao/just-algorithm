package SRM723.problem2;

public class TopXorerEasy {
	public int maximalRating(int A, int B, int C) {
		int max = 0;
		int ab = 0;
		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				ab = a ^ b;
				int abc = 0;
				for (int c = 0; c <= C; c++) {
					abc = ab ^ c;
					if (abc > max) max = abc;
				}
			}
		}
		return max;
	}
}
/*
Problem Statement
Like Topcoder, TopXorer uses a rating system. The rating of each person is a non-negative integer. 

You are a coach. You want to select a three-person team. You have the following goals: 
The rating of the first team member must be between 0 and A, inclusive.
The rating of the second team member must be between 0 and B, inclusive.
The rating of the third team member must be between 0 and C, inclusive.
As the name suggests, the rating of a team in TopXorer is computed as the bitwise xor of the ratings of the three team members. 

You are given the s A, B, and C. Please compute and return the maximal team rating your team can have.
Definition
Class: TopXorerEasy
Method: maximalRating
Parameters: int, int, int
Returns: int
Method signature: int maximalRating(int A, int B, int C)
(be sure your method is public)
Limits
Time limit (s): 2.000
Memory limit (MB): 256
Constraints
- A will be between 0 and 1,000,000,000, inclusive.
- B will be between 0 and 1,000,000,000, inclusive.
- C will be between 0 and 1,000,000,000, inclusive.
Examples
0)
2
1
0
Returns: 3
One of the optimal solutions is to select people with ratings (2, 1, 0). The team rating will then be (2 xor 1 xor 0) = 3.
1)
1
2
4
Returns: 7
Here the only optimal solution is to select people with the largest possible ratings: (1, 2, 4).
2)
3
4
5
Returns: 7
3)
1
100
10000
Returns: 10101
4)
1000000000
1000000000
1000000000
Returns: 1073741823
5)
0
0
0
Returns: 0
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/
//Been challenged successfully.