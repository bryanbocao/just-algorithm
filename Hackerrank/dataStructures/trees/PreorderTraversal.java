package dataStructures.trees;
import java.util.*;
public class PreorderTraversal {

	/* you only have to complete the function given below.  
	Node is defined as  

	class Node {
	    int data;
	    Node left;
	    Node right;
	}

	*/

	void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			if (root.left != null) preOrder(root.left);
			if (root.right != null) preOrder(root.right);
		}
	}

}
//https://www.hackerrank.com/challenges/tree-preorder-traversal
//20160719Tue13:30 duration:3m01s04 Accepted duration:7m11s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao