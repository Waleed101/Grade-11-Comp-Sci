/**********************************************************
	File: FastFood.java 
	Purpose: Input total number of burgers, fries, and drinks
	Author: Waleed Sawan
	Date: September 15, 2016
   Time: 11:10AM
	Based on: ICS3U Java Assignment 1, Question 2
-----------------------------------------------------------------------------------
   Change Log:
   |   Date   |   Time  |           Change            |
   | Sept. 15 | 11:10AM | Created Program             | 
   | Sept. 19 | 9:30AM  | Add price check for cash    |  
   | Sept. 28 | 10:00AM | Fixed Rounding problems     |          
**********************************************************/

import java.util.Scanner;

class FastFood
{
   public static void main (String [] args)
   {
      //Defining all the Variables
      double burgerCost = 1.69, burgerTotal, friesCost = 1.09, friesTotal, drinkCost = 0.99, drinkTotal, totalCost, tax, totalCostTax;
      double cashPaid, cashReturned;
       // Defining the burger cost, fries cost, drink cost, total cost before taxes, tax, and total cost with tax
      int numBurger, numFries, numDrink;      
      Scanner numOfFood = new Scanner (System.in); //Defining the Scanner for the number of food
      Scanner cashTotal = new Scanner (System.in); //Defining the Scanner for the cash payed
      System.out.println("Want to know the prices? Enter 101 and we will give you the price of the fast food item you have chosen!");
      System.out.print("Enter the number of burgers: ");
      numBurger = numOfFood.nextInt(); // Takes the number of burgers the customer wishes to order
      if (numBurger == 101)// Tells the user the price of the burgers when they enter 101
      {
         System.out.println("The Cost of Burgers is " + burgerCost + " plus tax");
         System.out.print("Enter the number of burgers: ");
         numBurger = numOfFood.nextInt();
      }
      if (numBurger < 0)
      {
         System.out.print("Please enter a postive amount: ");
         numBurger = numOfFood.nextInt();
         if (numBurger < 0)
         {
            System.out.println("Program Ended!");
            System.exit(0);
         }
         
      }

      System.out.print("Enter the number of fries: ");
      numFries = numOfFood.nextInt(); // Takes the number of fries the customer wishes to order
      if (numFries == 101)// Tells the user the price of the fries when they enter 101
      {
         System.out.println("The Cost of Fries is " + friesCost + " plus tax");
         System.out.print("Enter the number of fries: ");
         numFries = numOfFood.nextInt();
      }
      if (numFries < 0)
      {
         System.out.print("Please enter a postive amount: ");
         numFries = numOfFood.nextInt();
         if (numFries < 0)
         {
            System.out.println("Program Ended!");
            System.exit(0);
         }
         
      }

      System.out.print("Enter the number of drinks: ");
      numDrink = numOfFood.nextInt(); // Takes the number of drinks the customer wishes to order
      if (numDrink == 101)// Tells the user the price of the drinks when they enter 101
      {
         System.out.println("The Cost of Drinks are " + drinkCost + " plus tax");
         System.out.print("Enter the number of drinks: ");
         numDrink = numOfFood.nextInt();
      }
      if (numDrink < 0)
      {
         System.out.print("Please enter a postive amount: ");
         numDrink = numOfFood.nextInt();
         if (numDrink < 0)
         {
            System.out.println("Program Ended!");
            System.exit(0);
         }
         
      }
      burgerTotal = numBurger * burgerCost; // Calculating the cost of burgers 
      friesTotal = numFries * friesCost; // Calculating the cost of fries  
      drinkTotal = numDrink * drinkCost; // Calculating the cost of drinks
      totalCost = drinkTotal + burgerTotal + friesTotal;
      totalCost = Math.round(totalCost*100)/100.0;
      tax = totalCost * 0.13;
      tax = Math.round(tax * 100)/100.0;
      totalCostTax = totalCost + tax;
      System.out.println("The cost of your order before tax is: " + totalCost);// Tell the user the cost before tax
      System.out.println("The tax is: " + tax);// Tell the user tax on the purchase
      System.out.println("The total cost is: " + totalCostTax);// Tell the user the cost after tax
      
      System.out.print("Please enter the amount in cash in which you have paid: ");
      cashPaid = cashTotal.nextDouble(); // Takes the the amount that the user has paid
      
      //Calculate how much cash must be returned
      cashReturned = cashPaid - totalCostTax;
      cashReturned = Math.round(cashReturned * 100)/100.0;
      
      if (cashReturned < 0)
      {
         System.out.println("You have not paid enough. Please pay the remainding $" + cashReturned * -1);
         System.out.print("Please enter the amount you have paid in addition to the previous amount: ");
         cashPaid = cashTotal.nextDouble(); // Takes the the amount that the user has paid in addition
         cashReturned = cashReturned + cashPaid;
         if (cashReturned < 0)
         {
            System.out.println("Order canceled!"); //Order canceled if user doesn't pay enough after two times
            System.exit(0);
         }
      }
      if (cashReturned > 0 &&  cashReturned != 0)
      {
         System.out.println("We have returned " + cashReturned + " to you!"); // Tell the user if change is greater than 0 how much as been returned
      }
      
      System.out.println("Thank you for your order! Have a great day ;)"); // Goodbye note
   }
}

