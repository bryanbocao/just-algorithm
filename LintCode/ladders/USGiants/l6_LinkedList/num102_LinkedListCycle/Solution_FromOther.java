package ladders.USGiants.l6_LinkedList.num102_LinkedListCycle;

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
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
//http://www.lintcode.com/en/problem/linked-list-cycle/
/*
Linked List Cycle

 Description
 Notes
 Testcase
 Judge
Given a linked list, determine if it has a cycle in it.



Have you met this question in a real interview? Yes
Example
Given -21->10->4->5, tail connects to node index 1, return true

Challenge 
Follow up:
Can you solve it without using extra space?

Tags 
Two Pointers Linked List
*/
//From https://discuss.leetcode.com/topic/12516/o-1-space-solution
//Author: https://discuss.leetcode.com/user/fabrizio3
