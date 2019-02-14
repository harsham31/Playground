import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     int n,sum=0,i;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        sum=sum+i;
      }
      System.out.println(sum);
      
        
	}
}