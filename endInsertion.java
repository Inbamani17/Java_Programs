package LinkedList;
import java.util.*;
class Node3{
	int data;
	Node3 next;
	Node3(){
		next = null;
	}
	Node3(int d){
		data = d;
		next = null;
	}
}
public class endInsertion {
	void insert(Node3 head, int i) {
		Node3 tmp = head;
		Node3 newNode = new Node3(i);
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	void display(Node3 head) {
		Node3 tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
			System.out.println(tmp.data);
		}
	}
	void extra(Node3 head, int x) {
		Node3 tmp = head;
		Node3 newNode = new Node3(x);
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes: ");
		int n = sc.nextInt();
		int i;
		Node3 node = new Node3();
		endInsertion end = new endInsertion();
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++) {
			int a = sc.nextInt();
			end.insert(node, a);
		}
		System.out.println("Elements before adding newly: ");
		end.display(node);
		System.out.println();
		System.out.println();
		System.out.println("Enter the number of elements to be added newly: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the elements to be added newly: ");
		for(i = 0; i < n1; i++) {			
			end.extra(node, sc.nextInt());
		}
		System.out.println();
		System.out.println();
		System.out.println("Elements after adding newly: ");
		end.display(node);
	}
}
