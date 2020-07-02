import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner obj= new Scanner(System.in);
      int n = obj.nextInt();
      int k=1;
      for(int i=1;i<=n;i++)
      { 
        for(int j=1;j<=i;j++)
        {
          System.out.print(k+" ");
          k++;
        }
           System.out.println();
      }
	}
}