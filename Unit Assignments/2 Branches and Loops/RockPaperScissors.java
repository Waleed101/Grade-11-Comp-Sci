/**********************************************************
	File: RockPaperScissors.java 
	Purpose: Complex program that plays rock paper or scissors against the user with a fun twist to it
	Author: Waleed Sawan
	Date: October 23, 2016
    Time: 4:00PM
	Based on: ICS3U Java Assignment 2, Question 5, Enrichment Part      
**********************************************************/

import java.util.Scanner;

class RockPaperScissors
{
   public static void main (String [] args)
   {
      //Define the variables
      boolean continuePlaying = true;
      String userChoice, userChoiceFirst = "null", computerChoice, result = "null"; //Define userChoiceFirst, and result to null so program runs through without saying either variable has no value
      int roundNumber = 1, computerScore=0, userScore=0;
      Scanner numberData = new Scanner (System.in);
      Scanner stringData = new Scanner (System.in);
      //If user still wants to play
      while(continuePlaying)
      {
         //Generate random number for computer's choice
         int computerChoiceRandom = (int)(Math.random() * (3 - 1 + 1)) + 1;
         //If number is 1 then user is Paper, number is 2 then user is rock, number is 3 then user is scissors
         if (computerChoiceRandom == 1)
            computerChoice = "p";
         else if (computerChoiceRandom == 2)
            computerChoice = "r";
         else
            computerChoice = "s";
         //Print round number
         System.out.println("Welcome to Round " + roundNumber + " of Rock, Paper OR Scissors!");
         //After round 1 (so round 2)
         if(roundNumber > 1)
         {
            //Print out score
            System.out.println("The current score is Computer: " + computerScore + ", and You: " + userScore);
            
            //Print out a wierd message depending on who is currently winning
            if(computerScore > userScore)
               System.out.println("HA! I am currently winning, and its going to stay that way.");
            
            else if(computerScore < userScore)
               System.out.println("Your winning, but that won't stay for long");
            
            else
               System.out.println("We are tied, but I am going to win!!!");
            
            //Print out a cool message depending on who won last time   
            if(result.equals("w"))
               System.out.println("You won last time, but its my turn to win ;).");
            
            else if (result.equals("l"))
               System.out.println("I won, and you want revenge? Phh... you won't win.");
            
            else if (result.equals("t"))
               System.out.println("Tie last time, well time to settle this once and for all.");
         }   
         //Take user's choice (Rock, paper or scissors)
         System.out.print("What do you play? Rock (R), Paper (P), or Scissors (S): ");
         userChoice = stringData.nextLine();
         userChoice = userChoice.toLowerCase();
         
         //Make sure user enters r, p, or s, if not don't let them pass
         while (!(userChoice.equals("r") || userChoice.equals("p") || userChoice.equals("s")))
         {
            //Prompt user until they enter a proper choice
            System.out.println("Please enter a proper choice, not " + userChoice);
            System.out.print("What do you play? Rock (R), Paper (P), or Scissors (S): ");
            userChoice = stringData.nextLine();
            userChoice = userChoice.toLowerCase();
         }
         //Quick recommendation to ask user if they want to change their choice if it is the same as the previous turn 
         if((userChoiceFirst.equals("r") && userChoice.equals("r")) || (userChoiceFirst.equals("p") && userChoice.equals("p")) || (userChoiceFirst.equals("s") && userChoice.equals("s")))
         {   
            //Ask user if they want to print out a different choice
            System.out.print("Do you really want to choose that again? How about you pick something new?\nIf you don't want to pick something new, then put y: ");
            userChoice = stringData.nextLine();
            userChoice = userChoice.toLowerCase();
            //They can print out y if they don't want to
            if(userChoice.equals("y"))
            {
               System.out.println("Okay have it your way ;)");
               userChoice = userChoiceFirst;
            }
         }
         userChoiceFirst = userChoice;
         //Depending on the userchoice
         switch(userChoice)
         {
            //User chooses rock
            case "r":
               //Computers choice and the result
               if(computerChoice.equals("r"))
               { 
                  System.out.println("You played rock, computer played rock... It is a tie!");
                  result = "t";
               }   
               else if(computerChoice.equals("s"))
               { 
                  System.out.println("You played rock, computer played scissors... You win!");
                  result = "w";
                  userScore++;
               }   
               else
               {
                  System.out.println("You played rock, computer played paper... You Lose!");
                  result = "l";
                  computerScore++;
               }
               break;
               
            //User chooses paper
            case "p":
               //Computers choice and the result
               if(computerChoice.equals("r"))
               { 
                  System.out.println("You played paper, computer played rock... You Win!");
                  result = "w";
                  userScore++;
               }   
               else if(computerChoice.equals("s"))
               { 
                  System.out.println("You played paper, computer played scissors... You Lose!");
                  result = "l";
                  computerScore++;
               }   
               else
               {
                  System.out.println("You played paper, computer played paper... It is a tie!");
                  result = "t";
               }
               break;
               
            //User chooses scissors
            case "s":
               //Computers choice and the result
               if(computerChoice.equals("r"))
               { 
                  System.out.println("You played scissors, computer played rock... You Lose!");
                  result = "l";
                  computerScore++;
               }   
               else if(computerChoice.equals("s"))
               { 
                  System.out.println("You played scissors, computer played scissors... It is a tie!");
                  result = "t";
               }   
               else
               {
                  System.out.println("You played scissors, computer played paper... You Win!");
                  result = "w";
                  userScore++;
               }
               break;         
       }
       //Ask user if they want to play again
       System.out.print("Would you like to play again? (Y/N) ");
       userChoice = stringData.nextLine();
       userChoice = userChoice.toLowerCase();
       roundNumber++; //Add change the Round Number 
       continuePlaying = true; //Assume user wants to continue
       //Make sure user enters y or n
       while(!(userChoice.equals("y")) && !(userChoice.equals("n")))
       {
         //Ask them to enter another choice
         System.out.print("Please put a proper choice, would you like to play again? ");
         userChoice = stringData.nextLine();
         userChoice = userChoice.toLowerCase();
        }
      //If user says no then end
      if(userChoice.equals("n"))
         continuePlaying = false;

     }
      
    //Final print message   
    System.out.println("Thanks for playing!");    
   }
}