package OOPS;

import java.util.*;

class Student {
	String name;
	String reg;
	int grade;

	public Student(String name, String reg, int grade) {
		this.name = name;
		this.reg = reg;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getReg() {
		return reg;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void printStudentDetails() {
		System.out.println("Name: " + name);
		System.out.println("Reg. No.: " + reg);
		System.out.println("Grade: " + grade);
	}

}

public class studentReport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		int i;
		Student student[] = new Student[n];
		for(i = 0; i < n; i++) {
			System.out.println("Enter the name of student " + (i + 1) + " : ");
			String name = sc.next();
			System.out.println("Enter the register number of student " + (i + 1) + " : ");
			String reg = sc.next();
			System.out.println("Enter the grade of student " + (i + 1) + " : ");
			int grade = sc.nextInt();
			student[i] = new Student(name, reg, grade);
		}
		System.out.println("Student Details:");
		for(i = 0; i < n; i++) {
			System.out.println();
			student[i].printStudentDetails();
		}
	}
}