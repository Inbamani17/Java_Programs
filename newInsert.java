package ArrayList;
import java.util.*;
public class newInsert {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i;
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Enter the element position and value to be added: ");
		int v1 = sc.nextInt();
		v1--;;
		int v2 = sc.nextInt();
		arr.add(v1, v2);
		System.out.println(arr);
	}
}
