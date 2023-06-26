package LinkedList;
import java.util.*;
class Node2{
	int data;
	Node2 next;
	Node2(){
		next = null;
	}
	Node2(int d){
		data = d;
		next = null;
	}
}
public class deleteList {
	void insert(Node2 head, int n) {
		Node2 tmp = head;
		Node2 newNode = new Node2(n);
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	void delete(Node2 head, int n) {
		Node2 tmp = head;
		Node2 prev = tmp;
		int i = 1;
		if (tmp != null && tmp.data == n) {
            head = tmp.next;
		}
		while(tmp.next != null && tmp.data != n) {
			prev = tmp;
			tmp = tmp.next;
			i++;
		}
		prev.next = tmp.next;
	}
	void display(Node2 head) {
		Node2 tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
			System.out.println(tmp.data);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int i;
		deleteList d = new deleteList();
		Node2 node = new Node2();
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++) {
			int v = sc.nextInt();
			d.insert(node, v);
		}
		System.out.println("Enter the number of elements to be deleted: ");
		int nd = sc.nextInt();
		System.out.println("Enter the elements to be deleted: ");
		for(i = 0; i < nd; i++) {
			int v = sc.nextInt();
			d.delete(node, v);
		}
		d.display(node);
	}
}
