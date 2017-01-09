package ladders.USGiants.l5_Greedy.num187_GasStation;

public class Solution_FromOther_MyRevision {
    /**
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
        int tank = 0;
        for (int i = 0; i < gas.length; i++) tank += gas[i] - cost[i];
        if (tank < 0) return - 1;
            
        int start = 0;
        int accumulate = 0;
        for (int i = 0; i < gas.length; i++){
            int curGain = gas[i] - cost[i];
            if (accumulate + curGain < 0){
                start = i + 1;
                accumulate = 0;
            } else accumulate += curGain;
        }
        
        return start;
    }
}
//http://www.lintcode.com/en/problem/gas-station/
/*
Gas Station

 Description
 Notes
 Testcase
 Judge
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

 Notice

The solution is guaranteed to be unique.

Have you met this question in a real interview? Yes
Example
Given 4 gas stations with gas[i]=[1,1,3,1], and the cost[i]=[2,2,1,1]. The starting gas station's index is 2.

Challenge 
O(n) time and O(1) extra space

Tags 
Greedy
*/
//Revised from https://discuss.leetcode.com/topic/25289/straightforward-java-linear-solution-with-o-1-space-explanation-and-math-proof/2