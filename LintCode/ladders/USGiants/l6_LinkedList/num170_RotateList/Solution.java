package ladders.USGiants.l6_LinkedList.num170_RotateList;

/**
 * Definition for singly-linked list.
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
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null || head.next == null) return head;
        ListNode originalHead = new ListNode(0), preHead = new ListNode(0);
        originalHead = head;
        int len = 1;
        while (head != null && k > 0) {
            head = head.next;
            len++;
            k--;
        }
        if (k > 0) k %= len;
        head = originalHead;
        preHead.next = originalHead;
        while (k > 0) {
            head = head.next;
            k--;
        }
        
        while (head.next != null) {
            head = head.next;
            preHead = preHead.next;
        }    
        head.next = originalHead;
        preHead.next = null;
        
        return head;
        
    }
}
//http://www.lintcode.com/en/problem/rotate-list/
/*
Rotate List

 Description
 Notes
 Testcase
 Judge
Given a list, rotate the list to the right by k places, where k is non-negative.

Have you met this question in a real interview? Yes
Example
Given 1->2->3->4->5 and k = 2, return 4->5->1->2->3.

Tags 
Basic Implementation Linked List
*/
//TriedOn20160109Mon WrongAnswer
/*
Memory Limit Exceeded


Total Runtime: 1132 ms
57% test cases passed.
Input
17->75->80->87->44->45->75->86->74->20->null, 19
Expected
75->80->87->44->45->75->86->74->20->17->null
*/