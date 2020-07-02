import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner v= new Scanner(System.in);
      int n= v.nextInt();
     
      int s= square(n);
      System.out.print(s);

	} 
  public static int square(int n)
  {
      int sq= n*n;
    return sq;
  }
}