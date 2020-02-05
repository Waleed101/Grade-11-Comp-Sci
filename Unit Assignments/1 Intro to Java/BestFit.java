/**********************************************************
	File: BestFit.java 
	Purpose: .
	Author: Waleed Sawan
	Date: September 22, 2016
   Time: 10:00AM
	Based on: ICS3U Java Assignment 1, Question 4
**********************************************************/

import java.util.Scanner;

class BestFit
{
   public static void main (String [] args)
   {
      //Defining all the Variables
      double oneY, twoY, threeY, fourY, fiveY, avgY; 
      double oneX, twoX, threeX, fourX, fiveX, avgX;
      double num, den; 
      Scanner points = new Scanner(System.in);    
     
      //Taking the X values for each point
      System.out.println("Enter five x values, each followed by enter: ");
      oneX = points.nextDouble();
      twoX = points.nextDouble();
      threeX = points.nextDouble();
      fourX = points.nextDouble();
      fiveX = points.nextDouble(); 
     
      //Taking the Y values for each point
      System.out.println("Great! Now enter five y values, each followed by enter: ");
      oneY = points.nextDouble();
      twoY = points.nextDouble();
      threeY = points.nextDouble();
      fourY = points.nextDouble();
      fiveY = points.nextDouble();
     
      //Calculating the average for each set of numbers
      avgX = (oneX + twoX + threeX + fourX + fiveX) / 5;
      avgY = (oneY + twoY + threeY + fourY + fiveY) / 5;
     
      //Calculating the numerator and denominator for the X intercept
      num = ((oneX - avgX)*(oneY - avgY)+(twoX - avgX)*(twoY - avgY)+(threeX - avgX)*(threeY - avgY)+(fourX - avgX)*(fourY - avgY)+(fiveX - avgX)*(fiveY - avgY));
      den = Math.pow(oneX - avgX, 2) + Math.pow(twoX - avgX, 2) + Math.pow(threeX - avgX, 2) + Math.pow(fourX - avgX, 2)+ Math.pow(fiveX - avgX, 2);
      
      //Printing the value of A, and values of B
      System.out.println("A = " + num/den);
      System.out.println("B = " + (avgY - num/den * avgX));      
   }
}

