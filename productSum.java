package Array;
import java.util.*;
public class productSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		int product = 1;
		System.out.println("Enter the elements of the array: ");
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			product *= arr[i];
		}
		System.out.println(product);
	}
}
