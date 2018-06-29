import java.util.Scanner;
class Wrapper
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter two string");
      String a=s.next();
      String b=s.next();
      int i=Integer.parseInt(a);
      int j=Integer.parseInt(b);
      System.out.println("value of first number is:"+i);
      System.out.println("value of second number is:"+j);
      if(i>j)
       {
          System.out.println("Maximum number is:"+i);
       }
       else
       {
          System.out.println("Maximum number is:"+j);
       }
    }
}