import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner v= new Scanner(System.in);
    int n= v.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
       a[i]= v.nextInt();
    } 
    int sum= a[0]+a[1]+a[2];
    int s1,c=0;
    for(int i=3; i<n; i=i+3)
    { s1=0;
     s1= a[i]+a[i+1]+a[i+2];
     if(s1==sum)
       c=1;
     else
       c=0;
    }
    if(c==1)
      System.out.println("Perfect Batch");
       else
               System.out.println("Not a Perfect Batch");

  }
}