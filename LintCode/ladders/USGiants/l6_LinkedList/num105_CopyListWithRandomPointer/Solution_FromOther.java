package ladders.USGiants.l6_LinkedList.num105_CopyListWithRandomPointer;

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution_FromOther {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if (head == null) return null;
      
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
      
        // loop 1. copy all the nodes
        RandomListNode node = head;
        while (node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }
      
        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
      
        return map.get(head);
    }
}
//http://www.lintcode.com/en/problem/copy-list-with-random-pointer/
/*
Copy List with Random Pointer

 Description
 Notes
 Testcase
 Judge
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

Have you met this question in a real interview? Yes
Example
Challenge 
Could you solve it with O(1) space?

Tags 
Hash Table Linked List Uber
*/
//From https://discuss.leetcode.com/topic/18086/java-o-n-solution
//Author: https://discuss.leetcode.com/user/jeantimex
