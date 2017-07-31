package num487_MaxConsecutiveOnesII;

public class Solution_FromOther2_BryanBCRevision {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zeroLeft = 0, zeroRight = 0;
        for (int n : nums) {
            zeroRight++;
            if (n == 0) {
                zeroLeft = zeroRight;
                zeroRight = 0;
            }
            max = Math.max(max, zeroLeft + zeroRight); 
        }
        return max;
   }
}
/*
https://leetcode.com/problems/max-consecutive-ones-ii
Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

Example 1:
Input: [1,0,1,1,0]
Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
Follow up:
What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?
*/
//From https://discuss.leetcode.com/topic/75439/java-concise-o-n-time-o-1-space
//Author https://discuss.leetcode.com/user/compton_scatter
//PracticedOn20170804Fri 3Times
