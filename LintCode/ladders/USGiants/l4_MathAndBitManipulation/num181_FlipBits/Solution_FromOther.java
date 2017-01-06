package ladders.USGiants.l4_MathAndBitManipulation.num181_FlipBits;

class Solution_FromOther {
	/**
	 *@param a, b: Two integer
	 *return: An integer
	 */
	public static int bitSwapRequired(int a, int b) {
		if (a == b) {
			return 0;
		}
		int bit = a ^ b;
		int count = 0;
		// integer has 32 bits
		int number = 32;
		// you cannot just check bit > 0 in the while statement
		// because a or b maybe negative number
		while (number > 0) {
			count += bit & 1;
			bit = bit >> 1;
			number--;
		}
		return count;
	}
};
//http://www.lintcode.com/en/problem/flip-bits/
/*
Flip Bits

 Description
 Notes
 Testcase
 Judge
Determine the number of bits required to flip if you want to convert integer n to integer m.

 Notice

Both n and m are 32-bit integers.

Have you met this question in a real interview? Yes
Example
Given n = 31 (11111), m = 14 (01110), return 2.

Tags 
Cracking The Coding Interview Bit Manipulation
 */
//From http://blog.welkinlan.com/2015/05/26/flip-bits-lintcode-java/
