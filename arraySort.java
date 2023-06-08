package Array;
import java.util.*;
public class arraySort {
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
		for(i = 0; i < n - 1; i++) {
			for(j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
