import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
      Scanner v= new Scanner(System.in);
      int n1= v.nextInt();
      int n2= v.nextInt();
      int n3= v.nextInt();
      int res= gcdp(n1,n2);
      int gcd= gcdp(res,n3);
      System.out.println(gcd);
	}
  public static int gcdp(int a, int b)
  {
    if(a>b)
      return a;
    else
      return b;
   }
 }
