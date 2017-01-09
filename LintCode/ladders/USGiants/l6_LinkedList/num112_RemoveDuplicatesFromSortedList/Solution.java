package ladders.USGiants.l6_LinkedList.num112_RemoveDuplicatesFromSortedList;

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if (head == null || head.next == null) return head;
        ListNode originalHead = new ListNode(0), nextLN = new ListNode(0);
        originalHead = head;
        while (head != null) {
            nextLN = head.next;
            while (nextLN != null && head.val == nextLN.val) nextLN = nextLN.next;
            head.next = nextLN;
            head = head.next;
        }
        return originalHead;
    }  
}
//http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-list/
/*
Remove Duplicates from Sorted List

 Description
 Notes
 Testcase
 Judge
Given a sorted linked list, delete all duplicates such that each element appear only once.

Have you met this question in a real interview? Yes
Example
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

Tags 
Linked List
*/
//SolvedOn20170108Sun CodingDuration:6m05s09 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
