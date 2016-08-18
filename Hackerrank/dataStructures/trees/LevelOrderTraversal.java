package dataStructure.trees;
import java.util.*;

import javax.xml.soap.Node;
public class LevelOrderTraversal {
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
	   // BryanBo-Cao's Code ====== start
	   if (root != null) {
		   System.out.print(root.data + " ");
		   List<Node> ls = new ArrayList<Node>();
		   if (root.left != null) ls.add(root.left);
		   if (root.right != null) ls.add(root.right);
		   while (!ls.isEmpty()) ls = printLevelOrder(ls);
	   }
	   
    }
   
   static List<Node> printLevelOrder(List<Node> ls) {
	   List<Node> resultLS = new ArrayList<Node>();
	   Iterator<Node> it = ls.iterator();
	   while (it.hasNext()) {
		   Node nd = it.next();
		   System.out.print(nd.data + " ");
		   if (nd.left != null) resultLS.add(nd.left);
		   if (nd.right != null) resultLS.add(nd.right);
	   }
       return resultLS;
   }
   		// BryanBo-Cao's Code ====== end

}
//https://www.hackerrank.com/challenges/tree-level-order-traversal
//SolvedOn20160817Wed20:51 CodingDuration:15m55s46 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
