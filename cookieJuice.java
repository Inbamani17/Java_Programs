package String;
import java.util.*;
public class cookieJuice {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int i;
        int c = 0;
        String cook = "cookie";
        String juice = "juice";
        for(i = 0; i < arr.length - 1; i++){
            if(arr[i].equals(cook) && arr[i+1].equals(cook)){
                c++;
            }
        }
        if(c == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
