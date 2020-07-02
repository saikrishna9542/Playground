import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner v=new Scanner(System.in);
      int n1=v.nextInt();
           int n2=v.nextInt();
            int n3=v.nextInt();
        if(n1>n2 && n1>n3)
          System.out.println(n1);
      else if(n2>n1 && n2>n3)
                  System.out.println(n2);
      else
                  System.out.println(n3);


   
      
    }
}