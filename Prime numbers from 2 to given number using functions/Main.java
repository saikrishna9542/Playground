import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner v= new Scanner(System.in);
      int n= v.nextInt();
      p(n);
	}
  public static void p(int n)
  {
    int count;
    for(int i=2;i<=n;i++)
     { count=0;
      for(int j=1;j<=i;j++)
       {
         if(i%j==0)
           count++;
       }
      if(count==2)
        System.out.println(i);
    }
 }
}