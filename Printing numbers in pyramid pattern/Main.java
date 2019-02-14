import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	int n,i,j,k,num=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(k=1;k<=i;k++)
        {
          num=num+1;
          System.out.print(num +" ");
        }
        System.out.print("\n");
      }
    }    
}