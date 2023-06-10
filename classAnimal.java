package OOPS;
import java.util.*;
class animal{
    String name;
    String animal;
    int age;
}
public class classAnimal {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of animals: ");
    	int n = sc.nextInt();
    	animal animal[] = new animal[n];
    	int i;
    	for(i = 0; i < n; i++) {
    		animal[i] = new animal();
    		System.out.println("Enter the name of animal " + (i + 1) + ": ");
    		animal[i].name = sc.next();
    		System.out.println("Enter the type of animal: " + (i + 1) + ": ");
    		animal[i].animal = sc.next();
    		System.out.println("Enter the age of animal: " + (i + 1) + ": ");
    		animal[i].age = sc.nextInt();
    	}
    	for(i = 0; i < n; i++) {
    		System.out.println(animal[i].name + " is a " + animal[i].age + " years old " + animal[i].animal);
    	}
    }

}
