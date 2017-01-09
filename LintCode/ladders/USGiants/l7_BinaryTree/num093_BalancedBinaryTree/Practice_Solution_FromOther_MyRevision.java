package ladders.USGiants.l7_BinaryTree.num093_BalancedBinaryTree;

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
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null) return true;
        return height(root) != -1;
    }
    
    private int height(TreeNode node) {
        if (node == null) return 0;
        int lH = height(node.left);
        if (lH == -1) return -1;
        int rH = height(node.right);
        if (rH == -1) return -1;
        if (Math.abs(lH - rH) > 1) return -1;
        return Math.max(lH, rH) + 1;
    }
}
//http://www.lintcode.com/en/problem/balanced-binary-tree/
/*
Balanced Binary Tree

 Description
 Notes
 Testcase
 Judge
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Have you met this question in a real interview? Yes
Example
Given binary tree A = {3,9,20,#,#,15,7}, B = {3,#,20,15,7}

A)  3            B)    3 
   / \                  \
  9  20                 20
    /  \                / \
   15   7              15  7
The binary tree A is a height-balanced binary tree, but B is not.

Tags 
Binary Search Divide and Conquer Recursion
*/
//Revised from https://discuss.leetcode.com/topic/11007/java-solution-based-on-height-check-left-and-right-node-in-every-recursion-to-avoid-further-useless-search
//PracticedOn20170109Mon 5Times