package Array;
import java.util.*;
public class matrixMultiplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and column for the array: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i, j, k;
		int arr1[][] = new int[m][n];
		System.out.println("Enter the elements of the first matrix: ");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix: ");
		int arr2[][] = new int[m][n];
		int mul[][] = new int[m][n];
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				arr2[i][j] = sc.nextInt();
				mul[i][j] = 0;
			}
		}
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				for(k = 0; k < n; k++) {				
					mul[i][j] += arr1[i][k] * arr2[k][i];
				}
			}
		}
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}
}
