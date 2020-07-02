import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner v= new Scanner(System.in);
      int n= v.nextInt();
     
                        for(int i=1;i<=n;i++)
                        {
                          for(int s=1;s<=(n-i);s++)
                            System.out.print(" ");
                               for(int j=1;j<=(2*i)-1;j++)
                               { 
                                   System.out.print("*");
                                }
                              System.out.print("\n");
                        }

	}
}