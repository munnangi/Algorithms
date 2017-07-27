/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author munna
 */
public class HashMapLooping {
    
    
    public static HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    
    public static void main(String[] args)
    {
         
        hm.put(0,5);
        hm.put(1,6);
        hm.put(2,7);
        hm.put(3,8);
        hm.put(4,9);
       
        
//        for(Integer key:hm.keySet())
//        {
//            System.out.println(hm.get(key));
//            
//        }
        
        for(Entry entry:hm.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
    
    
    
}
