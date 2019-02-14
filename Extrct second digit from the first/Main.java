import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    int n,second=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n>9)
    {
      second=n%10;
      n=n/10;
    }
    System.out.println(second);
  }
}
