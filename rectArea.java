package OOPS;
import java.util.*;
class rectangle {
	  int width;
	  int height;

	  public rectangle(int width, int height) {
	    this.width = width;
	    this.height = height;
	  }
	  int getArea() {
	    return width * height;
	  }
	  int getPerimeter() {
	    return 2 * (width + height);
	  }
	}
public class rectArea {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the lenght and breadth of the rectangle: ");
	  int l = sc.nextInt();
	  int b = sc.nextInt();
	  rectangle rect = new rectangle(l, b);
	  System.out.println("The area of the rectangle is: " + rect.getArea());
	  System.out.println("The perimeter of the rectangle is: " + rect.getPerimeter());
	  
  }
}
