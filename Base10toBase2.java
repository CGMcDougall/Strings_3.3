import java.util.Scanner;
public class Base10toBase2
{
    public static void String(String[] args){
        Scanner Sc = new Scanner(System.in);      
        int d = Sc.nextInt();
      // System.out.println(Converter(d));
        
    }
    
    public static String Converter(int x){
        int y = 0;
        String tot =  "";
        boolean Done = false;
        while(Done == false){
        y = x%2;
        x = (int)(x/2); 
            
         if(y == 1)tot += "1";
         else tot += "0";
         System.out.print(x);
         if(x == 0)Done = true;
        }
        
        String Total = "";
        for(int i = tot.length()-1; i >= 0; i--){
           String a = tot.substring(i,i+1);   
         Total += a;  
        }
        return Total;
        
    }
}
