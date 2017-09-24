package leetCodeWeeklyContest51.problem1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] ops) {
        int score = 0;
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if (s.equals("+")) {
            	int num = 0;
            	for (int ii = 0, il = ls.size() - 1; ii < 2 && il >= 0; ii++, il--)
            		num += ls.get(il);
            	score += num;
            	ls.add(num);
            } else if (s.equals("C")) {
            	int num = ls.get(ls.size() - 1);
            	score -= num;
            	ls.remove(ls.size() - 1);
            } else if (s.equals("D")) {
            	int num = ls.get(ls.size() - 1) * 2;
            	score += num;
            	ls.add(num);
            } else {
            	int num = Integer.valueOf(s);
            	score += num;
            	ls.add(num);
            }
        }
        return score;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-51/problems/baseball-game/
682. Baseball Game My SubmissionsBack to Contest
User Accepted: 1688
User Tried: 1846
Total Accepted: 1717
Total Submissions: 2976
Difficulty: Easy
You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.

Example 1:
Input: ["5","2","C","D","+"]
Output: 15
Explanation: 
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get 2 points. The sum is: 7.
Operation 1: The round 2's data was invalid. The sum is: 5.  
Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
Example 2:
Input: ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation: 
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get -2 points. The sum is: 3.
Round 3: You could get 4 points. The sum is: 7.
Operation 1: The round 3's data is invalid. The sum is: 3.  
Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
Round 5: You could get 9 points. The sum is: 8.
Round 6: You could get -4 + 9 = 5 points. The sum is 13.
Round 7: You could get 9 + 5 = 14 points. The sum is 27.
Note:
The size of the input list will be between 1 and 1000.
Every integer represented in the list will be between -30000 and 30000.
*/
//SolvedOn20170923SatNight CodingDuration:32m13s75