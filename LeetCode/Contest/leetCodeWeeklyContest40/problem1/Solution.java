package leetCodeWeeklyContest40.problem1;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> sumLs = new ArrayList<Double>();
        List<Integer> cntLs = new ArrayList<Integer>();
        if (root == null) return sumLs;
        helper(root, 0, sumLs, cntLs);
        for (int i = 0; i < sumLs.size(); i++)
            sumLs.set(i, sumLs.get(i) / cntLs.get(i));
        return sumLs;
    }
    
    private void helper(TreeNode root, int lv, List<Double> sumLs, List<Integer> cntLs) {
        if (root != null) {
        	if (sumLs.size() <= lv) {
        		sumLs.add((double) root.val);
        		cntLs.add(1);
        	} else {
        		sumLs.set(lv, sumLs.get(lv) + root.val);
        		cntLs.set(lv, cntLs.get(lv) + 1);
        	}
            helper(root.left, lv + 1, sumLs, cntLs);
            helper(root.right, lv + 1, sumLs, cntLs);
        }
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-40/problems/average-of-levels-in-binary-tree/
637. Average of Levels in Binary Tree My SubmissionsBack to Contest
User Accepted: 1338
User Tried: 1396
Total Accepted: 1366
Total Submissions: 2177
Difficulty: Easy
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.
 */
//SolvedOn20170708Sat CodingDuration:17m01s88
//https://discuss.leetcode.com/topic/95205/naive-java-solution-with-2-lists-with-helper