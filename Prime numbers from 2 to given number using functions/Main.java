import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(pr(i))
        {
          System.out.println(i);
        }
      }
    }
      public static boolean pr(int a)
      {
        boolean pr=true;
        for(int num=2;num<=a/2;num++)
        {
          if(a%num==0)
          {
            pr=false;
            break;
          }
        }
        return pr;
      }
}