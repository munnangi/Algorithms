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
public class QueueImplementation {
    
    public class Node{
        int val;
        Node next;
        
        public Node(int val)
        {
            this.val = val;
        }
        
    }
    public Node head;
    void EnQueue(int val)
    {
        Node n = new Node(val);
        Node curr = head;
        if(head == null)
        {
            head = n;
            head.next = null;
        }    
        else
        {
           
           while(curr.next != null)
           {
               curr = curr.next;
           }
           curr.next = n;
           n.next = null;
        }
       
    }
    
    void DeQueue()
    {
        if(head != null)
        {
            Node n = head;
            head = head.next;
            n.next = null;
        }
    }
    
    public static void main(String[] args)
    {
        QueueImplementation QI = new QueueImplementation();
        QI.EnQueue(4);
        QI.EnQueue(5);
        QI.EnQueue(9);
        QI.EnQueue(6);
        QI.DeQueue();
   
        Node nod = QI.head;
        while(nod != null)
        {
            System.out.println(nod.val);
            nod = nod.next;
            
        }
        
    }
    public int bunnyEars2(int bunnies) {
   
    
    if(bunnies == 0)
         return 0;
      
    
    
    return bunnies%2 ==0 ? 3+bunnyEars2(bunnies -1) : 2+bunnyEars2(bunnies-1);
  
  
}

    
}
