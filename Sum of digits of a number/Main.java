import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int n,sum=0,digit;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      while(n!=0)
      {
        digit=n%10;
        sum=sum+digit;
        n=n/10;
      }
      System.out.println(sum);
      
	}
}