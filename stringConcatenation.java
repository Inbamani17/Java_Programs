package String;
import java.util.*;
public class stringConcatenation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		String str = "";
		for(int i = 0; i < len1; i++) {
			char a = str1.charAt(i);
			str += a;
		}
		str += ' ';
		for(int i = 0; i < len2; i++) {
			char a = str2.charAt(i);
			str += a;
		}
		System.out.println(str);
	}
}
