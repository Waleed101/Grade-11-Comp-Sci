import java.util.Scanner;

class GuessingGame
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int randnum = 42, guess, tries = 1;
      System.out.print("Guess a number from 1 to 100: ");
      guess = sc.nextInt();
      while (guess != randnum)
      {
         System.out.print("Sorry, try again: ");
         guess = sc.nextInt();
         tries++;
      }
      System.out.println("You got in " + tries + " tries!");
      
   }
}