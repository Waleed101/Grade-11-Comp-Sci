import java.util.Scanner;

class CheckAge
{
   public static void main (String [] args)
   {
      Scanner data = new Scanner(System.in);
      int age;
      System.out.print("Enter your age: ");
      age = data.nextInt();
      
      while (age < 0 || age > 120)
      {
         System.out.print("Please try again: ");
         age = data.nextInt();
      }
      
      System.out.println("Great!"); 
   }
}