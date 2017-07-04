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
public class nthToLast {
    
    mynode head;
    mynode tail;
    mynode prev;
    mynode runner;
    int counter = 0;
    
    /**
     * add elements to the node
     * @param node 
     */
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
    
    /**
     * implement nth to last using runner
     * @param node 
     */
   void nthToLastFunc(mynode node, int n)
   {
      runner = node;
      prev = node;
      
      while(counter <n )
      {
          runner = runner.nextNode;
          counter++;
      }
      
      while(runner.nextNode != null)
      {
          runner = runner.nextNode;
          prev  = prev.nextNode;
      }
      System.out.println(prev.data+ "");
      
   }
   
   /**
    * implement nth to the last element using recursion
    * @param node
    * @param n
    * @return 
    */
   int nthToLastFuncRecur(mynode node,int n)
   {
       if(node.nextNode == null)
           return 0;
       
       
       int index = nthToLastFuncRecur(node.nextNode, n) + 1;
       if(index == n)
       {
           System.out.println(node.data +"");
       }
       return index;
   }
    
   public static void main(String args[])
   {
       nthToLast llist = new nthToLast();
       llist.add(10);
       llist.add(9);
       llist.add(7);
       llist.add(4);
       llist.add(3);
       llist.add(5);
       llist.add(7);
       
       llist.nthToLastFunc(llist.head, 4);
//       llist.nthToLastFuncRecur(llist.head,4);
       
   }
    
    
}
