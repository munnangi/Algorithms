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
public class MinStack {
    
     StackNode top;
    
    void push(int data)
    {
        if(top == null)
        {
            top = new StackNode(data);
        }
        else
        {
            StackNode temp = new StackNode(data);
            temp.next = top;
            temp.min = Math.min(top.min,data);
            top = temp;
        }
    }
    int min()
    {
        if(top == null)
        {
            System.out.println("stack empty !");
            return Integer.MAX_VALUE; 
       }
        return top.min;
    }
    public int  pop()
    {
        if(top == null)
        {
            System.out.println("the stack is empty");
           return 0;
        }
       
           int popvalue = top.data;
           top = top.next;            
        
        return popvalue;
    }
    public int top()
    {
        if(top == null)
        {
            System.out.println("the stack is empty");
            return Integer.MAX_VALUE;
        }
        return top.data;
    }
    
    public static void main(String[] args)
    {
        MinStack Ms = new MinStack();
        Ms.push(3);
        Ms.push(4);
        Ms.push(2);
        Ms.push(1);
        System.out.println(Ms.min());
       System.out.println(Ms.pop());
       
    }
    
}
