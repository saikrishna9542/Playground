import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i==j || i+j==(n+1))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
	}
}