package ladders.USGiants.l6_LinkedList.num165_MergeTwoSortedLists;

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
 */ 
public class Solution_FromOther_MyRevision {
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        } else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
//http://www.lintcode.com/en/problem/merge-two-sorted-lists/
/*
Merge Two Sorted Lists

 Description
 Notes
 Testcase
 Judge
Merge two sorted (ascending) linked lists and return it as a new sorted list. The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.

Have you met this question in a real interview? Yes
Example
Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null.

Tags 
LinkedIn Linked List
*/
//Revised from https://discuss.leetcode.com/topic/5513/my-recursive-way-to-solve-this-problem-java-easy-understanding
//Author: https://discuss.leetcode.com/user/zwangbo