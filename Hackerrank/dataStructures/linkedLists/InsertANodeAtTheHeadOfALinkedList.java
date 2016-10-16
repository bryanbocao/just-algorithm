package dataStructures.linkedLists;

public class InsertANodeAtTheHeadOfALinkedList {
	/*
	  Insert Node at the beginning of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	// This is a "method-only" submission. 
	// You only need to complete this method. 

	Node Insert(Node head,int x) {
		// BryanBo-Cao's code ====== start 
	    Node nd = new Node();
	    nd.data = x;
	    nd.next = head;
	    return nd;
	    // BryanBo-Cao's code ====== end
	}

}
//https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
//SolvedOn20161016SunAt12:10 CodingDuration:1m40s57 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao       
