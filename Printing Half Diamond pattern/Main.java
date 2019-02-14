import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int i,n,j,k;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(k=1;k<=(2*i)-1;k++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
      
	}
}