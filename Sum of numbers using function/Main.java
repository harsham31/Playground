import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println(sum(n));
	}
  public static int sum(int a)
  {
    int sum=0,i;
    for(i=1;i<=a;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
}