import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int num1,num2,num3,lar;
      num1=s.nextInt();
      num2=s.nextInt();
      num3=s.nextInt();
      if(num1>num2&&num1>num3)
      {
        lar=num1;
        System.out.println(lar);
      }
      if(num2>num1&&num2>num3)
      {
        lar=num2;
        System.out.println();
      }
      if(num3>num1&&num3>num2)
      {
        lar=num3;
        System.out.println(lar);
      }
    }
}