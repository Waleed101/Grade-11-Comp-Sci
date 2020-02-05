import java.util.Scanner;

class Pattern
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      while(num <= 0)
      {
         System.out.print("Enter a positive number: ");
         num = sc.nextInt();  
      }
      for (int i = 0; i <= num-1; i++)
      {
         System.out.print("XO");
      }
      System.out.print("X");
   }
}