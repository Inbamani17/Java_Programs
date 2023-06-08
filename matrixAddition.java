package Array;
import java.util.*;
public class matrixAddition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and column for the array: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i, j;
		int arr1[][] = new int[m][n];
		System.out.println("Enter the elements of the first matrix: ");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix: ");
		int arr2[][] = new int[m][n];
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int sum[][] = new int[m][n];
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
