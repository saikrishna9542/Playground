import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner v= new Scanner(System.in);
      int n=v.nextInt();
      int copy=n;
      int fact,sum=0,rem;
      while(n>0)
      { fact=1;
        rem=n%10;
        for(int i=1;i<=rem;i++)
          fact=fact*i;
        sum=sum+fact;
       n=n/10;
      }
      if(copy==sum)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}