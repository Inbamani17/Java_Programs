package String;
import java.util.*;
public class footBall {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team 1 progress: ");
		String str1 = sc.nextLine();
		System.out.println("Enter team 2 progress: ");
		String str2 = sc.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		int a = 0;
		int b = 0;
		int i;
		for(i = 0; i < len1; i++) {
			if(str1.charAt(i) == 'W') {
				a += 3;
			}
			else if(str1.charAt(i) == 'D') {
				a += 1;
			}
		}
		for(i = 0; i < len2; i++) {
			if(str2.charAt(i) == 'W') {
				b += 3;
			}
			else if(str2.charAt(i) == 'D') {
				b += 1;
			}
		}
		if(a > b) {
			System.out.println("Team A is the winner.");
		}
		else {
			System.out.println("Team B is the winner.");
		}
	}
}
