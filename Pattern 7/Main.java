import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(j%2==0)
            System.out.print("0 ");
          else
            System.out.print("1 ");
        }
        System.out.println();
      }
	}
}