package String;
import java.util.*;
public class stringPermutation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();
		int len = str1.length();
		String str2 = "";
		int i, j;
		for(i = 0; i < len; i++) {
			str2 = "";
			for(j = i; j < len; j++) {
				str2 += str1.charAt(j);
			}
			for(j = 0; j < i; j++) {
				str2 += str1.charAt(j);
			}
			System.out.println(str2);
		}
	}
}
