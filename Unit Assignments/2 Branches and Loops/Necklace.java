/**********************************************************
	File: Necklace.java 
	Purpose: .
	Author: Waleed Sawan
	Date: October 18, 2016
   Time: 10:15AM
	Based on: ICS3U Java Assignment 2, Question 3      
**********************************************************/

import java.util.Scanner;

class Necklace
{
   public static void main (String [] args)
   {
      //Defining the variables to hold the numbers
      int num1, num2, res, origNum2, origNum1;
      Scanner sc = new Scanner(System.in);
      
      //Prompting the user to enter two numbers
      System.out.println("Welcome to the Necklace problem!");
      System.out.println("Enter two single digit positive numbers, each followed by enter: ");
      
      //Taking values of numbers
      origNum1 = sc.nextInt();
      origNum2 = sc.nextInt();
      
      //Make sure number 1 is greater than 0, and less than 10
      while (origNum1 < 0 || origNum1 >= 10)
      {
         //If not ask for another number
         System.out.print("Enter a different number other than " + origNum1 + " for number 1 : ");
         origNum1 = sc.nextInt();
      }
      
      //Make sure number 2 is greater than 0, and less than 10
      while (origNum2 < 0 || origNum2 >= 10)
      {
         //If not ask for another number
         System.out.print("Enter a different number other than " + origNum2 + " for number 2 : ");
         origNum2 = sc.nextInt();
      }
      
      //Print the first two numbers in the necklace
      System.out.print(origNum1 + ", " + origNum2 + ", ");
      
      //Change the values of the current numbers, so the while loop runs through properly
      num2 = (origNum1 + origNum2)%10;
      num1 = origNum2;
      
      //Print out only the second number
      System.out.print(num2);

      //While number 1 is not equal to the original number 1, and number 2 is not equal to the original number 2
      while (num1 != origNum1 || num2 != origNum2)
      {
         //Print a comma to seperate each number
         System.out.print(", ");
         
         //Calculate the next number to be printed, and print it out
         res = (num1 + num2)%10;
         num1 = num2;
         num2 = res;
         System.out.print(num2);
      }
      
   }
}
