import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        int k=1;
        for(int i=n;i>=1;i--)
        { 
          for(int j=k;j<=(2*n)-1;j=j+2)
          {
            System.out.print(j+" ");
          }
          System.out.println();
          k=k+2;
        }
	}
}