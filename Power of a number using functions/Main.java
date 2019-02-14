import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int b=s.nextInt();
    int e=s.nextInt();
    System.out.println(power(b,e));
  }
  public static int power(int b,int e)
  {
    int power=1;
    while(e>=1)
    {
      power=power*b;
      e--;
    }
    return power;
  }
}
                   
                     