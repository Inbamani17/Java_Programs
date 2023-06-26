package LinkedList;

import java.util.*;

class Node1{
	int data;
	Node1 next;
	Node1(){
		next = null;
	}
	Node1(int d){
		next = null;
		data = d;
	}
}
public class displayList {
	void insert(Node1 head, int n) {
		Node1 tmp = head;
		Node1 newNode = new Node1(n);
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	void display(Node1 head) {
		Node1 tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
			System.out.println(tmp.data);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int n2 = sc.nextInt();
		displayList d = new displayList();
		Node1 head = new Node1();
		int i;
		for(i = n1; i < n2; i++) {
			d.insert(head, i);
		}
		d.display(head);
	}

}
