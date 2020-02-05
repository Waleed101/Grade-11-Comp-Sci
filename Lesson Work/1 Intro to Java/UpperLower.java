import java.util.Scanner;

class UpperLower
{
   public static void main (String [] args)
   {
      String text;
      System.out.println("Please print random text with both upper and lower case:");
      Scanner sc = new Scanner(System.in);
      text = sc.nextLine();
      System.out.println(text.toUpperCase());
      System.out.println(text.toLowerCase());
      
      
   }
}