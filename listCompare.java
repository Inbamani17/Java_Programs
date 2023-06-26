package ArrayList;
import java.util.*;
public class listCompare {
	static ArrayList compare(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n1, int n2) {
		int i, j;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(i = 0; i < n1; i++) {
			int c = 0;
			for(j = 0; j < n2; j++) {
				int a = arr1.get(i);
				int b = arr2.get(j);
				if(a == b) {
					c++;
				}
			}
			if(c != 0) {
				arr.add(arr1.get(i));
			}
		}
		return arr;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in  1st list: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the number of elements in  2nd list: ");
		int n2 = sc.nextInt();
		int i;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println("Enter the number of elements: ");
		for(i = 0; i < n1; i++) {
			arr1.add(sc.nextInt());
		}
		for(i = 0; i < n2; i++) {
			arr2.add(sc.nextInt());
		}
		System.out.println(compare(arr1, arr2, n1, n2) + " are the values present in both the lists.");		
	}
}
