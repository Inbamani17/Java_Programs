package ArrayList;
import java.util.*;
public class subList {
	static void sub(ArrayList<Integer> arr, int n, int start, int end) {
		int i;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		start--;
		end--;
		for(i = start; i <= end; i++) {
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
		System.out.println("Enter the staring index of sublist: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending index of sublist: ");
		int end = sc.nextInt();
		sub(arr, n, start, end);
	}
}
