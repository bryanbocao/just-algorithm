package leetCodeWeeklyContest50.problem3.attempt;

import java.util.Stack;

class Solution2 {
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
Input:
"(())((())()()(*)(*()(())())())()()((()())((()))(*"
Output:
true
Expected:
false
"((*"

Input:
"(*()"
Output:
false
Expected:
true
*/
