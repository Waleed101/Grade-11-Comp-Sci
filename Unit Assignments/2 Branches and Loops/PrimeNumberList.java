/**********************************************************
	File: PrimeNumberList.java 
	Purpose: A program the lets the user enter any positive number, and shows them all the prime numbers between 2 and their number.
	Author: Waleed Sawan
	Date: October 18, 2016
   Time: 10:00AM
	Based on: ICS3U Java Assignment 2, Question 2, Enrichment Part      
**********************************************************/

import java.util.Scanner;

class PrimeNumberList
{
   public static void main (String [] args)
   {
      //Define variables to hold number of factors and the number that the user entered
      long num, numberOfFactors = 0;
      Scanner sc = new Scanner (System.in);
      
      //Take the user's number
      System.out.println("Welcome to the prime number checker!");
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      
      //Make sure user enters a positive number
      while (num <= 0)
      {
         System.out.print("Please enter a positive number: ");
         num = sc.nextInt();    
      }
      
      //Print out number
      System.out.print("The prime numbers between 2 and " + num + " are: ");
    
      //Check every number between 2 and the number that they entered 
      for(int i = 2; i <= num; i++)
      {
        numberOfFactors = 0; //Reset number of factors
        for(int n = 1; n <= i; n++) //Check every number between 1 and the number that is currently being checked
        {
         if(i%n == 0) //Check if the current number (n) divids well into the other number (i)
         {
           numberOfFactors++; //Add one factor
         }
        }
        if(numberOfFactors == 2) //Print number if factors equal to 2
         System.out.print(i + " ");
      }
   }
}
