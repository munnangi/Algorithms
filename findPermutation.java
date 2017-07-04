/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.util.HashMap;

/**
 *
 * @author munna
 */
public class findPermutation {
    
      HashMap<Character,Integer> Hm = new HashMap();
      
   boolean findPerm(String a, String b)
    {
        for(int i=0; i < a.length() ; i++)
        {
            char c = a.charAt(i);
            Integer count = Hm.get(c);
            if(count != null)
            {
                count++;
                Hm.put(c, count);
                
            }
            else
            {
                Hm.put(c, 1);
            }
        }
        
        for(int j=0; j< b.length();j++)
        {
            char d = b.charAt(j);
            Integer count = Hm.get(d);
            if(count != null && count > 0)
            {
                count--;
                Hm.put(d, count);
            }
            else if(count == null)
            {
                return false;
            }
            
        }
        
        
        for(Character key: Hm.keySet())
        {
            Integer value = Hm.get(key);
            
            if(value !=0)
                return false;
        }
        
        
        return true;
    }
   
   public static void main(String[] args)
   {
       findPermutation fndp = new findPermutation();
       
       System.out.println(fndp.findPerm("abc", "bca"));
   }
    
  
    
    
    
    
    
}
