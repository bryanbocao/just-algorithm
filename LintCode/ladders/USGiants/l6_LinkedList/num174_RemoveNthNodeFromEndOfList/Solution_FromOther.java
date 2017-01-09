package ladders.USGiants.l6_LinkedList.num174_RemoveNthNodeFromEndOfList;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preDelete = dummy;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            preDelete = preDelete.next;
        }
        preDelete.next = preDelete.next.next;
        return dummy.next;
    }
}
//http://www.lintcode.com/en/problem/remove-nth-node-from-end-of-list/
/*
 Remove Nth Node From End of List

 Description
 Notes
 Testcase
 Judge
Given a linked list, remove the nth node from the end of list and return its head.

 Notice

The minimum number of nodes in list is n.

Have you met this question in a real interview? Yes
Example
Given linked list: 1->2->3->4->5->null, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5->null.

Challenge 
Can you do it without getting the length of the linked list?

Tags 
Two Pointers Linked List
*/
//From http://www.jiuzhang.com/solutions/remove-nth-node-from-end-of-list/