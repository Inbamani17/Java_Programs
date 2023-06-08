package String;
import java.util.*;
public class camelCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();
		String str2 = "";
		if(str1.charAt(0) >= 65 && str1.charAt(0) <= 90) {
			str2 += (char)(str1.charAt(0) + 32);
		}
		else {
			str2 += str1.charAt(0);
		}
		int i;
		for(i = 1; i < str1.length(); i++) {
			if(str1.charAt(i - 1) == ' ' && str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
				str2 += (char)(str1.charAt(i) - 32);
			}
			else if(str1.charAt(i) != ' '){
				str2 += str1.charAt(i);
			}
		}
		System.out.println(str2);
	}

}
