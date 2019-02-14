import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=gcd(n1,n2);
      System.out.println(gcd(result,n3));
      
	}
  public static int gcd(int n1,int n2)
  {
    int m=0;
    if(n1>n2)
    {
      m=n1;
    }
    else
    {
      m=n2;
    }
    return m;
  }
}