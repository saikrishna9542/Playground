import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int index = 0; index <= (n- 1); index++)
        {
            arr[index] = in.nextInt();
        }
      int count=0;
      for(int index = 0; index <= (n- 1); index++)
        {
            if(arr[index]==0)
              count++;
        }
      int b[] =new int[100];
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        { b[j]=arr[i]; j++; }
      }
      for(int i=0;i<count;i++)
      {
        b[j]=0;
        j++;
      }
      for(int i=0;i<j;i++)
        System.out.print(b[i]+" ");
      
    }
}