package leetCodeWeeklyContest40.problem2;

public class Solution_FromOther {
	public class Solution {
		public String solveEquation(String equation) {
	        int[] res = evalauteExpression(equation.split("=")[0]),  
	  	      res2 = evalauteExpression(equation.split("=")[1]);
		  	res[0] -= res2[0];
		  	res[1] = res2[1] - res[1];
		  	if (res[0] == 0 && res[1] == 0) return "Infinite solutions";
		        if (res[0] == 0) return "No solution";
		  	return "x=" + res[1]/res[0];
		}  
	
		public int[] evalauteExpression(String exp) {
			String[] tokens = exp.split("(?=[-,+])"); 
			int[] res =  new int[2];
			for (String token : tokens) {
			  if (token.equals("+x") || token.equals("x")) res[0] += 1;
			  else if (token.equals("-x")) res[0] -= 1;
			  else if (token.contains("x")) res[0] += Integer.parseInt(token.substring(0, token.indexOf("x")));
			  else res[1] += Integer.parseInt(token);
			}
			return res;
		}
	}
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-40/problems/solve-the-equation/
640. Solve the Equation My SubmissionsBack to Contest
User Accepted: 720
User Tried: 849
Total Accepted: 724
Total Submissions: 2036
Difficulty: Medium
Solve a given equation and return the value of x in the form of string "x=#value". The equation contains only '+', '-' operation, the variable x and its coefficient.

If there is no solution for the equation, return "No solution".

If there are infinite solutions for the equation, return "Infinite solutions".

If there is exactly one solution for the equation, we ensure that the value of x is an integer.

Example 1:
Input: "x+5-3+x=6+x-2"
Output: "x=2"
Example 2:
Input: "x=x"
Output: "Infinite solutions"
Example 3:
Input: "2x=x"
Output: "x=0"
Example 4:
Input: "2x+3x-6x=x+2"
Output: "x=-1"
Example 5:
Input: "x=x+2"
Output: "No solution"
*/
/*
From https://discuss.leetcode.com/topic/95203/concise-java-solution
Author https://discuss.leetcode.com/user/compton_scatter
*/