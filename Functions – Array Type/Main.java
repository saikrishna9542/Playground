import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner obj= new Scanner(System.in);
    int n = obj.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]= obj.nextInt();
    }
    Main obj2= new Main();
    obj2.sai(a,n);
  }
  void sai(int a[], int n)
  { 
    int ec=0,oc=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
        ec++;
      else
        oc++;
    }
    if(ec==n)
      System.out.print("The array is Even");
    else if(oc==n)
         System.out.print("The array is Odd");
    else
         System.out.print("The array is Mixed");
 }
  
}