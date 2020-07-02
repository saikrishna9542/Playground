import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner v= new Scanner(System.in);
      int n= v.nextInt();
      int a[]= new int[n];
      for(int i=0;i<n;i++)
      { a[i]= v.nextInt();}
      int s= v.nextInt();
      for(int i=0;i<n;i++)
      {
         for(int j=i+1;j<n;j++)
         { 
           if(a[i]+a[j] == s)
             System.out.println(a[i]+","+" "+a[j]);
         }
      }
           
    }
}