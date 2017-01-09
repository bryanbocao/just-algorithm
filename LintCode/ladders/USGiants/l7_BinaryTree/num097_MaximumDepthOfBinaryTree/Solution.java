package ladders.USGiants.l7_BinaryTree.num097_MaximumDepthOfBinaryTree;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root == null) return 0;
        return Math.max(maxDepth(root.left, 1), maxDepth(root.right, 1));
    }
    
    private int maxDepth(TreeNode root, int level) {
        if (root == null) return level;
        int leftDepth = (root.left == null) ? level + 1 : maxDepth(root.left, level + 1);
        int rightDepth = (root.right == null) ? level + 1 : maxDepth(root.right, level + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
//http://www.lintcode.com/en/problem/maximum-depth-of-binary-tree/
/*
 Maximum Depth of Binary Tree

 Description
 Notes
 Testcase
 Judge
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Have you met this question in a real interview? Yes
Example
Given a binary tree as follow:

  1
 / \ 
2   3
   / \
  4   5
The maximum depth is 3.

Tags 
Divide and Conquer Recursion Binary Tree Uber
*/
//SolvedOn20170109Mon CodingDuratin:7m38s47 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
