import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner v= new Scanner(System.in);
      int n=v.nextInt();
      int a[]= new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=v.nextInt();
      }
      int s1= v.nextInt();
      int s2= v.nextInt();
      int f1=-1,f2=-1;
      for(int i=0;i<n;i++)
      {
        if(a[i]==s1)
          f1=i;
        if(a[i]==s2)
          f2=i;
      }
      System.out.println(f1);
      System.out.println(f2);
        // Type your code here
    }
}