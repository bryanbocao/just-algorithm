package ladders.USGiants.l9_DynamicProgramming.num111_ClimbingStairs;

public class Solution_FromOther {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0)
            a = (b += a) - a;
        return a;
    }
}

//http://www.lintcode.com/en/problem/climbing-stairs/
/*
limbing Stairs

 Description
 Notes
 Testcase
 Judge
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Have you met this question in a real interview? Yes
Example
Given an example n=3 , 1+1+1=2+1=1+2=3

return 3
*/
//From https://discuss.leetcode.com/topic/17002/3-4-short-lines-in-every-language
//Author https://discuss.leetcode.com/user/stefanpochmann