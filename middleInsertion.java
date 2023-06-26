package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(){
        next = null;
    }
    Node(int x){
        next = null;
        data = x;
    }
}

public class middleInsertion {
    void insert(Node head, int x){
        Node tmp = head;
        Node newnode = new Node(x);
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newnode;
    }
    void display(Node head){
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
            System.out.print(tmp.data + " ");
        }
        System.out.println("");
    }
    void ins(Node head, int n, int i){
    	Node tmp = head;
        Node newnode = new Node(n);
        int i1 = 1;
        while(tmp.next != null){
            tmp = tmp.next;
            if(i1 == i) {
            	newnode.next = tmp.next;
            	tmp.next = newnode;
            }
            i1++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();
        middleInsertion m = new middleInsertion();
        Node head = new Node();
        int i;
        for(i = 6; i < 10; i++){
            m.insert(head, i);
        }
        m.display(head);
        int l = 4;
        for(i = 1; i < l; i++) {
        	if(i == l/2) {
        		m.ins(head, n, i);
        	}
        }
        m.display(head);
    }
}
