import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String rev="";
      int j=0;
      j=str.length();
      for(int i=j-1;i>=0;i--)
      {
        rev=rev+str.charAt(i);
      }
      if(str.equals(rev))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}