package String;
import java.util.*;
public class emailValidation {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the email address: ");
        String str = sc.nextLine();
        if((str.contains("com") || str.contains("in") || str.contains("net") || str.contains("org")) && str.contains("@")){
            System.out.println(str + " is a valid email address");
        }
        else{
            System.out.println(str + " is an invalid email address");
        }
    }
}
