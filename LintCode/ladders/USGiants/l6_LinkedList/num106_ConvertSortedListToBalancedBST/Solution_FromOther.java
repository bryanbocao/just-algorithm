package ladders.USGiants.l6_LinkedList.num106_ConvertSortedListToBalancedBST;

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
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
public class Solution_FromOther {
    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if(head==null) return null;
        return toBST(head,null);
    }
    public TreeNode toBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if(head==tail) return null;
        
        while(fast!=tail&&fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode thead = new TreeNode(slow.val);
        thead.left = toBST(head,slow);
        thead.right = toBST(slow.next,tail);
        return thead;
    }
}
//http://www.lintcode.com/en/problem/convert-sorted-list-to-balanced-bst/
/*
Convert Sorted List to Balanced BST

 Description
 Notes
 Testcase
 Judge
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

Have you met this question in a real interview? Yes
Example
               2
1->2->3  =>   / \
             1   3
Tags 
Recursion Linked List
*/
//From https://discuss.leetcode.com/topic/35997/share-my-java-solution-1ms-very-short-and-concise
//Author: https://discuss.leetcode.com/user/josephtao
