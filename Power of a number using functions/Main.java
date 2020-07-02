import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner v= new Scanner(System.in);
      int b= v.nextInt();
      int e= v.nextInt();
      power(b,e);
      
	}
  public static void power(int x, int y)
  {
    int r=1;
    for(int i=1;i<=y;i++)
      r=r*x;
    System.out.println(r);
  }
}