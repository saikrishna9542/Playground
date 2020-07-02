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
      int flag,count=0;
      for(int i=0;i<n;i++)
      { flag=1;
          for(int j=i+1;j<n;j++)
          {
            if(a[i]==a[j])
              flag=0;
          }
       if(flag==1)
         count++;
      }
      System.out.print(count);
    }
}