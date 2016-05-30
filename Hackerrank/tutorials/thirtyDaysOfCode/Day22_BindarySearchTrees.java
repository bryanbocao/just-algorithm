package tutorials.thirtyDaysOfCode;
import java.util.*;
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
public class Day22_BindarySearchTrees {

	public static int getHeight(Node root){
		// My Code
	      if (root.right == null && root.left == null) return 0;      
	      else if (root.right == null) return getHeight(root.left) + 1;
	      else if (root.left == null) return getHeight(root.right) + 1;
	      else return max(getHeight(root.left), getHeight(root.right)) + 1; 
	    }

	    private static int max(int a, int b) {
	        if (a >= b) return a;
	        else return b;
	    }
	    ////My Code
	    
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
	        int height=getHeight(root);
	        System.out.println(height);
	    }


}
