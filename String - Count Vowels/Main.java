import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        String str= obj.next();
        int len= str.length();
      int count=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
               || str.charAt(i) == 'o' || str.charAt(i) == 'u')    
            count++;
        }
      System.out.print(count);
	}
}