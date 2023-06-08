package String;
import java.util.*;
public class stringChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();
		String s[] = str1.split(" ");
		int len = s.length;
		int i;
		System.out.println("Enter the word to be found: ");
		String str2 = sc.nextLine();
		int c = 0;
		for(i = 0; i < len; i++) {
			String x = s[i];
			if(x.equals(str2)) {
				c++;				
			}
		}
		if(c == 0) {
			System.out.println("The word is not present in the string.");
		}
		else {
			System.out.println("The word is found " + c + " times in the string.");
		}
	}
}
