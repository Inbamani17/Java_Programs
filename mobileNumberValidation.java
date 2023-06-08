package String;

import java.util.*;
public class mobileNumberValidation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number: ");
        String str = sc.nextLine();
        int c = 0;
        String s = "";
        int i;
        for(i = 0; i < 3; i++){
            s += str.charAt(i);
        }
        int a = s.compareTo("+91");
        if(a == 0 && str.length() == 13){
            System.out.println("Mobile number valid");
        }
        else{
            System.out.println("Mobile number invalid");
        }
    }
}
