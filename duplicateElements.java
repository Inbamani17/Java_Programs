package Array;
import java.util.*;
public class duplicateElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int i, j;
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> dup = new ArrayList<Integer>();
		for(i = 0; i < n - 1; i++) {
			int c = 0; 
			for(j = i + 1; j < n; j++) {
				if(arr[i] == arr[j] && arr[i] > 0) {
					c++;
					arr[j] = -1;
				}
			}
			if(c != 0) {
				dup.add(arr[i]);
			}
		}
		System.out.println(dup);
	}

}
