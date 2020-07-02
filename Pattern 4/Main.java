import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner obj= new Scanner(System.in);
      int n = obj.nextInt();
      for(int i=n;i>=1;i--)
      { int k=i;
        for(int j=n;j>=1;j--)
        {
          if(j>=i)
          {
             System.out.print(k);
             k=k+1;
          }
          else
          {
             System.out.print(n);
          }
        }
       System.out.println();
      }
	}
}