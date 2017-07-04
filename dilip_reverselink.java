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
class Node {
	Node (int x) {
		this.x = x;
	}
	int x;
	Node next;
}
public class dilip_reverselink {

	static Node head;
	 
	public Node reverse(Node n) {
		if (n.next == null) {
			head = n;
			return n;
		}
		Node m = reverse (n.next);
		m.next = n;
		n.next = null;
		return n;
	}
	
	public static void main(String args[]) {
		Node n = new Node(1);
		Node n1 = new Node(2);
		Node n2= new Node(3);
		Node n3 = new Node(4);
		Node n4= new Node(5);
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		dilip_reverselink r = new dilip_reverselink();
		r.reverse(n);
		
		while(head != null) {
			System.out.println(head.x);
			head = head.next;
		}

	}
}
