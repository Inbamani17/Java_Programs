package ArrayList;
import java.util.*;
public class listSearching {
	static String search(ArrayList<Integer> arr, int v, int n) {
		int i;
		for(i = 0; i < n; i++) {
			int a = arr.get(i);
			if(a == v) {
				return ("The element " + a + " is found at " + (i+1) + " position");
			}
		}
		return ("The element " + v + " is not found.");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i;
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Enter the element to be found: ");
		int v = sc.nextInt();
		System.out.println(search(arr, v, n));
	}
}
