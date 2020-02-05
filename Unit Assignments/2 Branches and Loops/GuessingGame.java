/**********************************************************
	File: GuessingGame.java 
	Purpose: Simple guessing game that gives the user the option to choose between Easy (1 - 10), Medium (1 - 100), and Hard (1 - 1000).
	Author: Waleed Sawan
	Date: October 17, 2016
   Time: 10:20AM
	Based on: ICS3U Java Assignment 2, Question 1      
**********************************************************/

import java.util.Scanner;

class GuessingGame
{
   public static void main (String[] args)
   {
      //Define all variables
      int answer=1001, guess=0, numOfGuess=0, max = 10;
      String level, response = "try";
       
      //Create scanner for integer (guess), and string (level)
      Scanner scInt = new Scanner (System.in);
      Scanner scString = new Scanner (System.in);
      
      //Prompt the user with the intro
      System.out.println("Welcome to the Guessing Game! A game where a guess a random number, guess it right and.... nothing happens ;)!\nEasy (E)\t\tGuess from 1 - 10\nMedium (M)\t\tGuess from 1 - 100\nHard (H)\t\tGuess from 1 - 1000");
      System.out.print("Choose your difficulty: ");
      
      //Take level of string
      level = scString.nextLine();
      
      //Convert to upper case
      level = level.toUpperCase();
      
      while(!(level.equals("E")) && !(level.equals("M")) && !(level.equals("H")))
      {
         System.out.print("Please enter a proper level, not " + level + ": ");
         level = scString.nextLine();
         level = level.toUpperCase();
      }
      switch(level)
      {
         // Start Level 1 (Easy)
         case "E":
            System.out.print("You choose Easy, enter a number from 1 to 10: ");
            break;
         // End Level 1 (Easy)
         // Start Level 2 (Medium)
         case "M":
            System.out.print("You choose Medium, enter a number from 1 to 100: ");
            max = 100;
            break;
         // Start Level 1 (Medium)
         //If number of guesses is not equal to 1 change response to "tries" instead of "try"
         case "H":
            System.out.print("You choose Hard, enter a number from 1 to 1000: ");
            max = 1000;
            break;
      }
      answer = (int)((Math.random()*max)+1);
      while(guess != answer)
      {
         guess = scInt.nextInt();
         if(guess > max || guess < 0) // Check if guess is greater than 1000 or less than 1 
            System.out.println("Please choose a number in the range of 1 - " + max);
         else if(guess > answer) // Else Check if guess is greater than number
            System.out.println("The answer is lower");
         else // Else guess is less than number
            System.out.println("The answer is higher");
            // Prompt the user to enter a correct answer 
         System.out.print("Your guess was incorrect, try again: ");
               //Add to number of guesses
         numOfGuess++;
      }
   
      if (numOfGuess != 1)
         response = "tries";
     //Responsed to the user and tell them what the answer was, and how many tries it took them         
      System.out.println("Great job, the answer was " + answer + ", you got it in " + numOfGuess + " " + response);
           
   }
}
