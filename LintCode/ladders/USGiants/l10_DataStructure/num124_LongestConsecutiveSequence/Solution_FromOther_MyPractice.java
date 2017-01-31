package ladders.USGiants.l10_DataStructure.num124_LongestConsecutiveSequence;

public class Solution_FromOther_MyPractice {

    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) set.add(num);
        int max = 1;
        for (int num : nums) {
            if (set.remove(num)) {//num hasn't been visited
                int val = num, sum = 1;
                while (set.remove(val - 1)) val--;
                sum += num - val;

                val = num;
                while (set.remove(val + 1)) val++;
                sum += val - num;

                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
//http://www.lintcode.com/en/problem/longest-consecutive-sequence/
/*
Longest Consecutive Sequence

 Description
 Notes
 Testcase
 Judge
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Have you met this question in a real interview? Yes
Clarification
Your algorithm should run in O(n) complexity.

Example
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 */
//From https://discuss.leetcode.com/topic/25493/simple-fast-java-solution-using-set
//Author https://discuss.leetcode.com/user/tracy123
