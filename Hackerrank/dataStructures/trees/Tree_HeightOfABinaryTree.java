package dataStructures.trees;

public class Tree_HeightOfABinaryTree {

	// BryanBo-Cao's code ====== start
	int height(Node root) {
		if (root == null) return -1;
		return Math.max(this.height(root.left), this.height(root.right)) + 1;
	}
	//BryanBo-Cao's code ====== end 
}

class Node {
	int data;
	Node left;
	Node right;
}

//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
//20160807Sat15:53 duration:6m47s50 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
