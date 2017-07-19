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
public class SortStack {
    
    private  Stack<Integer> s;
    private Stack<Integer> r;
    private Stack<Integer> result;
    private int temp;
    
   public SortStack()
    {
         s = new Stack<Integer>();
         r = new Stack<Integer>();
         result = new Stack<Integer>();
        
        
    }
    
    void pushData(int data)
    {
      s.push(new Integer(data));
    }
    
    void sortTheStack(Stack<Integer> s)
    {
        while(!s.empty())
        {
             temp = s.pop();
             while(!r.empty() && r.peek() > temp)
             {
                 s.push(r.pop());
             }
             r.push(temp);
        }
    }
    
    Stack returnSortStack(Stack<Integer> r)
    {
        while(!r.empty())
        {
            s.push(r.pop());
        }
        return s;
    }
    
    public static void main(String[] args)
    {
        SortStack ss = new SortStack();
        ss.pushData(3);
        ss.pushData(5);
        ss.pushData(7);
        ss.pushData(4);
        
        ss.sortTheStack(ss.s);
       Stack<Integer> result = ss.returnSortStack(ss.r);
        
        while(!result.empty())
        {
            System.out.println(result.pop());
        }
    }
    
    
}
