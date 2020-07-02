import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
          a[i]= obj.nextInt();
        }
      int s= obj.nextInt();
      int flag=0;
      for(int i=0;i<n;i++)
        {
          if(s==a[i])
            flag=1;
        }
      if(flag==1)
        System.out.print(s+" is present in the array");
      else
            System.out.print(s+" is not present in the array");
    }
}