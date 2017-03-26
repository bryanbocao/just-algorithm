package leetCodeWeeklyContest25.problem1;

public class Solution_FromOther_BryanBCRevision {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i < Math.sqrt(num); i++) 
            if (num % i == 0) sum += i + (num / i);
        return num != 1 && sum == num;
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
//From https://leetcode.com/contest/leetcode-weekly-contest-25/problems/perfect-number/
//Author https://discuss.leetcode.com/topic/84260/java-4-liner-o-sqrt-n-solution/2