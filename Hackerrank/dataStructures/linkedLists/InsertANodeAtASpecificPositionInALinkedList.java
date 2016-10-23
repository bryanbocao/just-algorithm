package dataStructures.linkedLists;

public class InsertANodeAtASpecificPositionInALinkedList {

	public static void main(String[] args) {

		/*
		  Insert Node at a given position in a linked list 
		  head can be NULL 
		  First element in the linked list is at position 0
		  Node is defined as 
		  class Node {
		     int data;
		     Node next;
		  }
		*/
		    
		// BryanBo-Cao's code ====== start
		Node InsertNth(Node head, int data, int position) {
		   // This is a "method-only" submission. 
		    // You only need to complete this method.
		    Node nd = new Node();
		    nd.data = data;
		    if (position == 0) {
		        nd.next = head;
		        return nd;
		    }
		    Node preH = new Node();
		    preH.next = head;
		    while (position-- != 0) preH = preH.next;
		    nd.next = preH.next;
		    preH.next = nd;
		    return head;
		}
		// BryanBo-Cao's code ====== end
		
	}

}
//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
//SolvedOn20161022Sat21:58 CodingDuration:13m03s58 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao       

