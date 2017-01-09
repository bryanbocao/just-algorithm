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
public class Solution_FromOther {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
   public ListNode rotateRight(ListNode head, int n) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;
    
        int i;
        for (i=0;fast.next!=null;i++)//Get the total length 
        	fast=fast.next;
        
        for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
        	slow=slow.next;
        
        fast.next=dummy.next; //Do the rotation
        dummy.next=slow.next;
        slow.next=null;
        
        return dummy.next;
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
//From https://discuss.leetcode.com/topic/2861/share-my-java-solution-with-explanation
//Author: https://discuss.leetcode.com/user/reeclapple