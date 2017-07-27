/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.util.ArrayList;

/**
 *
 * @author munna
 */
public class MaxHeapImplementation {
    
    public static ArrayList<Integer> items = new ArrayList<Integer>();
        
    private void siftUp(int val)
    {
        items.add(val);
        int k = items.size() - 1;
        
        
        while(k >0)
        {
            int p = (k-1)/2;
            if(items.get(k).compareTo(items.get(p))>0)
            {
                int temp = items.get(p);
                items.set(p, items.get(k));
                items.set(k, temp);
               k=p;
            }
            else
            {
                break;
            }
        }
        
    }
    private int siftdown()
    {
        int temp = items.get(0);
        int k = items.size()-1;
        items.set(0, items.get(k));
        items.remove(k);
        int p =0;
        int indexl = 1;
       
        
        while(indexl < items.size()-1)
        {
             
            int indexr = indexl + 1;
            int max = indexl;
                
            if(indexr < items.size()-1 )
            {
                if(items.get(indexr).compareTo(items.get(indexl))>0)
                {
                   max = indexr;
                }    
            }
            
            if(items.get(max).compareTo(items.get(p))>0)
             {
                 int val = items.get(p);
                 items.set(p, items.get(max));
                 items.set(max, val);
                 p = max;
                 indexl = 2*(p)+1;
             }
             else
             {
                 break;
             }
        }
        return temp;
        
    }
    
    
    public static void main(String[] args)
    {
        MaxHeapImplementation mh = new MaxHeapImplementation();
        items.add(15);
        items.add(14);
        items.add(3);
        items.add(12);
        items.add(13);
        items.add(2);
        items.add(1);
        for(int i=0;i<items.size();i++)
        {
            System.out.println(items.get(i));
            
        }
        System.out.println("new line");
       int result =  mh.siftdown();
       System.out.println(result);
       System.out.println("new line");
           for(int i=0;i<items.size();i++)
        {
            System.out.println(items.get(i));
        }
        
        
        
    }
    
    
}
