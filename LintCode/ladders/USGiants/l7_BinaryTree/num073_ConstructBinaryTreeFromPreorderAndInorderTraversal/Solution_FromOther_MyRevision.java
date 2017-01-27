package ladders.USGiants.l7_BinaryTree.num073_ConstructBinaryTreeFromPreorderAndInorderTraversal;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution_FromOther_MyRevision {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, inorder, 0, inorder.length - 1);
    }

    public static TreeNode helper(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd) {
        if (preStart > preorder.length - 1 || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inTarget = inStart;
        while (inorder[inTarget] != preorder[preStart]) inTarget++;
        root.left = helper(preorder, preStart + 1, inorder, inStart, inTarget - 1);
        root.right = helper(preorder, preStart + inTarget - inStart + 1, inorder, inTarget + 1, inEnd);
        return root;
    }
}
//http://www.lintcode.com/en/problem/construct-binary-tree-from-preorder-and-inorder-traversal/
/*
Construct Binary Tree from Preorder and Inorder Traversal

 Description
 Notes
 Testcase
 Judge
Given preorder and inorder traversal of a tree, construct the binary tree.

 Notice

You may assume that duplicates do not exist in the tree.

Have you met this question in a real interview? Yes
Example
Given in-order [1,2,3] and pre-order [2,1,3], return a tree:

  2
 / \
1   3
Tags
Binary Tree
 */
//From https://discuss.leetcode.com/topic/3695/my-accepted-java-solution/8
//From https://discuss.leetcode.com/user/annieqt