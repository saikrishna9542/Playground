import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=(2*i)-1;j++)
        {
          System.out.print(j+" ");
        }
        System.out.println();
      }
	}
}