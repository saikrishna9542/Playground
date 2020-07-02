import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
    Scanner obj= new Scanner(System.in);
     int n = obj.nextInt();
     int a[]= new int[n];
     for(int i=0;i<n;i++)
     {
       a[i]= obj.nextInt();
     }
     Arrays.sort(a);
     float med;
    if(n%2!=0)
    {
      med= a[n/2];
      System.out.printf("The median of the array is %.2f",med);
    }
     else
     {
       med=(a[n/2]+ a[n/2-1])/2;
         System.out.printf("The median of the array is %.2f",med);
     }
       
   }
 }