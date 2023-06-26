package ArrayList;
import java.util.*;
public class listSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i, j;
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int min = 0;
		int max = 0;
		for(i = 0; i < n - 1; i++) {
			for(j = i + 1; j < n; j++) {
				int a = arr.get(i);
				int b = arr.get(j);
				if(a > b) {
					min = b;
					max = a;
				}
				else {
					min = a;
					max = b;
				}
				arr.set(i, min);
				arr.set(j, max);
			}
		}
		System.out.println(arr);
		
	}
}
