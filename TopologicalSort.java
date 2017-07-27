/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author munna
 */
public class TopologicalSort {
    
    public class Edge
    {
        int v,w;
        
        public Edge(int v, int w)
        {
            this.v = v;
            this.w = w;
        }
          
    }
     public LinkedList<Edge> G[];
        
        void addVertices(int sizeofV)
        {
            G = new LinkedList[sizeofV];
            
            for(int i=0;i<sizeofV;i++)
            {
                G[i] = new LinkedList();
            }
        }
        
        void addEdge(int u, int v, int w)
        {
            G[u].add(0,new Edge(v,w));
        }
    
        
        void topoSort(int i, Stack S, boolean V[])
        {
            V[i] = true;
            
            
            Iterator<Edge> it = G[i].iterator();
            
            while(it.hasNext())
            {
               int x  = it.next().v;
                
                if(!V[x])
                {
                    topoSort(x,S,V);
                 
                }
                
            }
            S.push(new Integer(i));
            
        
        }
        
        
        
        
        public static void main(String[] args)
        {
            TopologicalSort TS = new TopologicalSort();
            TS.addVertices(6);
            TS.addEdge(2,3, 0);
            TS.addEdge(3,1, 0);
            TS.addEdge(4,0, 0);
            TS.addEdge(4,1, 0);
            TS.addEdge(5,2, 0);
            TS.addEdge(5,0, 0);
            
            boolean V[] = new boolean[TS.G.length];
            Stack<Integer> S = new Stack<Integer>();
            
            for(int i=0; i<TS.G.length;i++)
            {
                V[i] = false;
            }
            
            for(int i=0; i<TS.G.length;i++)
            {
                if(V[i]== false)
                {
                    TS.topoSort(i,S,V);
                }
            }
             while (S.empty()==false)
            System.out.print(S.pop() + " ");
            
        }
    
    
    
}
