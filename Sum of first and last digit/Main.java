import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner v = new Scanner(System.in);
      int n= v.nextInt();
      int ld=n%10;
      while(n>9)
      {
        n=n/10;
      }
      
 int sum= ld+n;
   System.out.println(sum);
    }
}