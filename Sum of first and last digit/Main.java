import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n,first=0,last=0,sum=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      last=n%10;
      while(n>10)
      {
        n=n/10;
        first=n;
      }
      sum=first+last;
      System.out.println(sum);
	}
}