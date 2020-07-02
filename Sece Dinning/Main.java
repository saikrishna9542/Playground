import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int a=s.nextInt();
      if(str.equals("front"))
      {
        if(a==1)
        {
          System.out.println("Left Handed");
        }else
        {
          System.out.println("Right Handed");
        }
      }else if(str.equals("rear"))
      {
        if(a==1)
        {
           System.out.println("Right Handed");
        }else
        {
           System.out.println("Left Handed");
        }
      }
	}
}