package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class append {
	public static void main(String args[]) {
		//Appending two arrays and sort and remove duplicates
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int n1 = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i, j;
		System.out.println("Enter the elements of first array: ");
		for(i = 0; i < n1; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Enter the size of second array: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the elements of second array: ");
		for(i = 0; i < n2; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		for(i = 0; i < arr.size() - 1; i++) {
			int a1 = arr.get(i);
			int a2 = arr.get(i + 1);
			if(a1 == a2) {
				arr.remove(i);
			}
		}
		System.out.println(arr);
	}

}
