import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner v= new Scanner(System.in);
      int n=v.nextInt();
      int copy=n;
      int count=0;
      int res,rem,sum=0;
      while(n>0)
      {
        n=n/10;
        count++;
      }
      int c=copy;
      while(copy>0)
      {
        res=1;
        rem=copy%10;
        for(int i=1;i<=count;i++)
          res=res*rem;
        sum=sum+res;
        copy=copy/10;
      }
        if(sum==c)
          System.out.println("Armstrong Number");
        else
           System.out.println("Not a Armstrong Number");
      
	}
}