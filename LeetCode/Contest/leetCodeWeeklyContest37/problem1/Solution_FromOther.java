package leetCodeWeeklyContest37.problem1;

public class Solution_FromOther {
    public int maxDistance(int[][] arrays) {
        int result = Integer.MIN_VALUE;
        int max = arrays[0][arrays[0].length - 1];
        int min = arrays[0][0];
        
        for (int i = 1; i < arrays.length; i++) {
            result = Math.max(result, Math.abs(arrays[i][0] - max));
            result = Math.max(result, Math.abs(arrays[i][arrays[i].length - 1] - min));
            max = Math.max(max, arrays[i][arrays[i].length - 1]);
            min = Math.min(min, arrays[i][0]);
        }
        
        return result;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-37/problems/maximum-distance-in-arrays/
624. Maximum Distance in Arrays My SubmissionsBack To Contest
User Accepted: 927
User Tried: 1287
Total Accepted: 940
Total Submissions: 3732
Difficulty: Easy
Given m arrays, and each array is sorted in ascending order. Now you can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a-b|. Your task is to find the maximum distance.

Example 1:
Input: 
[[1,2,3],
 [4,5],
 [1,2,3]]
Output: 4
Explanation: 
One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.
Note:
Each given array will have at least 1 number. There will be at least two non-empty arrays.
The total number of the integers in all the m arrays will be in the range of [2, 10000].
The integers in the m arrays will be in the range of [-10000, 10000].
*/
/*
From https://leetcode.com/contest/leetcode-weekly-contest-37/problems/maximum-distance-in-arrays/
Author https://discuss.leetcode.com/user/shawngao
*/
//PracticedOn20170617Sat 5Times