package ArrayList;
import java.util.*;
public class returnIndex {
	static int returning(ArrayList<Integer> arr, int n, int v) {
		int a = 0;
		v--;
		for(int i = 0; i < n; i++) {
			if(i == v) {
				a = arr.get(i);
			}
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i;
		System.out.println("Enter the elements: ");
		for(i = 0; i < n ; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Enter the index: ");
		int v = sc.nextInt();
		System.out.println(returning(arr, n, v));
	}
}
