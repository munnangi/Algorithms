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
public class StackImplementation {
  /**
   * using linked list
   */  
    public class Node{
        public int val;
        public Node next;
        
        public Node(int val)
        {
            this.val = val;      
        }
        
    }
    
    public Node head;
    
    void push(int value)
    {
        if(head == null)
        {
            head = new Node(value);
            head.next =null;
        }
        else
        {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
        }
    }
    
    void pop()
    {
        if(head == null)
            return;
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    
    
    public static void main(String[] args)
    {
        StackImplementation SI = new StackImplementation();
        SI.push(5);
        SI.push(6);
        SI.push(4);
        SI.pop();
        Node n = SI.head;
        while(n != null)
        {
            System.out.println(n.val);
            n = n.next;
        }
    }
    
    
    
    
    
    
}
