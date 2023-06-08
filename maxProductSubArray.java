package Array;
import java.util.*;
public class maxProductSubArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int i, j;
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int product = Integer.MIN_VALUE;
        int v = 1;
        for(i = 0; i < n; i++){
            v = 1;
            for(j = i; j < n; j++){
                v *= arr[j];
                product = Math.max(v, product);
            }
        }
        System.out.println(product);
	}
}
