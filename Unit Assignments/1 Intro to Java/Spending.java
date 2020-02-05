/**********************************************************
	File: Spending.java 
	Purpose: Input spending categories and amounts, then 	output a spending percentage breakdown.
	Author: Waleed Sawan
	Date: September 15, 2016
   Time: 10:00AM
	Based on: ICS3U Java Assignment 1, Question 1
-----------------------------------------------------------------------------------
   Change Log:
   |   Date   |   Time  |           Change            |
   | Sept. 15 | 10:00AM | Created Program             |
   | Sept. 15 | 10:25AM | Removed all test modules    |
   | Sept. 15 | 10:30AM | Added Comments              |
   | Sept. 15 | 10:40AM | Removed spaces from strings |            
**********************************************************/

import java.util.Scanner;

class Spending
{
   public static void main (String [] args)
   {
      //Defining all the Variables
      String fCategory, sCategory, tCategory; //Defining the variables to hold the names of the categories
      double fCost, sCost, tCost; //Defining the variables to hold the cost of the categories
      double totalCost; //Defining total cost as a double to prevent recieving 0 when dividing
      double fPercent, sPercent, tPercent, totalPercent; //Defining the variables to hold the percentages
      Scanner categoriesName = new Scanner (System.in); //Defining the Scanner for the categories name
      Scanner categoriesCost = new Scanner (System.in); //Defining the Scanner for the categories cost
      
      //Asking the User for their input
      System.out.print("Enter the first spending category: "); //Asking the user for the first category
      fCategory = categoriesName.nextLine();
      fCategory = fCategory.replaceAll("\\s+",""); //Remove space from the first category
      System.out.print("Enter the amount spent on " + fCategory +  ": "); //Asking the user for the amount spent on the first category
      fCost = categoriesCost.nextInt();
      
      System.out.print("Enter the second spending category: "); //Asking the user for the second category
      sCategory = categoriesName.nextLine();
      sCategory = sCategory.replaceAll("\\s+",""); //Remove space from the second category
      System.out.print("Enter the amount spent on " + sCategory +  ": "); //Asking the user for the amount spent on the second category
      sCost = categoriesCost.nextInt();
      
      System.out.print("Enter the third spending category: "); //Asking the user for the third category
      tCategory = categoriesName.nextLine();
      tCategory = tCategory.replaceAll("\\s+",""); //Remove space from the third category
      System.out.print("Enter the amount spent on " + tCategory +  ": "); //Asking the user for the amount spent on the third category
      tCost = categoriesCost.nextInt();
      
                  
      //Calculate the percentage
      totalCost = fCost + sCost + tCost; //Add all the spending categories together
      fPercent = fCost / totalCost * 100; //Calculate the percentage for the first category
      sPercent = sCost / totalCost * 100; //Calculate the percentage for the second category
      tPercent = tCost / totalCost * 100; //Calculate the percentage for the third category
      
      totalPercent = (int)fPercent + (int)sPercent + (int)tPercent; //Add all the percentages
      
      if (totalPercent != 100) //Check if percentages add up to 100
      {
         fPercent = fPercent + 100 - totalPercent; //If they don't, add the remaining percentage to the first Category
      }
      
      //Print out the final result  
      System.out.println(); //A line to make the final output look nicer
      System.out.println("Your spending habits breakdown is: "); 
      System.out.println(fCategory.toUpperCase() + ": " + (int)fPercent); //Printing the name, and percentage of the first category
      System.out.println(sCategory.toUpperCase() + ": " + (int)sPercent); //Printing the name, and percentage of the second category
      System.out.println(tCategory.toUpperCase() + ": " + (int)tPercent); //Printing the name, and percentage of the third category
      
      
   }
}

