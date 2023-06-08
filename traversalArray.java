package Array;
import java.util.Scanner;
public class traversalArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr1[] = new String[n];
		int i;
		for(i = 0; i < n; i++) {
			arr1[i] = sc.next();
		}
		int r = sc.nextInt();
		int val = 1;
		String arr2[] = new String[n];
		while(r >= val) {
			for(i = 0; i < n - 1; i++) {
				arr2[i] = arr1[i+1];
			}
			arr2[i] = arr1[0];
			for(i = 0; i < n; i++) {
				arr1[i] = arr2[i];
			}
			val++;
		}
		for(i = 0; i < n; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
