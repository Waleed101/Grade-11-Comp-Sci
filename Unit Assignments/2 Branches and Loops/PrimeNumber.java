/**********************************************************
	File: PrimeNumber.java 
	Purpose: A program the lets the user enter any positive number, and it shows them all the factors of that number, and if the number is prime or not.
	Author: Waleed Sawan
	Date: October 18, 2016
   Time: 9:55AM
	Based on: ICS3U Java Assignment 2, Question 2      
**********************************************************/

import java.util.Scanner;

class PrimeNumber
{
   public static void main (String [] args)
   {
      //Define all the variables
      long num, numberOfFactors = 0;
      Scanner sc = new Scanner (System.in);
      
      //Prompt user to enter the number to be checked
      System.out.println("Welcome to the prime number checker!");
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      
      //Make sure user enters a postive number, wait until its positive
      while (num <= 0)
      {
         System.out.print("Please enter a positive number: ");
         num = sc.nextInt();    
      }
      
      System.out.print("The factors of " + num + " are: ");
      
      //Run through every number between 1 and the number that the user entered
      for(int i = 1; i <= num; i++)
      {
         //Check if when the number that the user entered is divisible by the current number  
         if (num%i == 0)
         {
               numberOfFactors++;
               System.out.print(i + " ");  
         }
      }
      System.out.println();
      //Print the number of factors
      System.out.print("The number " + num + " has " + numberOfFactors + " factors. ");
      if(numberOfFactors == 2)
         System.out.println("It is a prime number"); //Print if factors equals to 2
      
      else
         System.out.println("It is not a prime number");//Print if factors more than 2
   }
}
