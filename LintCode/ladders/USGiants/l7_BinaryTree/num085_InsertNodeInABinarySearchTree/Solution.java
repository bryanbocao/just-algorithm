package ladders.USGiants.l7_BinaryTree.num085_InsertNodeInABinarySearchTree;

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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) root = node;
        myInsertNode(root, node);
        return root;
    }
    
    private void myInsertNode(TreeNode root, TreeNode node) {
        if (node.val < root.val) {
            if (root.left == null) root.left = node;
            else myInsertNode(root.left, node);
        }
        if (node.val > root.val) {
            if (root.right == null) root.right = node;
            else myInsertNode(root.right, node);
        }
    }
}
//http://www.lintcode.com/en/problem/insert-node-in-a-binary-search-tree/
/*
 Insert Node in a Binary Search Tree

 Description
 Notes
 Testcase
 Judge
Given a binary search tree and a new tree node, insert the node into the tree. You should keep the tree still be a valid binary search tree.

 Notice

You can assume there is no duplicate values in this tree + node.

Have you met this question in a real interview? Yes
Example
Given binary search tree as follow, after Insert node 6, the tree should be:

  2             2
 / \           / \
1   4   -->   1   4
   /             / \ 
  3             3   6
Challenge 
Can you do it without recursion?

Tags 
LintCode Copyright Binary Search Tree
*/
//SolvedOn20170109Mon CodingDuration:9m41s63 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
