import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        String name1 = obj.next();
         String name2 = obj.next();
       if(name1.equals(name2)== true)
         System.out.print("Strings are same");
      else
         System.out.print("Strings are not same");
	}
}