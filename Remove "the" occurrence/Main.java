import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner obj = new Scanner(System.in);
		String st= obj.nextLine();
        System.out.print(st.replace("the ",""));
	}
}