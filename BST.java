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
public class BST {
    
    private class BstNode{
         int key;
         BstNode rightChild;
         BstNode leftChild;
        public BstNode(int key) {
            this.key = key;
            this.rightChild = null;
            this.leftChild = null; 
        }
         public String toString()
        {
            return " "+ key;
        }
    }
        
        BstNode root;
        
        void insertNode(int key)
        {
            BstNode node = new BstNode(key);
            
            if(root == null)
            {
                root = node;
            }
            else
            {
                BstNode curr = root;
                BstNode parent;
                while(true)
                {
                    parent = curr;
                    if(key < curr.key){
                        curr = curr.leftChild;
                        if(curr ==null )
                        {
                            parent.leftChild = node;
                            return;
                        }
                    }
                    else{
                        curr = curr.rightChild;
                        if(curr == null){
                            parent.rightChild = node;
                            return;
                        }
                    }
                        
                }
            }
        }
        
        String  findNode(int key)
        {
            BstNode current = root;
         
            while(current.key != key)
            {
                if(key < current.key)
                {
                    current = current.leftChild;
                }
                else
                {
                    current = current.rightChild;
                }
                if(current == null)
                    return "not found";
            }
           return "found";
            
        }
       
        void inOrderTraversal(BstNode node)
        {
            if(node == null )
                return;
          
            inOrderTraversal(node.leftChild);
            System.out.println(node);
            inOrderTraversal(node.rightChild);
          
        }
        
        void postOrderTraversal(BstNode node)
        {
            if(node == null)
                return;
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.println(node);
            
        }
        
        
      public static void main(String[] args)
      {
          BST bst = new BST();
          
          bst.insertNode(6);
          bst.insertNode(4);
          bst.insertNode(3);
          bst.insertNode(5);
          bst.insertNode(1);
          bst.insertNode(10);
          bst.insertNode(7);
          bst.insertNode(12); 
          
          System.out.println(bst.findNode(12));
      }
    
    
}
