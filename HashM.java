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
public class HashM {
    
    int size = 10;
    Entry[] entry = new Entry[10];
    
    private class Entry{
    String key;
    int val;
    Entry next;
    
    Entry(String key,int val)
    {
      this.key = key;
      this.val = val;
    }
}
    
    void putValue(String key, int value)
    {
        int loc = key.hashCode()%10;
        Entry newen = new Entry(key,value);
        Entry head = entry[loc];
        if(head == null)
        {
        head = newen;
        entry[loc] = head;
        }
        else
        {    
            while(head.next != null)
            {
                if(head.key.equals(key))
                {
                    head.val = value;
                    return;
                }
                head = head.next;
                    
            }
            if (head.key.equals(key)) {
                  head.val = value;
                  return;
            }
           head.next = newen;
        }
  
    }
    
    void getValue(String key)
    {
        int loc = key.hashCode()%10;
        Entry h = entry[loc];
        if(h != null)
        {
           while(h !=null)
           {
               if(h.key.equals(key))
                       {
               System.out.println(h.val);
               return;
                       }
               h = h.next;
           }
        }
    }
    
    public static void main(String[] args)
    {
        HashM hm = new HashM();
        hm.putValue("c", 1);
        hm.putValue("b", 2);
        hm.putValue("c", 3);
        hm.putValue("d", 4);
        hm.putValue("e", 5);
        hm.putValue("a", 6);
        
        hm.getValue("c");
    }
    
    
    
    
}
