import java.util.Scanner;
public class PigLatin
{
    public static void String(String[] args){
      Scanner Sc = new Scanner(System.in);  
      String Word = Sc.nextLine();
      int B = 0;
      int E = 0;
      int Tot = 0;
      String Total = "";
      boolean Open = false;
      for(int i = 0; i < Word.length(); i++){
         if(Tot == 0 && Word.indexOf(" ",Tot) > 0){
             Total += Converter(Word,0,Word.indexOf(" ",Tot));
            }
    else{
         if(Word.indexOf(" ",Tot) > 0){
          B = Word.indexOf(" ",Tot);
          Open = true;
        }
        if(Word.indexOf(" ",B+1) > 0){
        E = Word.indexOf(" ",B+1);
        Open = false;
        }
    }
        if(B >0 && E > 0){
            Total += Converter(Word,B,E);
            Tot = E+1;
            B = 0;
            E = 0;
             
        }
    
        else if(Open == true && B > 0 && E < 0){
         Total += Converter(Word,Tot,Word.length());
        }
        else{
            i = Word.length();
            Total += Converter(Word,0,Word.length());
        }
    }
       //System.out.println(Total);
    }
    
    public static String Converter(String Word,int B, int E){
             String ex = Word.substring(B,E);
            String Ex = Word.substring(B+1,E) + Word.substring(B,B+1) + "ay ";
        
        return Ex;
        
    }
    
}
