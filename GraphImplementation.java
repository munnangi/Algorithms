/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author munna
 */
public class GraphImplementation {
    
    public class Edge
    {
        int v,w;
        public  Edge(int vertex, int weight)
        {
            this.v =  vertex;
            this.w = weight;
            
        }   
        
        public String toString()
        {
            return "("+v+","+w+")";
        }
    }
       LinkedList<Edge> G[];
       
       public void addVertices(int size)
       {
           G = new LinkedList[size];
           
           for(int i=0;i<G.length;i++)
           {
               G[i] = new LinkedList<Edge>();
           }
       }
        
        public void addEdge(int u,int v, int w)
        {
           G[u].add(0,new Edge(v,w));
        }
        
       public String toString()
       {
           String result ="";
           for(int i=0;i<G.length;i++)
           {
               result += i+"=>"+G[i]+ "\n";
           }
           return result;
       }
       
       boolean isConnected(int u,int v)
       {
           for(Edge i : G[u])
           {
               if(i.v ==v)
                   return true;
           }
           return false;
       }
       
       void removeVertex(int u,int v)
       {
           for(Edge i : G[u])
           {
               if(i.v == v)
                   G[u].remove(i);
           }
       }
        
       public void DFS(int u, boolean[] V)
       {
           
            for(Edge i : G[u])
            {               
                  DFS(i.v,V);
                System.out.println(i.v); 
                if (!V[u]) {
                    
                }
                   V[u] = true;
                   
                   
                   
            }
 
       }
       
       void topologicalSort(int u, boolean[] V,Stack stack1)
       {
          
           if (G[u] == null || G[u].isEmpty() && !V[u]) {
               V[u] = true;
               stack1.push(new Integer(u));
           }
           for(Edge i:G[u])
           {
               if(!V[u]) {
               topologicalSort(i.v,V,stack1);
                stack1.push(new Integer(u));
                 V[u] =true;
               }
               
           }
           
          
       }
       
       
       
        public static void main(String[] args)
        {
            GraphImplementation gph = new GraphImplementation();
            gph.addVertices(6);
            
             gph.addEdge(5, 0, 30);
            gph.addEdge(5, 2, 30);
            gph.addEdge(2, 3, 30);
            gph.addEdge(3, 1, 30);
            gph.addEdge(4, 0, 30);
            gph.addEdge(4, 1, 30);
            
            System.out.println(gph);
//            System.out.println(gph.isConnected(0, 2));
//            gph.removeVertex(0,2);
//            System.out.println(gph);
            boolean[] V = new boolean[gph.G.length];
            for(int i=0;i<V.length;i++)
            {
                V[i] = false;
            }
           
            Stack stack1 = new Stack();
            for(int i= 0 ; i<gph.G.length;i++)
            {
                if(V[i] ==false)
                 gph.topologicalSort(i,V,stack1);
                 
            }
            
           while(!stack1.isEmpty())
                System.out.println(stack1.pop());
            
            
        }
    
}
