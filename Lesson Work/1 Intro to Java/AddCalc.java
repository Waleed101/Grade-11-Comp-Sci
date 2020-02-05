//Question 10: Write a program that prompts the user to enter three integers, and outputs their product.
import java.util.Scanner;

class AddCalc
{
   public static void main (String [] args)
   {
      System.out.println("Please print three numbers. Press Enter after each number:");
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int sum = num1 + num2 + num3;
      System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum );
      
   }
}