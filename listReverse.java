package ArrayList;
import java.util.*;
public class listReverse {
	static void reverse(ArrayList<Integer> arr, int n) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		int i;
		for(i = n-1; i >= 0; i--) {
			arr1.add(arr.get(i));
		}
		System.out.println(arr1);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int i;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		reverse(arr, n);
	}
}
