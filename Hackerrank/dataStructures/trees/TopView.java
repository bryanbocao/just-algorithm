package dataStructures.trees;

public class TopView {

	/*
	   class Node 
	       int data;
	       Node left;
	       Node right;
	*/
	void top_view(Node root) {
		if (root != null) {
			if (root.left != null) printLeftTop(root.left);
			System.out.print(root.data + " ");
			if (root.right != null) printRightTop(root.right);
		}
		
	}

	private static void printLeftTop(Node root) {
		if (root.left == null) System.out.print(root.data + " ");
		else {
			printLeftTop(root.left);
			System.out.print(root.data + " ");
		}
	}
	
	private static void printRightTop(Node root) {
		System.out.print(root.data + " ");
		if (root.right != null) printRightTop(root.right);
	}
}
//https://www.hackerrank.com/challenges/tree-top-view
//20160722Fri14:04 duration:6m50s03 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 