import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner v= new Scanner(System.in);
      int n= v.nextInt();
      int count=1;
                        for(int i=1;i<=n;i++)
                        {
                               for(int j=1;j<=i;j++)
                               { if(count%2==0)
                                   System.out.print("#");
                                    else
                                   System.out.print("*");
                                count++;
                               }
                              System.out.print("\n");
                        }

  		// Type your code here
    }
}