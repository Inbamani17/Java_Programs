package String;
import java.util.*;
public class characterCount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int len = str.length();
		int i;
		int count = 0;
		for(i = 0; i < len; i++) {
			char a = str.charAt(i);
			if(a >= 65 && a <= 90 || a >= 97 && a <= 122) {
				count++;
			}
		}
		System.out.println(count);
	}
}
