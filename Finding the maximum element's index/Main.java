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
   int max=a[0],j=0;
    for(int i=1;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        j=i;
      }
    }
    System.out.println(j);
  }
}