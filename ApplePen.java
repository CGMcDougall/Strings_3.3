
import java.util.Scanner;

public class ApplePen
{
    public static void String(String[] args){
     Scanner Sc = new Scanner(System.in);
     int x = 0; 
     int y = 0;
     
// I have an blank i have a blank
     String word = Sc.nextLine();
    String a = "";
    String b = "";
    
    int n = 0;
    int d = 0;
     for(int i = 0; i < word.length(); i++){
  int c = word.indexOf(" ",d);    
         d = c+1;
 if(c > 0){
     n++;
     if(n == 3)x = c;
     if(n == 4)a = word.substring(x,c+1);
     if(n == 7)b = word.substring(c,word.length());
    }
 
 else i = word.length();
}

System.out.print("Uh! "+a+b+"!");
}
}