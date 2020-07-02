import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n;
        n= obj.nextInt();
        int a=9,b=11,c;
        for(int i=1;i<=n;i++)
        {
          System.out.print(a+" ");
          c=a+b;
          a=b;
          b=c;
        }
	}
}