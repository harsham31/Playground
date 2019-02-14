import java.util.Scanner;
class Main{
   public static String revs(String is)
   {
     String[] words=is.split("\\s");
     String os="";
     //int j=0;
    // j=words.length();
     for(int i=words.length-1;i>=0;i--)
     {
       os=os+words[i]+" ";
     }
     return os;
   }
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    String is=s.nextLine();
    String os=revs(is);
    System.out.println(os);
  }
    
}