/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

/**
 *
 * @author munna
 */
public class BinaryTreeCreation {
    
    class Node{
        
        int data;
        Node left,right;
        
        public Node(int val)
        {
            this.data = val;
            this.left = this.right = null;
            
        }
    }
        Node root = null;
     Node Btree(int val)
     {
         Node root = new Node(val);
         return root;
     }
        
        void preOrderTraversal(Node root)
        {
            if(root == null)
                return;
             System.out.println(root.data);
            preOrderTraversal(root.left);
           
            preOrderTraversal(root.right);
        }
        
           void postOrderTraversal(Node root)
        {
            if(root == null)
                return;
             
            postOrderTraversal(root.left);
           
            postOrderTraversal(root.right);
            System.out.println(root.data);
        }
        
        public static void main(String[] args)
        {
            BinaryTreeCreation BT = new BinaryTreeCreation();
            
            BT.root = BT.Btree(1);
            BT.root.left = BT.Btree(2);
            BT.root.right = BT.Btree(3);
            BT.root.left.left = BT.Btree(4);
            
            BT.postOrderTraversal(BT.root);
            
        }
    
    
}
