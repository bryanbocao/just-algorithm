package dataStructures.trees;

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void postOrder(Node root) {
	if (root != null) {
		if (root.left != null) postOrder(root.left);
		if (root.right != null) postOrder(root.right);
		System.out.print(root.data + " ");
	}
}
//https://www.hackerrank.com/challenges/tree-postorder-traversal
//20160721Thu13:01 duration:2m42s96 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao