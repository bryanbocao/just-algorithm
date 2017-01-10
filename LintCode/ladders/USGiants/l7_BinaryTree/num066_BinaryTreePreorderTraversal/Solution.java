package ladders.USGiants.l7_BinaryTree.num066_BinaryTreePreorderTraversal;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> ls = new ArrayList<Integer>();
        if (root == null) return ls;
        else ls.add(root.val);
        if (root.left != null) ls.addAll(preorderTraversal(root.left));
        if (root.right != null) ls.addAll(preorderTraversal(root.right));
        return ls;
    }
}
//http://www.lintcode.com/en/problem/binary-tree-preorder-traversal/
/*
Binary Tree Preorder Traversal

 Description
 Notes
 Testcase
 Judge
Given a binary tree, return the preorder traversal of its nodes' values.

Have you met this question in a real interview? Yes
Example
Given:

    1
   / \
  2   3
 / \
4   5
return [1,2,4,5,3].

Challenge 
Can you do it without recursion?

Tags 
Recursion Binary Tree Binary Tree Traversal Non Recursion
*/
//SolvedOn20170109Mon CodingDuration:7m10s46 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao