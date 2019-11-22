import java.util.Scanner;
public class PigLatin
{
    public static void String(String[] args){
      Scanner Sc = new Scanner(System.in);  
      String Word = Sc.nextLine();
      Word.trim();
      int y = 0;
      String Total = "";
      boolean Short = false;
      for(int i = 0; i < Word.length(); i++){
          Short = false;
 int x = Word.indexOf(" ",y);
 y = 0;
 if(i == 0)x = 0;
 if(x == -1)i = Word.length();
 
 if(x >= 0){
     
    y = Word.indexOf(" ",x+1);
  if(i != 0)x += 1;
    System.out.println(x);
    if(y <= 0)y = Word.length();
    if(Math.abs(x-y) <= 2){
        Short = true;
    }
    }
  
    
    if(Short == false && x >= 0 && y >= 0)Total += Converter(Word,x,y);
    else if (x >= 0 && y >= 0)Total += Word.substring(x,y) + " ";
    else i = Word.length();
    x = 0;

    }
       System.out.println(Total);
    }
    
    public static String Converter(String Word,int B, int E){
             String ex = Word.substring(B,E);
            String Ex = Word.substring(B+1,E) + Word.substring(B,B+1) + "ay ";
        
        return Ex;
        
    }
    
}
