package leetCodeWeeklyContest50.problem3;

import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> lefts = new Stack<Integer>(), 
        		stars = new Stack<Integer>();
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '(') lefts.push(i);
            else if (cs[i] == ')') {
                if (lefts.size() > 0) lefts.pop();
                else if (stars.size() > 0) stars.pop();
                else return false;
            } else if (cs[i] == '*') stars.push(i);
        }
        
        if (lefts.size() <= 0) return true;
        else if (stars.size() > 0 && stars.size() >= lefts.size()) {
        	while (!lefts.isEmpty()) {
        		int iL = lefts.pop(), iS = stars.pop();
        		if (iL > iS) return false;
        	}
            return true;
        }
        
        return false;
    }
}

/*
https://leetcode.com/contest/leetcode-weekly-contest-50/problems/valid-parenthesis-string/
678. Valid Parenthesis String My SubmissionsBack to Contest
User Accepted: 635
User Tried: 1252
Total Accepted: 648
Total Submissions: 3459
Difficulty: Medium
Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
Note:
The string size will be in the range [1, 100].
 */
//SolvedOn20170916SatNight CodingDuration:36m40s10
/*
Input:
"(())((())()()(*)(*()(())())())()()((()())((()))(*"
Output:
true
Expected:
false

Note:
"((*"
*/

