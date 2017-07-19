/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;
import java.util.Stack;

/**
 *
 * @author munna
 */
public class Queue {
    
    private Stack<Integer>  StackNewestOnTop;
    private Stack<Integer>  StackOldestOnTop;
    private int topElement;
    private int size;
    
    public Queue()
    {
         
       StackNewestOnTop = new Stack<>(); 
       StackOldestOnTop = new Stack<>(); 
       topElement = -1;
       size = -1;  
    }
    
    void Enqueue(int data)
    {
         StackNewestOnTop.push(new Integer(data));
    }
    
    int Dequeue()
    {
        if(StackOldestOnTop.empty())
        {
            while(!StackNewestOnTop.empty())
            {
                topElement = StackNewestOnTop.peek();
                StackOldestOnTop.push(topElement);
                StackNewestOnTop.pop();
                
            }
        }
        if(!StackOldestOnTop.empty())
        {
              Integer i = StackOldestOnTop.peek();
              topElement = i.intValue();
              StackOldestOnTop.pop();
        }
        return topElement; 
    }
    
    boolean isEmpty()
    {
        if(StackNewestOnTop.empty() && StackOldestOnTop.empty())
            return true;
        else
            return false;
    }
    
    int Size()
    {
        return StackNewestOnTop.size() + StackOldestOnTop.size();
               
    }
    
    public static void main(String[] args)
    {
        Queue q = new Queue();
        
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        
        int size = q.Size();
        for(int i=0;i<size;i++)
        {
            System.out.println("Dequeued" + q.Dequeue());
        }
        
    }
    
    
    
}
