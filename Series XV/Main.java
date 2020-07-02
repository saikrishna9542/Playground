import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n;
      n = obj.nextInt();
      int a=3,b=8,x=2;
      for(int i=1;i<=n;i++)
      {
        System.out.print(a+" ");
        int c=a+b+x;
        a=b;
        b=c;
        x=x+1;
      }
	}
}