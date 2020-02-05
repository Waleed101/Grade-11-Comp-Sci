//Question 32: Make a program that asks the user for three integer numbers, one at a time.  After each number is inputted, the program should output the running total of the numbers entered so far.
import java.util.Scanner;
class AskNums
{
   public static void main (String [] args)
   {
      int sum, num;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      sum = sc.nextInt();
      System.out.println("The total so far is " + sum + ".");
      System.out.print("Enter a another Number: ");
      num = sc.nextInt();
      sum = sum + num;
      System.out.println("The total so far is " + sum + ".");
      System.out.print("Enter a another Number: ");
      num = sc.nextInt();
      sum = sum + num;
      System.out.println("The final total is " + sum + ".");
   }
}