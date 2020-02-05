/**********************************************************
	File: Palindrome.java 
	Purpose: A program that checks if a user entered string is a palindrome and prints out the reverse of that string
	Author: Waleed Sawan
	Date: October 23, 2016
   Time: 10:00AM
	Based on: ICS3U Java Assignment 2, Question 4, Enrichment      
**********************************************************/


import java.util.Scanner;

class Palindrome
{
   public static void main (String [] args)
   {
      //Define all variables
      String word, wordFormated;
      int wordLength, wordLengthFormated;
      Scanner sc = new Scanner(System.in);
      
      //Ask user to enter a string
      System.out.println("Welcome to your PAL, the Palindrome checker: ");
      System.out.println("Enter a phrase or a word: ");
      word = sc.nextLine();
      
      //Change entire string to upper case, remove all spaces, and puctation
      wordFormated = word.toUpperCase();
      wordFormated = wordFormated.replaceAll("[.,?!\\s]", "");
      
      //Take length of word and formated word
      wordLength = word.length();
      wordLengthFormated = wordFormated.length();
      
      //Check if when word is backwords, it is equal to when the word is the right way
      if (wordFormated.equals(new StringBuilder(wordFormated).reverse().toString()))
        System.out.println("Your word is a Palindrome, with no punctuation or spaces"); //If true print not a palindrome
      
      else
         System.out.println("Your word isn't a Palindrome"); //If false print not a palindrome
      
      //Print out word backwords with punctuation and spaces
      System.out.print("Your word backwords, with no punctuation or spaces: ");
      for(int l = wordLengthFormated; l > 0; l--)
         System.out.print(wordFormated.substring(l - 1, l).toLowerCase());
      
      //Print out word backwords with no punctation or spaces
      System.out.print("\nYour word backwords, with punctuation: ");   
      for(int i = wordLength; i > 0; i--)
         System.out.print(word.substring(i - 1, i));
      
   }
   
}