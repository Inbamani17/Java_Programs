package Pattern;
import java.util.Scanner;
public class patternInverseTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = sc.nextInt();
		int i, j;
		for(i = n - 1; i >= 0; i--) {
			for(j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(j = 0; j < i; j++) {
				System.out.print('*');
			}
			for(j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
