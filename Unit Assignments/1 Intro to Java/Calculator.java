/**********************************************************
	File: Calculator.java 
	Purpose: A simple calculator that can do one or four operation equations.
	Author: Waleed Sawan
	Date: September 23, 2016
   Time: 11:10AM
	Based on: ICS3U Java Assignment 1, Question 5, Enrichment Work
-----------------------------------------------------------------------------------
   Change Log:
   |   Date   |   Time  |                Change                 |
   | Sept. 23 | 11:10AM | Created Program                       |
   | Sept. 24 | 11:00AM | Created Basic Mode                    |
   | Sept. 25 | 10:30AM | Added Advanced Mode                   |
   | Sept. 25 | 11:00AM | Add 4 operation equations to Advanced |  
   | Sept. 27 | 9:55AM  | Removed useless variables in Basic    |          
**********************************************************/

import java.util.Scanner; //Importing Scanner Library

class Calculator
{
   public static void main (String [] args)
   {
      //Defining Variables for Advanced Mode, and Basic Mode
      String level;
      Scanner lvlScanner = new Scanner(System.in);
      double num1=0, num2=0, num3=0, num4=0, num5=0, result=0, number;
      String oper1="", oper2="", oper3="", oper4="";
      System.out.println("Welcome to Waleed's Calculator! Would you like Basic or Advanced"); //Ask the user for the Basic or Advanced mode
      level = lvlScanner.nextLine();
      level = level.toUpperCase();
      if (level.equals("BASIC")) //See if user entered Basic
      {
         //Defining Variables for Basic Mode
         Scanner numVal = new Scanner(System.in);
         Scanner signVal = new Scanner(System.in);
         System.out.println("Welcome to Waleed's Calculator! Please enter the first number, the operation, and the second number:"); //Ask the user for two numbers, and one operation
         num1 = numVal.nextDouble(); //Take the first number 
         oper1 = signVal.nextLine(); //Take the first operation
         num2 = numVal.nextDouble(); //Take the second number
   
         System.out.print("Great! I am Calculating.");
   
         switch (oper1)//See which sign the user entered
         {
            case "*": //Multiplication
            result = num1 * num2;
            System.out.print(".");
            break;
         
            case "+": //Addition
            result = num1 + num2;
            System.out.print(".");
            break;
         
            case "-": //Subtraction
            result = num1 - num2;
            System.out.print(".");
            break;
      
            case "/": //Division
            result = num1/num2;
            System.out.print(".");
            break;
         }
       System.out.println(".");
       System.out.println("The result of " + num1 + " " + oper1 + " " + num2 + " is " + result); //Tell the user what the result is
       System.out.println("Thank you for using Waleed's Calculator");


      } 
      
      if (level.equals("ADVANCED")) //See if User entered Advanced
      {
         //Defining variables for Advanced Mode
         Scanner numVal = new Scanner(System.in);
         Scanner operationVal = new Scanner(System.in);
         System.out.println("Welcome to Waleed's Advanced Calculator! Please enter 5 numbers each followed by the operation"); //Ask the user for five numbers, and four operations         
         num1 = numVal.nextDouble(); //First Number
         oper1 = operationVal.nextLine(); //First Operation
         num2 = numVal.nextDouble(); //Second Number
         oper2 = operationVal.nextLine(); //Second Operation
         num3 = numVal.nextDouble(); //Third Number
         oper3 = operationVal.nextLine(); //Third Operation
         num4 = numVal.nextDouble(); //Fourth Number
         oper4 = operationVal.nextLine(); //Fourth Operation
         num5 = numVal.nextDouble(); //Fifth Number
         if (oper1.equals("+"))//Addition for first operation
           {
            if (oper2.equals("+"))//Addition for second operation
            {
             if (oper3.equals("+"))//Addition for third operation
             
               {
                  if (oper4.equals("+"))//Addition for fourth operation
                     result = num1 + num2 + num3 + num4 + num5;
                  
                  if (oper4.equals("-"))//Subtraction for fourth operation
                     result = num1 + num2 + num3 + num4 - num5;

                  if (oper4.equals("*"))//Multiplication for fourth operation
                     result = num1 + num2 + num3 + num4 * num5;
                  
                  if (oper4.equals("/"))//Division for fourth operation
                     result = num1 + num2 + num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 + num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 + num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 + num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 + num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 + num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 + num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 + num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 + num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 + num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 + num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 + num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 + num3 / num4 / num5;
               }



            }//End Addition for Operation 2
            if (oper2.equals("-"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 - num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 - num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 - num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 - num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 - num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 - num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 - num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 - num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 - num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 - num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 - num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 - num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 - num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 - num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 - num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 - num3 / num4 / num5;
               }



            }//End if oper 2 = - 
            if (oper2.equals("*"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 * num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 * num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 * num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 * num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 * num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 * num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 * num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 * num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 * num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 * num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 * num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 * num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 * num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 * num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 * num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 * num3 / num4 / num5;
               }

            }//End if oper 2 = *
            if (oper2.equals("/"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 / num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 / num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 / num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 / num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 / num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 / num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 / num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 / num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 / num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 / num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 / num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 / num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 + num2 / num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 + num2 / num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 + num2 / num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 + num2 / num3 / num4 / num5;
               }

            }//End if oper 2 = *
            
                     
            
           }//End if oper 1 = +
            
           
     if (oper1.equals("-"))
	   {
            if (oper2.equals("+"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 + num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 + num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 + num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 + num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 + num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 + num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 + num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 + num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 + num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 + num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 + num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 + num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 + num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 + num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 + num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 + num3 / num4 / num5;
               }



            }//End if oper 2 = +
            if (oper2.equals("-"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 - num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 - num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 - num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 - num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 - num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 - num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 - num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 - num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 - num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 - num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 - num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 - num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 - num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 - num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 - num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 - num3 / num4 / num5;
               }



            }//End if oper 2 = - 
            if (oper2.equals("*"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 * num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 * num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 * num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 * num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 * num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 * num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 * num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 * num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 * num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 * num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 * num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 * num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 * num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 * num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 * num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 * num3 / num4 / num5;
               }

            }//End if oper 2 = *
            if (oper2.equals("/"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 / num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 / num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 / num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 / num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 / num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 / num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 / num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 / num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 / num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 / num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 / num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 / num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 - num2 / num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 - num2 / num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 - num2 / num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 - num2 / num3 / num4 / num5;
               }

            }//End if oper 2 = *
            
                     
            
           }//End if oper 1 = -
            
             	if (oper1.equals("*"))
	      {
            if (oper2.equals("+"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 + num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 + num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 + num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 + num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 + num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 + num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 + num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 + num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 + num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 + num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 + num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 + num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 + num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 + num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 + num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 + num3 / num4 / num5;
               }



            }//End if oper 2 = +
            if (oper2.equals("-"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 - num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 - num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 - num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 - num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 - num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 - num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 - num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 - num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 - num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 - num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 - num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 - num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 - num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 - num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 - num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 - num3 / num4 / num5;
               }



            }//End if oper 2 = - 
            if (oper2.equals("*"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 * num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 * num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 * num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 * num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 * num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 * num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 * num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 * num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 * num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 * num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 * num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 * num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 * num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 * num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 * num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 * num3 / num4 / num5;
               }

            }//End if oper 2 = *
            if (oper2.equals("/"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 / num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 / num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 / num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 / num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 / num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 / num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 / num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 / num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 / num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 / num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 / num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 / num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 * num2 / num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 * num2 / num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 * num2 / num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 * num2 / num3 / num4 / num5;
               }

            }//End if oper 2 = *
            
                     
            
           }//End if oper 1 = *
            
          if (oper1.equals("/"))
	       {
            if (oper2.equals("+"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 + num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 + num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 + num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 + num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 + num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 + num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 + num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 + num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 + num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 + num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 + num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 + num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 + num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 + num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 + num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 + num3 / num4 / num5;
               }



            }//End if oper 2 = +
            if (oper2.equals("-"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 - num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 - num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 - num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 - num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 - num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 - num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 - num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 - num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 - num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 - num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 - num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 - num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 - num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 - num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 - num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 - num3 / num4 / num5;
               }



            }//End if oper 2 = - 
            if (oper2.equals("*"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 * num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 * num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 * num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 * num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 * num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 * num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 * num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 * num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 * num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 * num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 * num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 * num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 * num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 * num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 * num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 * num3 / num4 / num5;
               }

            }//End if oper 2 = *
            if (oper2.equals("/"))
            {
              if (oper3.equals("+"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 / num3 + num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 / num3 + num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 / num3 + num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 / num3 + num4 / num5;
               }
               if (oper3.equals("-"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 / num3 - num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 / num3 - num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 / num3 - num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 / num3 - num4 / num5;
               }
               if (oper3.equals("*"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 / num3 * num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 / num3 * num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 / num3 * num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 / num3 * num4 / num5;
               }
               if (oper3.equals("/"))
               {
                  if (oper4.equals("+"))
                     result = num1 / num2 / num3 / num4 + num5;
                  
                  if (oper4.equals("-"))
                     result = num1 / num2 / num3 / num4 - num5;

                  if (oper4.equals("*"))
                     result = num1 / num2 / num3 / num4 * num5;
                  
                  if (oper4.equals("/"))
                     result = num1 / num2 / num3 / num4 / num5;
               }

            }//End if oper 2 = *
            
                      
           }//End if oper 1 = *
           System.out.println("The result of " + num1 + " " + oper1 + " " + num2 + " " + oper2 + " " + num3 + " " + oper3 + " " + num4 + " " + oper4 + " " + num5 + " is " + result); //Output the result
           System.out.println("Thank you for using Waleed's Calculator"); 
      

      }
                      
   } 
 }