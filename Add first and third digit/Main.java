import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner v=new Scanner(System.in);
      int n= v.nextInt();
      int f= (n/100);
      int t= (n%10);
      int sum= f+t;
      System.out.println(sum);
	}
}