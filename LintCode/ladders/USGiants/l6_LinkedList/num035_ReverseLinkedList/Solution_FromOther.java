package ladders.USGiants.l6_LinkedList.num035_ReverseLinkedList;

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
public class Solution_FromOther {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    
}
//http://www.lintcode.com/en/problem/reverse-linked-list/
/*
Reverse Linked List

 Description
 Notes
 Testcase
 Judge
Reverse a linked list.

Have you met this question in a real interview? Yes
Example
For linked list 1->2->3, the reversed linked list is 3->2->1

Challenge 
Reverse it in-place and in one-pass

Tags 
Linked List Facebook Uber
*/
//From https://discuss.leetcode.com/topic/13268/in-place-iterative-and-recursive-java-solution
//Author: https://discuss.leetcode.com/user/braydencn
