import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner v= new Scanner(System.in);
      int n= v.nextInt();
     int s= sum(n);
                
    System.out.print(s);
   }
  public static int sum(int n)
  {
    int s1=0;
    for(int i=1;i<=n;i++)
      s1=s1+i;
    return s1;
  }
}