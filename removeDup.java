/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javademo;
import java.util.*;
/**
 *
 * @author munna
 */
public class removeDup {
    mynode head;
    mynode a;
    mynode curr;
    mynode prev;
    mynode tail;
   /**
    * remove duplicate values from a linked list 
    * time complexity O(N2)
    * @param node 
    */
    public void removeDupVal(mynode node)
    {
        a = node;
        head = node;
        curr = node.nextNode;
        prev = node;
        
        while(head !=null)
        {
            while( curr != null)
            {
                if(head != curr)
                {
                if(head.data == curr.data)
                {
                    prev.nextNode = curr.nextNode;
                    curr = curr.nextNode;
                    
                }
                else
                {
                    prev = curr;
                    curr = curr.nextNode;
                }
                }
                else
                {
                    prev =curr;
                    curr = curr.nextNode;
                }
            }
            
            head = head.nextNode;  
             curr = node;
             prev = node;
        }
        
        while(a != null)
        {
            System.out.println(a.data + " ");
            a = a.nextNode;
        }
    }
    
    public void add(int data)
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
    
    /**
     * remove duplicates using hash set
     * @param args 
     * time complexity O(N)
     */
    void deleteDups(mynode node)
    {
        a = node;
        HashSet<Integer>  set = new HashSet<>();
        mynode prev = null;
        
        while(node != null)
        {
            if(set.contains(node.data))
            {
                prev.nextNode = node.nextNode;
            }
            else
            {
                set.add(node.data);
                prev = node;
            }
            node = node.nextNode;
        }
         while(a != null)
        {
            System.out.println(a.data + " ");
            a = a.nextNode;
        }
        
    }
    
     
   public static void main(String args[])
    {
       removeDup llist =  new removeDup();
       llist.add(9);
       llist.add(9);
       llist.add(8);
       llist.add(8);
       llist.add(10);
       
      llist.deleteDups(llist.head);
       
     
    
       
    }
}
