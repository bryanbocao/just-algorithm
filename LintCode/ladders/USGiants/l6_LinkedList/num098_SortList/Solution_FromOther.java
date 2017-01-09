package ladders.USGiants.l6_LinkedList.num098_SortList;

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
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null || head.next == null)
          return head;
            
        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }
        
        prev.next = null;
        
        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        // step 3. merge l1 and l2
        return merge(l1, l2);
    }
      
    ListNode merge(ListNode l1, ListNode l2) {
    ListNode l = new ListNode(0), p = l;
        
    while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
            p.next = l1;
            l1 = l1.next;
        } else {
            p.next = l2;
            l2 = l2.next;
        }
        p = p.next;
    }
        
        if (l1 != null)
          p.next = l1;
        
        if (l2 != null)
          p.next = l2;
        
        return l.next;
    }

}
//http://www.lintcode.com/en/problem/sort-list/
/*
Sort List

 Description
 Notes
 Testcase
 Judge
Sort a linked list in O(n log n) time using constant space complexity.

Have you met this question in a real interview? Yes
Example
Given 1->3->2->null, sort it to 1->2->3->null.

Challenge 
Solve it by merge sort & quick sort separately.

Tags 
Linked List
*/
//From https://discuss.leetcode.com/topic/18100/java-merge-sort-solution/2
//Author: https://discuss.leetcode.com/user/jeantimex