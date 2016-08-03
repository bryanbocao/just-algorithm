package dataStructures.trees;
import java.util.*;
public class InorderTraversal {

	/* you only have to complete the function given below.  
	Node is defined as  

	class Node {
	    int data;
	    Node left;
	    Node right;
	}

	*/

	void inOrder(Node root) {
		if (root != null) {
			if (root.left != null) inOrder(root.left);
			System.out.println(root.data);
			if (root.right != null) inOrder(root.right);
		}
	}

}

//https://www.hackerrank.com/challenges/tree-inorder-traversal
//20160802Tue23:46 duration:3m20s42 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

