package leetCodeWeeklyContest25.problem1;

public class Solution2 {
    public boolean checkPerfectNumber(int num) {
    	if (num == 0) return false;
    	if (num == 1) return true;
    	int sum = 0;
        for (int i = 1; i <= num && sum <= num; i++) {
        	if (num % i == 0) sum += i;
        	if (sum == num) return true;
        }
        return false;
    }
}
/*
Last executed input:
99999992
*/