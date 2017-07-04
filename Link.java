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
public class Link {
     mynode head;
     mynode tail;
    public void add(int data)
    {
        mynode node = new mynode(data);      
        if(head == null)
        {
            head = node;
            tail = node;
        }
        else if(head != null)
        {
            tail.nextNode = node;
            tail = node;
        }    
    }
   public void printLinkedList (mynode node)
    {
        while(node != null)
        {
            System.out.println(node.data +"");
            node = node.nextNode;
        }
    }
   public void reverseLinkedList(mynode node)
   {
       if(node == null)
           return ;
     
        reverseLinkedList(node.nextNode);
       System.out.println(node.data+ " ");  
       
   }
    public static void main(String args[])
    {
        Link llist = new Link();
        llist.add(23);
        llist.add(12);
        llist.add(15);
        
//        llist.printLinkedList(llist.head);
       llist.reverseLinkedList(llist.head);
      
        
    }
    
}
