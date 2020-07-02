import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int r= obj.nextInt();
        int c= obj.nextInt(); 
        int a[][]= new int[r][c];
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
            a[i][j]= obj.nextInt();
          }
        }
        int max;
        int out[]= new int[r];
      for(int i=0;i<r;i++)
        {  max=0;
          for(int j=0;j<c;j++)
          { 
            if(a[i][j]> max)
              max=a[i][j];
          }
          out[i]=max;
      }
      for(int i=0;i<r;i++)
      System.out.println(out[i]);
	}
}
