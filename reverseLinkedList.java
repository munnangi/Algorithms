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
public class reverseLinkedList {
    mynode head;
    mynode tail;
    
     class mynode {
    int data;
    mynode nextNode;
    
    public mynode(int data)
    {
        this.data = data;
    }
    
}

    void add(int data)
    {
        mynode node = new mynode(data);
        
        if(head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.nextNode = node;
            tail = node;
        }
        
    }
    
      mynode reverseLinkListRecursion(mynode node)
    {
        
        if(node.nextNode == null)
        {
            head = node;
            return node;
        }
        
        mynode x = reverseLinkListRecursion(node.nextNode);
               x.nextNode =node;
               node.nextNode = null;
               return node; 
               
    }
      
      
      mynode ReverseIterative(mynode node)
      {
          mynode head = null;
          while(node != null)
          {
              mynode n = new mynode(node.data);
              n.nextNode = head;
              head = n;
              node= node.nextNode;
            
              
          }
          return head;
        
      }
      
      
      public static void main(String args[])
      {
          reverseLinkedList llist = new reverseLinkedList();
          
          llist.add(1);
          llist.add(2);
          llist.add(3);
          llist.add(4);
          llist.add(5);
          
//         llist.reverseLinkListRecursion(llist.head);
       mynode noderesult =  llist.ReverseIterative(llist.head);
         
         while(noderesult != null)
         {
             System.out.println(noderesult.data + "");
             noderesult = noderesult.nextNode;
         }
      }
      
      
      

}
