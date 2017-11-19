package SRM723.problem3;

public class SimpleMazeEasy {
	 int findSum(long n) {
		 // first cube
		 int sum = 0;
		 for (long i = 0; i < n; i++) {
			 for (long j = 0; j < n; j++) {
				 // iterate distance
				 // top
				 for (long ii = 0; ii < n; i++) {
					 for (long jj = 0; jj < n; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
				 
				 // left
				 for (long ii = n; ii < n + n; i++) {
					 for (long jj = -n; jj < 0; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
				 
				 // middle
				 for (long ii = n; ii < n * 2; i++) {
					 for (long jj = 0; jj < n; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
				 
				 // right
				 for (long ii = n; ii < n * 2; i++) {
					 for (long jj = n; jj < n * 2; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
				 
				 // down
				 for (long ii = n * 2; ii < n * 3; i++) {
					 for (long jj = 0; jj < n; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
			 }
			 
		 }
		 
		 // middle 3 cubes
		 for (long i = n; i < n * 2; i++) {
			 for (long j = -n; j < n; j++) {
				 // iterate distance
				 // middle 3 cubes
				 for (long ii = n; ii < n * 2; i++) {
					 for (long jj = -n; jj < n; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
				 
				 //down
				 for (long ii = n * 2; ii < n * 3; i++) {
					 for (long jj = 0; jj < n; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
			 }
			 
		 }
		 
		 // down
		 for (long i = n * 2; i < n * 3; i++) {
			 for (long j = 0; j < n; j++) {
				 // iterate distance
				 //down
				 for (long ii = n * 2; ii < n * 3; i++) {
					 for (long jj = 0; jj < n; jj++) {
						 if (i != ii && j != jj)
							 sum += Math.abs(ii - i) + Math.abs(jj - j) % (1000000000 + 7);
					 }
				 }
			 }
		 }
		 return sum;
	 }
}
/*
Problem Statement
A level-n simple maze consists of five squares arranged into the shape of a cross. Each square consists of n times n rooms, each having the shape of a unit square. Simple mazes of level 1 and level 3 are shown below, with each '.' representing one cell. 

 .
...
 .

   ...
   ...
   ...
.........
.........
.........
   ...
   ...
   ...


In a single step you can move from your current room into any room that shares a side with your room. The distance between two rooms is the smallest number of steps needed to get from one room to the other. 

You are given the n. Consider the level-n simple maze. For each pair of rooms compute their distance. Let S be the sum of all those distances. Compute and return the value S modulo (10^9 + 7).
Definition
Class: SimpleMazeEasy
Method: findSum
Parameters: long
Returns: int
Method signature: int findSum(long n)
(be sure your method is public)
Limits
Time limit (s): 2.000
Memory limit (MB): 256
Constraints
- n will be between 1 and 1,000,000,000,000,000,000 (10^18), inclusive.
Examples
0)
1
Returns: 16
The level-1 simple maze consists of five rooms. There are four pairs of adjacent rooms (i.e., distance = 1). There are six pairs of rooms that are at distance 2. Thus, the sum of all distances is 4*1 + 6*2 = 16.
1)
3
Returns: 4680
2)
5
Returns: 61000
3)
12345
Returns: 598011702
don't forget mod.
4)
1000000000000
Returns: 763641672
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/
//Been challenged successfully.