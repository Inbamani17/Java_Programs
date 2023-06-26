package ArrayList;
import java.util.*;
public class listPrint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int i;
		System.out.println("Enter the elements: ");
		for(i = 0; i < n; i++){
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
	}
}
