/**********************************************************
	File: RandomOperations.java 
	Purpose: Complex program that allows a user to generate a set number of numbers between a minimum and maximum that they have set then allowing them to multiple functions to it including mode and medain
   Author: Waleed Sawan
	Date: December 9, 2016
   Time: 10:00AM
	Based on: ICS3U Java Assignment 3, Question 1     
**********************************************************/

// Include the java scanner and array libraries
import java.util.Scanner;
import java.util.Arrays;

class RandomOperations
{
   static int[] randomArray; // Static int array to hold the numbers
   static boolean cont = true;
   
   static void getRandomNumbers(int min, int max) // Function to getRandomNumbers with max and min as base's
   {
     for(int i = 0; i < randomArray.length; i++) // Generate random numbers
     {
         randomArray[i] = (((int)(Math.random()*(max - min + 1))) + min);
     }   
     Arrays.sort(randomArray); // Sort the numbers by ascending order
   }
   
   static void maxMinNumbers() /// Function to get max and min numbers
   {
      int max=0, min=0; // Assume that the first number is the max and the min
      for(int i = 0; i < randomArray.length; i++) // For loop to go through all the numbers
      {
         if(randomArray[max] < randomArray[i]) // If current number is greater than max number at the time then set max number to that number
         {
            max = i;
         }
         if(randomArray[min] > randomArray[i]) // If current number is less than min number at the time then set min number to that number
         {
            min = i;
         }
      }
      System.out.println("The maximum number is " + randomArray[max] + " and the minimum number is " + randomArray[min]); // Print the retrieved numbers 
   }
   
   static void returnNumbers() // Function to print all numbers
   {
      System.out.print("Here are your numbers: ");
      for (int i = 0; i < randomArray.length; i++)
      {
         System.out.print(randomArray[i] + " ");
      }
   }
   
   static void average(int startAtNumber) // Function to get the average of all the numbers allowing for the user to start at a specific number if the want to
   {
      int sum = 0;
      if(startAtNumber < 1)
         startAtNumber = 1;
      System.out.print("The average is: ");
      for(int i = startAtNumber-1; i < randomArray.length; i++) // Calculate the average
      {
         sum = sum+randomArray[i];
      }
      System.out.print(sum/randomArray.length); // Print the average
   }
   
   static void median() // Function to calculate the median
   {
      double mid = randomArray.length/2;
      if(mid%2==0) // If there are two medains then print both
         System.out.print("The medain is " + randomArray[((int)mid)-1] + " and is also " + randomArray[(int)mid]);
      else // Else print the only one
         System.out.println("The median is " + randomArray[(int)mid]);
   }
   
   static void mode() // Function to calculate the mode
   {
      int repeat, highestRepeat = 0, numbersPosted = 0;
      boolean printed = true;
      int[] modeArray = new int[randomArray.length]; // Array to hold the number of reccurances for each number
      int[] postedNumbers = new int[randomArray.length]; // Array to hold the printed numbers at the time
      for (int i = 0; i < randomArray.length; i++)
      {
         repeat = 1; // Each number is repeated atleast once
         for (int n = 0; n < randomArray.length; n++)
         {
            if(randomArray[i] == randomArray[n]) // Check if current number is equal to current number in the other for loop
            {
               if(i != n) // Make sure that it isn't the same number
                  repeat++; // Add to repeat by an interval of one
            }
         }
         modeArray[i] = repeat;
         if(highestRepeat < modeArray[i]) // Set variable to hold the highest number repeat
            highestRepeat = modeArray[i];
      }
     for (int i = 0; i < randomArray.length; i++) // Function to print the numbers
     {
      if(modeArray[i] == highestRepeat)
      {
         for(int p = 0; p < randomArray.length; p++)
         {
            if(randomArray[i] == postedNumbers[p]) // Check to make sure that number isn't already printed
            {
               printed = false;
            }
         }
         if(printed)
         {
            System.out.println("The mode is " + randomArray[i] + ", as it is repeated " + modeArray[i] + " times!");
            postedNumbers[numbersPosted] = randomArray[i]; // Define number posted to the posted numbers array
            numbersPosted++;
         }
      }
     }     
   }
   
   static void printCommands() // Function to print all the commands
   {
      System.out.print("The following are the operations currently supported:\nDisplay Numbers (Enter 1)\nAverage (Enter 2)\nMaximum and Minimum (Enter 3)\nCalculate the Median (Enter 4)\nFind all the Modes (Enter 5)\nEnd Program (Enter 6)\nEnter the number: ");
   }
   static void checkUserInput(int input) // Function to check the user input
   {
       Scanner inData = new Scanner(System.in);
       switch(input)
       {
          case 1: // Display numbers function
          System.out.println("Displaying Numbers...");
          returnNumbers();
          break;
          
          case 2: // Calculate average function
          System.out.print("Cool, you choose to calculate the average. Would you like to start at a specific number? Enter 1 if you don't want to! ");
          input = inData.nextInt();
          average(input);
          break;
          
          case 3: // Calculate minimum and maximum numbers function
          System.out.println("Calculating maximum and minimum numbers...");
          maxMinNumbers();
          break;
          
          case 4: // Calculate the medain function
          System.out.println("Finding the median...");
          median();
          break;
          
          case 5: // Calculate the mode function
          System.out.println("Calculating the modes...");
          mode();
          break;
          
          case 6: // Exit the program
          cont = false;
          break;
          
          case 404: // Print all the commands
          printCommands();
          break;
                   
          default: // Unknown function
          unknownFunction(input);
          break;   
       }

   }
   
   static void unknownFunction(int input) // Print to the screen that there is incorrect input
   {
     System.out.println("You inputed an unknown function of " + input + ", please try again!"); 
   }
   
   public static void main(String [] args)
   {
      int length, input, rangeMin, rangeMax;
      Scanner inData = new Scanner(System.in);
      System.out.print("Welcome to random numbers! \nEnter your minimum number: "); // Take user inputs for minimum
      rangeMin = inData.nextInt();
      System.out.print("Great! Now enter in the maximum number: "); // Take user input for maximum
      rangeMax = inData.nextInt();
      while(rangeMin > rangeMax) //Make sure that range min isn't greater than range max 
      {
         System.out.print("Oops, your max number is less than your min number... Please enter a number greater than " + rangeMin + ": ");
         rangeMax = inData.nextInt();
      }
      System.out.print("Awesome! Finally enter in the length of the array: "); // Take user input for the length of the array
      length = inData.nextInt();
      while(length > 2147483647) // Make sure that user inputs a number smaller than the max
      {
        System.out.print("Wow! Your length is way to long... Please print a smaller number: "); 
        length = inData.nextInt();
      }
      System.out.println("Great generating numbers!");
      randomArray = new int[length];
      getRandomNumbers(rangeMin, rangeMax); // Generate the random numbers
      System.out.print("Your array has been created!");
      while(cont) // Take user input and check with the checkUserInput function
      {
       System.out.print("\nWhat operations would you like to do? (Enter 404 for Operations) ");
       input = inData.nextInt();
       checkUserInput(input);
      }
      
      System.out.println("Thank You!"); // Print a bye message  
   }
}