package OOPS;
import java.util.*;
class circleMeasure {
	  double radius;
	  double pi = 3.14;

	  public circleMeasure(int radius) {
	    this.radius = radius;
	  }
	  double getArea() {
	    return pi * (radius * radius);
	  }
	  double getCircumference() {
	    return 2 * (pi * radius);
	  }
	}

public class circle {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the radius of the circle: ");
	  int r = sc.nextInt();
	  circleMeasure rect = new circleMeasure(r);
	  System.out.format("The area of the circle is: %.2f" , rect.getArea());
	  System.out.println();
	  System.out.format("The circumference of the circle is: %.2f" , rect.getCircumference());
	  
  }
}
