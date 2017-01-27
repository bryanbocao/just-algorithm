package ladders.USGiants.l7_BinaryTree.num069_BinaryTreeLevelOrderTraversal;

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
<<<<<<< HEAD
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
=======
    List<List<Integer>> returnList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        func(root,0);
        return returnList;

    }
    public void func(TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }
        //VISIT
        if(returnList.size() >= level+1)
        {
            List<Integer> l = returnList.get(level);
            l.add(root.val);
        }
        else
        {

            List<Integer> temp  = new ArrayList<Integer>();
            temp.add(root.val);
            returnList.add(level,temp);
        }

        //go left and right
        func(root.left,level+1);
        func(root.right,level+1);
>>>>>>> c89f1e8b31a84b709e7104d72aae8f38009923ea
    }
}
//http://www.lintcode.com/en/problem/binary-tree-level-order-traversal/
/*
Binary Tree Level Order Traversal

 Description
 Notes
 Testcase
 Judge
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

Have you met this question in a real interview? Yes
Example
Given binary tree {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7


return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]
Challenge
Challenge 1: Using only 1 queue to implement it.

Challenge 2: Use DFS algorithm to do it.
 */
<<<<<<< HEAD
//From https://discuss.leetcode.com/topic/7647/java-solution-with-a-queue-used
//Author: https://discuss.leetcode.com/user/soy
=======
//From https://discuss.leetcode.com/topic/7647/java-solution-with-a-queue-used/9
//From https://discuss.leetcode.com/topic/41207/short-easy-java-code-level-order-using-preorder/3
//Author: https://discuss.leetcode.com/user/pkhatri
>>>>>>> c89f1e8b31a84b709e7104d72aae8f38009923ea
