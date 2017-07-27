/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author munna
 */
public class anagrams {
  public static  HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
  public static   HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();

    public static int numberNeeded(String first, String second) {
        for(int i =0; i <first.length();i++)
        {
            Character ch = first.charAt(i);
            if(hm1.get(ch) == null)
            {
                hm1.put(ch,1);
            }
            else
            {
                int count = hm1.get(ch);
                hm1.put(ch,count++);
            }
        }
        int number = 0;
           for(int i =0; i <second.length();i++)
        {
            Character ch = second.charAt(i);
            if(hm2.get(ch) == null)
            {
                hm2.put(ch,1);
            }
            else
            {
                int count = hm2.get(ch);
                hm2.put(ch,count++);
            }
               if(!hm1.containsKey(ch))
               {
                   number++;
               }
        }
        
           Iterator it = hm1.entrySet().iterator();
         while (it.hasNext()) {
         Map.Entry pair = (Map.Entry)it.next();
         if(hm2.containsKey(pair.getKey())) 
         {
            number += Math.abs(hm1.get(pair.getKey())- hm2.get(pair.getKey())); 
         }
         else
         {
             number += hm1.get(pair.getKey());
         }
             it.remove();
         
    }
        
        return number;
        
        
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }


    
}
