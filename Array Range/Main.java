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
     System.out.print("The range of the array is "+(a[n-1]-a[0]) );
    
   }
 }