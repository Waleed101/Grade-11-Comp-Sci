/**********************************************************
	File: MyChange.java 
	Purpose: Input change in pennies and output number of coins in different amounts.
	Author: Waleed Sawan
	Date: September 19, 2016
   Time: 10:20AM
	Based on: ICS3U Java Assignment 1, Question 3      
**********************************************************/
import java.util.Scanner;

class MyChange
{
   public static void main (String [] args)
   {
      //Define variables
      int change, coins;
      Scanner coin = new Scanner(System.in);
      System.out.print("Enter the number of coins in pennies: ");
      
      //Define number of pennies that the user has
      change = coin.nextInt();
      
      //Calculate the number of toonies
      coins = change/200;
      change = change%200;
      System.out.println("Number of toonies: " + coins);
      
      //Calculate the number of loonies
      coins = change/100;
      change = change%100;
      System.out.println("Number of loonies: " + coins);
      
      //Calculate the number of quarters
      coins = change/25;
      change = change%25;
      System.out.println("Number of quarters: " + coins);
      
      //Calculate the number of dimes
      coins = change/10;
      change = change%10;
      System.out.println("Number of dimes: " + coins);
      
      //Calculate the number of nickels
      coins = change/5;
      change = change%5;
      System.out.println("Number of nickels: " + coins);
      
      //Calculate the number of pennies
      System.out.println("Number of pennies: " + change);
   }
}