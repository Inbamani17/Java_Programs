package Array;
import java.util.*;
public class maxSumSubArray {
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
		int sum = Integer.MIN_VALUE;
        int v = 0;
        for(i = 0; i < n; i++){
            v = 0;
            for(j = i; j < n; j++){
                v += arr[j];
                sum = Math.max(v, sum);
            }
        }
        System.out.println(sum);
	}
}
