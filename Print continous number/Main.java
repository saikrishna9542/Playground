import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        int m= obj.nextInt();
        for(int i=n;i<=m;i++)
        {
          System.out.println(i);
        }
    }
}