package leetCodeWeeklyContest25.problem3;

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
public class Solution_FromOther {
	
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        if (root == null) return ls;
        
        if (root.left == null) ls.add(root.val);
        else addLeftB(root, ls);
        
        addLeaves(root, ls);
        addRightB(root, ls);
        return ls;
    }
    
    private void addLeftB(TreeNode root, List<Integer> ls) {
    	if (root == null) return;
    	ls.add(root.val);
    	if (root.left != null) addLeftB(root.left, ls);
    	else if (root.right != null) addLeftB(root.right, ls);
    }
    
    private void addLeaves(TreeNode root, List<Integer> ls) {
    	if (root == null) return;
    	if (root.left != null) addLeaves(root.left, ls);
    	if (root.right != null) addLeaves(root.right, ls);
    	if (root.left == null && root.right == null && !ls.contains(root.val)) ls.add(root.val);
    }
    
    private void addRightB(TreeNode root, List<Integer> ls) {
    	if (root == null) return;
    	if (root.right != null) addRightB(root.right, ls);
    	else if (root.left != null) addRightB(root.left, ls);
    	if (!ls.contains(root.val)) ls.add(root.val);
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-25/problems/boundary-of-binary-tree/
/*
545. Boundary of Binary Tree My SubmissionsBack To Contest
User Accepted: 528
User Tried: 758
Total Accepted: 539
Total Submissions: 2536
Difficulty: Medium
Given a binary tree, return the values of its boundary in anti-clockwise direction starting from root. Boundary includes left boundary, leaves, and right boundary in order without duplicate nodes.

Left boundary is defined as the path from root to the left-most node. Right boundary is defined as the path from root to the right-most node. If the root doesn't have left subtree or right subtree, then the root itself is left boundary or right boundary. Note this definition only applies to the input binary tree, and not applies to any subtrees.

The left-most node is defined as a leaf node you could reach when you always firstly travel to the left subtree if exists. If not, travel to the right subtree. Repeat until you reach a leaf node.

The right-most node is also defined by the same way with left and right exchanged.

Example 1
Input:
  1
   \
    2
   / \
  3   4

Ouput:
[1, 3, 4, 2]

Explanation:
The root doesn't have left subtree, so the root itself is left boundary.
The leaves are node 3 and 4.
The right boundary are node 1,2,4. Note the anti-clockwise direction means you should output reversed right boundary.
So order them in anti-clockwise without duplicates and we have [1,3,4,2].
Example 2
Input:
    ____1_____
   /          \
  2            3
 / \          / 
4   5        6   
   / \      / \
  7   8    9  10  
       
Ouput:
[1,2,4,7,8,9,10,6,3]

Explanation:
The left boundary are node 1,2,4. (4 is the left-most node according to definition)
The leaves are node 4,7,8,9,10.
The right boundary are node 1,3,6,10. (10 is the right-most node).
So order them in anti-clockwise without duplicate nodes we have [1,2,4,7,8,9,10,6,3].
*/