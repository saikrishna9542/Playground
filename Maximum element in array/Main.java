import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
      int  n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }	
			
		System.out.println("Maximum element in the array is " + findLargest(a, a.length-1));
	}
	
	public static int findLargest(int a[], int index) {
	    if (index > 0) {
	        return Math.max(a[index], findLargest(a, index-1));
	    } else {
	        return a[0];
	    }
	}
}