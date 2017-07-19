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
public class MergeSort {
    
    
    
    public static void main(String[] args)
    {
        int A[] = new int[10];
        populateA(A);
        
        printArray(A);
        
        
        printArray(mergeSort(A));
        
       
    }
    
    
    public static int[] mergeSort(int[] A)
    {
        if(A.length <2)
            return A ;
       int midpoint = A.length/2;
       
       int[] leftArray = new int [midpoint];
       int[] rightArray;
       
       if(A.length %2 == 0)
           rightArray = new int[midpoint];
       else
           rightArray = new int[midpoint+1];
       
       int[] result = new int[A.length];
       
       for(int i=0; i< midpoint;i++)
       {
           leftArray[i] = A[i];
           
       }
       int e= 0;
       for(int j=midpoint; j< A.length;j++)
       {
           rightArray[e] = A[j];
           e++;
       }
       
      
      leftArray = mergeSort(leftArray);
      rightArray = mergeSort(rightArray);
      result = mergeArray(leftArray,rightArray);

      return result;
    }
    
    public static int[] mergeArray(int[] l, int[] r)
    {
        int lengthResult = l.length + r.length;
        int[] re = new int[lengthResult];
        int a =0;
        int b=0;
        int c=0;
        
        while(a< l.length || b < r.length)
        {
            if(a < l.length && b < r.length)
            {
                if(l[a] <= r[b])
                {
                    re[c] = l[a];
                    c++;
                    a++;
                }
                else
                {
                    re[c] = r[b];
                    c++;b++;
                }
            }
            else if(a < l.length)
            {
                re[c] = l[a];
                c++;a++;
            }
            else if(b < r.length)
            {
                re[c] = r[b];
                c++;b++;
            }
        }
        return re;
    }
     public static int[] populateA(int[] A)
     {
         for(int i=0; i < A.length; i++)
         {
             A[i] = (int)(Math.random()*100);
         }
         return A;
     }
     static void  printArray(int[] A)
     {
         for(int i=0; i< A.length; i++)
         {
             System.out.print(A[i] + ",");
             
             
         }
         System.out.println("");
     }
    
}
