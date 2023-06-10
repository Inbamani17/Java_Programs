package OOPS;
import java.util.*;
class Employee {
	String name;
	String role;
	double salary;
	
	public Employee(String name, String role, double salary) {
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(String role) {
		if(role.equals("TL")) {
			salary = salary + salary * 10 / 100;			
		}
		else {
			salary = salary + salary * 5 / 100;			
		}
	}

	public void printEmployeeDetails() {
		System.out.println("Name: " + name);
    	System.out.println("Job Title: " + role);
    	System.out.println("Salary: " + salary);
	}
}
public class empSal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		int i;
		Employee employee[] = new Employee[n];
		for(i = 0; i < n; i++) {
			System.out.println("Enter the employee name:");
			String name = sc.next();
			System.out.println("Enter the employee role:");
			String role = sc.next();
			System.out.println("Enter the employee salary:");
			int sal = sc.nextInt();
			employee[i] = new Employee(name, role, sal);
		}
		System.out.println();
		System.out.println("\nEmployee Details:");
		for(i = 0; i < n; i++) {			
			employee[i].printEmployeeDetails();
		}
		for(i = 0; i < n; i++) {		
			String roles = employee[i].getRole();
			employee[i].raiseSalary(roles);
		}
		System.out.println();
		System.out.println("After raising salary:");
		for(i = 0; i < n; i++) {		
			employee[i].printEmployeeDetails();
		}
	}
}
