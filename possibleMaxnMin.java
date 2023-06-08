package String;
import java.util.*;
public class possibleMaxnMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int min = 0;
        int max = 0;
        int l1 = str1.length();
        int l2 = str2.length();
        int i;
        for(i = 0; i < l1; i++){
            if(str1.charAt(i) == '?' && str2.charAt(i) == '?'){
                max++;
            }
            else if((str1.charAt(i) != '?' && str2.charAt(i) == '?')||(str1.charAt(i) == '?' && str2.charAt(i) != '?')){
                max++;
            }
            else if(str1.charAt(i) != str2.charAt(i)){
                max++;
                min++;
            }
        }
        System.out.println(min + " " + max);
    }
}
