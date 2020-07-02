import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj= new Scanner(System.in);
      int a,l,b;
      float r;
      a= obj.nextInt();
       l= obj.nextInt();
       b= obj.nextInt();
       r= obj.nextFloat();
      System.out.println(a*a);
       System.out.println(l*b);
       System.out.printf("%.2f",(3.14*r*r)-0.001);
    }
}