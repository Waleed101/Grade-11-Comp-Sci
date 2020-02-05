/**********************************************************
	File: NimGame.java 
	Purpose: Complex Nim Game that wins every time against the user based on some basic rules
	Author: Waleed Sawan
	Date: December 5, 2016
   Time: 9:50AM
	Based on: ICS3U Java Assignment 3, Question 2      
**********************************************************/

// Include the java scanner libraries
import java.util.Scanner;

class NimGame
{
   static int amountOfStones; //Declare static variable of amountOfStones, user's move, and current turn
   static int move;
   static boolean compPlay = false;
   static String userName;
   static void getRandomStones()
   {
     amountOfStones = (((int)(Math.random()*(7 - 4 + 1))) + 4); //Generate a random number between 4 and 7
     amountOfStones = amountOfStones*4+1; // Multiply that number by 4 and add 1 (Possible Numbers: 17, 21, 25, 29)
   } 
   
   static void getUserName()
   {
      Scanner inData = new Scanner(System.in);
      System.out.print("Welcome to Nim, by Waleed Sawan!\nWhat is your name? ");
      userName = inData.nextLine();
      System.out.println("Hey " + userName + ", let's get started!");
   }
   
   static void computerPlay() //Computer play
   {
      int compMove = 0; // Set compMove to zero
      if(amountOfStones > 8) // If amount of stones is greater than 8 complete user's play so computer value plus user play is equal to 4 
         compMove = 4 - move;
      
      else if(amountOfStones <= 8) // If amount of stones is less than or equal to 8
      {
         switch(amountOfStones)
         {
            case 2: // If 2 stones left remove 1 stone
            compMove = 1;
            break;
            
            case 3: // If 3 stones left remove 2 stone
            compMove = 2;
            break;
            
            case 4: // If 4 stones left remove 3 stone
            compMove = 3;
            break;
            
            case 6: // If 6 stones left remove 1 stone
            compMove = 1;
            break;
            
            case 7: // If 7 stones left remove 2 stone
            compMove = 2;
            break;
            
            case 8: // If 8 stones left remove 3 stone
            compMove = 3;
            break;
            
         }
      }
         
      System.out.println("The computer plays " + compMove); //Print computers move to screen
      amountOfStones-=compMove;
      compPlay = false; //Set computers turn to false
   }
   
   static void userPlay()// User play
   {
      Scanner inData = new Scanner(System.in);
      System.out.print("There are " + amountOfStones + ". How many will you take (max 3)? "); //Print number of stones left
      move = inData.nextInt(); // Take users turn as input 
      while (move > 3 || move < 1) // Check to make sure input is in range 
      {
         if(move > 3)
            System.out.print(userName + ", you moved " + move + ", that is more than the max of 3... Enter again: ");
         
         if(move < 1)
            System.out.print(userName + ", you moved " + move + ", that is less than the min of 1... Enter again: ");
            
         move = inData.nextInt();
      } 
      compPlay = true; //Set comPlay to true
      amountOfStones-=move;
   }
   
   public static void main(String [] args)
   {
      getUserName(); // Get user's name
      String continuePlayingString;
      boolean continuePlaying = true;
      Scanner inData = new Scanner(System.in);
      while(continuePlaying)
      {
         getRandomStones(); // Generate "random" stones
         while (amountOfStones != 1) // Make sure amount of stones is not 1
         {
            if(amountOfStones != 1) // Check again to make sure
               userPlay(); // Get user play
            
            if(amountOfStones != 1) // Check again to make sure
               computerPlay(); // Get computer play
         }   
         if(compPlay) // If computer's turn at the time
            System.out.println("Computer Loses, You Win!!!"); // Computer loses
         
         else // Else its user's turn
            System.out.println("Computer Wins, You Lose!!!"); // User loses
         
         System.out.print(userName + ", would you like to play again? (Y/N) "); // Check to see if user wants to play again
         continuePlayingString = inData.nextLine();
         continuePlayingString = continuePlayingString.toUpperCase();
         if(continuePlayingString.equals("Y"))
         {  
            continuePlaying = true;
            System.out.println("Cool! Let's go again...");
         }
         else
            continuePlaying = false; 
        }
     System.out.println("Thanks for Playing!");    
   }
}