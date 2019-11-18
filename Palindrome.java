
import java.util.Scanner;

public class Palindrome
{
    public static void String(String[] args){
        Scanner Sc = new Scanner(System.in);      
        String str = Sc.nextLine();
        String tot = "";
        for(int i = str.length()-1; i >= 0; i--){
         String a = str.substring(i,i+1);   
         tot += a;
            
        }
        if(tot.equalsIgnoreCase(str))System.out.println("true");
        else System.out.println("false");
        
    }
}
