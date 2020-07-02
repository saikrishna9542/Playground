import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner v = new Scanner(System.in);
      int n= v.nextInt();
      
      while(n>99)
      {
        n=n/10;
      }
      int sl=n%10;

   System.out.println(sl);
    }
}