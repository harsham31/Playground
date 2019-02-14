import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println(sq(n));
	} 
  public static int sq(int a)
  {
    int result=a*a;
    return result;
  }
}