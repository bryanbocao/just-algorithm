package leetCodeWeeklyContest25.problem1;

public class Solution {
    public boolean checkPerfectNumber(int num) {
    	if (num == 0) return false;
    	if (num == 1) return true;
    	int sum = 0;
        for (int i = num - 1; i >= 1 && sum <= num; i--) {
        	if (num % i == 0) sum += i;
        	if (sum == num) return true;
        }
        return false;
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-25/problems/perfect-number/
/*
507. Perfect Number My SubmissionsBack To Contest
User Accepted: 1052
User Tried: 1226
Total Accepted: 1075
Total Submissions: 4037
Difficulty: Easy
We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
Example:
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
Note: The input number n will not exceed 100,000,000. (1e8)
 */
/*
Input:
28
Output:
false
Expected:
true
*/
//TriedOn20170325SatNight CodingDuration:35m04s88