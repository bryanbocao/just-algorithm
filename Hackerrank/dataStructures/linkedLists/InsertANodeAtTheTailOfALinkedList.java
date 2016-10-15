package dataStructures.linkedLists;

public class InsertANodeAtTheTailOfALinkedList {
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/

	Node Insert(Node head,int data) {
	// This is a "method-only" submission. 
	// You only need to complete this method. 
	    
		// BryanBo-Cao's code ====== start
	    if (head == null) {
	        Node nd = new Node();
	        nd.data = data;
	        head.next = nd;
	        return head;
	    }
	    Node myHead = head;
	    while (head.next != null) {
	        head = head.next;
	    }
	    Node nd = new Node();
	    nd.data = data;
	    head.next = nd;
	    return myHead;
	    // BryanBo-Cao's code ====== end

	}

}
//https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
//SolvedOn20161014Fri0810 CodingDuration:8m30s9 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
