import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
      int a=1,b=n*n+1;
      for(int i=n;i>=1;i--)
      {
        for(int s=1;s<=(n-i);s++)
          System.out.print(" ");
        for(int j=1;j<=i;j++)
        {
             System.out.print(a+"*");
             a=a+1;
        }
        for(int j=1;j<=i;j++)
        {     if(j<i)
              {
               System.out.print(b+"*");
               b=b+1;
             }
              else
                 System.out.print(b);
        }
        b=b-2*(i-1);
        System.out.println();
      }
	}
}