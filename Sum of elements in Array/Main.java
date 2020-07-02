import java.util.Scanner;
class Main
{
  int sum=0,j=0;
    public static void main(String args[])
    {
      int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Main obj = new Main();
        int x = obj.add(a, a.length, 0);
        System.out.printf("The sum of the elements in the array is %d",x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }  
      //fill your code;
    }
}