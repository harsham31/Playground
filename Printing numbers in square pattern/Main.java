import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n,i,j;
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}