package dataStructures.trees;

public class BinarySearchTreeInsertion {

	/*
	 * Node is defined as : class Node int data; Node left; Node right;
	 */

	static Node Insert(Node root, int value) {
		// BryanBo-Cao's code ====== start
		if (root == null) {
			root = new Node();
			root.data = value;
			return root;
		} else if (value < root.data) root.left = Insert(root.left, value);
		else root.right = Insert(root.right, value);
		return root;
		// BryanBo-Cao's code ====== end
	}

}
//https://www.hackerrank.com/challenges/binary-search-tree-insertion
//SolvedOn20160824WedAt22:59 CodingDuration:13m04s15 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

