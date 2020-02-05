import java.util.Scanner;

class TriviaFun
{
   public static void main (String [] args)
   {
      Scanner triviaResponse = new Scanner(System.in);
      System.out.println("Welcome to Trivia FUN!!!");
      System.out.println("Your first question is: What year was the programmer of this amazing trivia game born?");
      if (triviaResponse.nextLine().equals("2001"))
      {
         System.out.println("Correct!");
         System.out.println("Your second question is: What year did the programmer start programming with code?");
         if (triviaResponse.nextLine().equals("2008"))
            System.out.println("Correct!");
         else
            System.out.println("Incorrect!");
       }     
      else        
         System.out.println("Incorrect!");
      
      System.out.println("Game over");
   }
}