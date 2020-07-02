
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Main 
{ 

static void SumOfEven(int arr[],int i, int sum) 
{ 
 
    if (i < 0)  
    { 
        System.out.print("Sum of even numbers "+sum); 
        return; 
    } 
  
    if ((arr[i]) % 2 == 0) 
    { 
  
        // Add it to the sum 
        sum += (arr[i]); 
    } 
  
    SumOfEven(arr, i - 1, sum); 
} 
  

public static void main (String[] args)  
{ 
    Scanner obj= new Scanner(System.in);
    int n =obj.nextInt();
    int arr[]= new int[n];
    int sum = 0; 
    for(int i=0;i<n;i++)
    {
      arr[i]= obj.nextInt();
     }
  
    SumOfEven(arr, n - 1, sum); 
  } 
} 