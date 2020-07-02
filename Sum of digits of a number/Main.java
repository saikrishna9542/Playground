import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner v= new Scanner(System.in);
      int n= v.nextInt();
      int sum=0,rem;
      if(n==0)
        System.out.println(n);
      else
      {
                 while(n>0)
                 {
                   rem=n%10;
                   sum=sum+rem;
                   n=n/10;
                 }
             System.out.println(sum);
      }
	}
}