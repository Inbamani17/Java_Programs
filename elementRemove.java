package ArrayList;
import java.util.*;
public class elementRemove {
	static ArrayList empty(ArrayList<Integer> arr, ArrayList<Integer> arr1, int n, int v) {
		int i, j;
		for(i = 0; i < n; i++) {
			for(j = 0; j < v; j++) {
				int a = arr.get(i);
				int b = arr1.get(j);
				if(a == b) {
					arr.remove(i);
				}
			}	
			n = arr.size();
		}
		return arr;
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
		System.out.println("Enter the number element to be removed: ");
		int v = sc.nextInt();
		System.out.println("Enter the elements to be removed: ");
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(i = 0; i < v; i++) {			
			arr1.add(sc.nextInt());
		}
		System.out.println(empty(arr, arr1, n, v));
	}
}
