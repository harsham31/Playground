import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int a[];
      int i,n,lar=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      a=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(lar<a[i])
        {
          lar=a[i];
        }
      }
      System.out.println(lar);
    }
}