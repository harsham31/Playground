import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n,i,fact,digit,n1,sum=0;
        n=s.nextInt();
      n1=n;
      while(n!=0)
      {
        fact=1;
        digit=n%10;
        n=n/10;
        for(i=1;i<=digit;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
      }
      if(sum==n1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
	}
}