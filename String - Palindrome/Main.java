import java.util.*;
 
class Main
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
 
      if(original.equals(reverse)==true)
        System.out.print("Palindrome");
     else
       System.out.print("Not a Palindrome");
   }
}