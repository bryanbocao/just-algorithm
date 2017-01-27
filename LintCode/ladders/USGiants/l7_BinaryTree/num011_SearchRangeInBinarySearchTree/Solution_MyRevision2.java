package ladders.USGiants.l7_BinaryTree.num011_SearchRangeInBinarySearchTree;

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
public class Solution_MyRevision2 {
    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in increasing order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        return helper(root, k1, k2, ls);
    }

    private ArrayList<Integer> helper(TreeNode root, int k1, int k2, ArrayList<Integer> ls) {
        if (root == null) return ls;
        if (k1 < root.val) ls = helper(root.left, k1, k2, ls);
        if (k1 <= root.val && root.val <= k2) ls.add(root.val);
        if (root.val < k2) ls = helper(root.right, k1, k2, ls);
        return ls;
    }
}

//http://www.lintcode.com/en/problem/search-range-in-binary-search-tree/
/*
 Search Range in Binary Search Tree

 Description
 Notes
 Testcase
 Judge
Given two values k1 and k2 (where k1 < k2) and a root pointer to a Binary Search Tree. Find all the keys of tree in range k1 to k2. i.e. print all x such that k1<=x<=k2 and x is a key of given BST. Return all the keys in ascending order.

Have you met this question in a real interview? Yes
Example
If k1 = 10 and k2 = 22, then your function should return [12, 20, 22].

    20
   /  \
  8   22
 / \
4   12
Tags
Binary Search Tree Binary Tree
Related Problems
Easy First Position of Target 33 %
Medium Binary Tree Serialization
 */
//From http://www.jiuzhang.com/solutions/search-range-in-binary-search-tree/
