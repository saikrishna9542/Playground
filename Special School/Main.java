import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        String s1= obj.next();
        String s2= obj.next();
        int len1= s1.length();
        int len2= s2.length();
        int flag=1;
      if(len1!=len2)
        System.out.print("It is not same");
       else
       {
         for(int i=0;i<len2;i++)
         { flag=0;
           for(int j=0;j<len1;j++)
           {
              if(s1.charAt(i) == s2.charAt(j))
                flag=1;
           }
          if(flag==0)
            break;
         }
       }
       if(flag==1)
             System.out.print("It is same"); 
      else
             System.out.print("It is not same");
        
	}
}