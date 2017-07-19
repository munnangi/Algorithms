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
public class StackNode {
    
     int data;
     int min;
     StackNode next;
    
     StackNode(int x)
    {
        data = x;
        this.min = x;
        next = null;
    }
    
}
