package OOPS;
import java.util.*;
class person{
    String name;
    int age;
}
public class classPerson{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of person: ");
    	int n = sc.nextInt();
    	person person[] = new person[n];
    	int i;
    	for(i = 0; i < n; i++) {
    		person[i] = new person();
    		System.out.println("Enter the person " + (i + 1) + " details: ");
    		person[i].name = sc.next();
    		person[i].age = sc.nextInt();
    	}
    	for(i = 0; i < n; i++) {
    		System.out.println(person[i].name + " is " + person[i].age + " years old.");
    	}
    }
}

