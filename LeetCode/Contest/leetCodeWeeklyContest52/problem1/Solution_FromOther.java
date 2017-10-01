package leetCodeWeeklyContest52.problem1;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution_FromOther {
	public int longestUnivaluePath(TreeNode root) {
	    return root == null ? 0 : helper(root)[0] - 1;
	}

	public int[] helper(TreeNode root) {
	    if (root == null) return new int[]{0,0};
	    int[] leftResult = helper(root.left), rightResult = helper(root.right);
	    int maxSize = Math.max(leftResult[0], rightResult[0]);
	    int leftMax = 1, rightMax = 1;
	    if (root.left != null && root.left.val == root.val) leftMax += leftResult[1];
	    if (root.right != null && root.right.val == root.val) rightMax += rightResult[1];
	    return new int[]{Math.max(maxSize, leftMax + rightMax - 1), Math.max(leftMax, rightMax)};
	}
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-52/problems/longest-univalue-path/
687. Longest Univalue Path My SubmissionsBack to Contest
User Accepted: 790
User Tried: 1265
Total Accepted: 800
Total Submissions: 3564
Difficulty: Easy
Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

Note: The length of path between two nodes is represented by the number of edges between them.

Example 1:

Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:

2
Example 2:

Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output:

2
Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 */
//From https://discuss.leetcode.com/topic/105574/java-o-n-time-o-h-space-postorder-traversal
//Author https://discuss.leetcode.com/user/compton_scatter
