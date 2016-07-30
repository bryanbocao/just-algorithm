package dataStructures.trees;

import java.util.*;

public class IsThisABinarySearchTree {
    // List of node data values:
    Vector<Integer> values;
    // Total number of nodes in the tree:
    private int count;
    
    IsThisABinarySearchTree() {
        this.values = new Vector<Integer>();
        this.count = 0;
    }
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node() {
            this.data = -1;
            this.left = null;
            this.right = null;
        }
    }
    
    /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

    The Node class is defined as follows:
        class Node {
            int data;
            Node left;
            Node right;
         }
    */
    
    //start ---- BryanBo-Cao's code
    boolean checkBST(Node root) {
        List<Integer> ls = new ArrayList<Integer>();
        return myCheckBST(root, ls);                
    }
    
    boolean myCheckBST(Node root, List<Integer> ls) {
        if (!ls.isEmpty()) {
            Iterator<Integer> it = ls.iterator();
            while (it.hasNext()) {
                int data = it.next(), op = it.next();//-1:left, 1 right
                switch(op) {
                    case -1:
                    if (root.data >= data) {
                    	System.out.println("line 52");
                    	return false;
                    }
                    break;
                    case 1:
                    if (root.data <= data) {
                    	System.out.println("line 58");
                    	return false;
                    }
                    break;
                }
            }
        }
        boolean leftValid = (root.left == null) ? true : false;
        boolean rightValid = (root.right == null) ? true : false;
        if (root.left != null || root.right != null) {
            ls.add(root.data);
            boolean leftAdded = false;
            if (root.left != null) {
                ls.add(-1);
                leftAdded = true;
                leftValid = myCheckBST(root.left, ls);
            }
            
            if (root.right == null) {
                if (leftAdded) ls.remove(ls.size() - 1);
                ls.add(1);
                rightValid = myCheckBST(root.right, ls);
            }
        } else {
        	System.out.println("line 80");
        	return true;
        }
        if (leftValid && rightValid) {
        	System.out.println("line 84 root.data: " + root.data);
        	return true;
        }
        else {
        	System.out.println("line 88 root.data: " + root.data);
        	return false;
        }
    }
    //end ---- BryanBo-Cao's code
    
    void inOrder (Node root, int levels) {

        if(root != null) {
            // If there are still unfilled levels, fill left subtree:
            if (levels > 0) {
                // Create a new left child node:
                root.left = new Node();
                inOrder(root.left, levels - 1);
            }    
            
            // Set node data:
            root.data = values.elementAt(count);
            count++;
            
            // If there are still unfilled levels, fill right subtree:
            if (levels > 0) {
                // Create a new right child node:
                root.right = new Node();
                inOrder(root.right, levels - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int height = scanner.nextInt();
        
        // Read data values for tree's nodes:
        IsThisABinarySearchTree tree = new IsThisABinarySearchTree();
        while(scanner.hasNext()) {
            tree.values.add(scanner.nextInt());
        }
        scanner.close();
        
        // Fill tree:
        Node root = new Node(); 
        tree.inOrder(root, height);
        
        // Print result:
        System.out.println( (tree.checkBST(root) == true) ? "Yes" : "No" );

    }
}
//https://www.hackerrank.com/challenges/is-binary-search-tree
//20160730Sat15:20 duration:50m02s76 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
