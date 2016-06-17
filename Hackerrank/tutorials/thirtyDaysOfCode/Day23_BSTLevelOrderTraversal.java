package tutorials.thirtyDaysOfCode;
import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
//start ====== BryanBo-Cao's code
public class Day23_BSTLevelOrderTraversal {

	static void levelOrder(Node root){
	      //Write your code here
	    List<Node> parentLs = new ArrayList<Node>();
	    parentLs.add(root);
	    levelOrderPrint(parentLs);
	    
	}
	static void levelOrderPrint(List<Node> parentLs) {
	    Iterator<Node> it = parentLs.iterator();
	    List<Node> childrenLs = new ArrayList<Node>();
	    while (it.hasNext()) {
	        Node pr = it.next();
	        System.out.print(pr.data + " ");
	        if (pr.left != null) childrenLs.add(pr.left);
	        if (pr.right != null) childrenLs.add(pr.right);
	    }
	    if (!childrenLs.isEmpty()) levelOrderPrint(childrenLs);
}

//end ====== BryanBo-Cao's code

public static Node insert(Node root,int data){
    if(root==null){
        return new Node(data);
    }
    else{
        Node cur;
        if(data<=root.data){
            cur=insert(root.left,data);
            root.left=cur;
        }
        else{
            cur=insert(root.right,data);
            root.right=cur;
        }
        return root;
    }
}
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}
//https://www.hackerrank.com/challenges/30-binary-trees
//20160617Fri15:07 duration:39m24s38 Accepted @github.com/BryanBo-Cao
