import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
      int n,s1,s2,c1=0,c2=0;
      n=s.nextInt();
      int a[];
       a =new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      s1=s.nextInt();
      s2=s.nextInt();
      for(int i=0;i<n;i++)
      {
        if(a[i]==s1)
        {
          c1=i;
          break;
        }
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==s2)
        {
          c2=i;
        }
      }
      System.out.println(c1);
      if(c2==0)
      {
        c2=-1;
      }
      System.out.println(c2);
    }
}