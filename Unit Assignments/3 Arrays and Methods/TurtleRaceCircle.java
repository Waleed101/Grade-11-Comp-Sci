/**********************************************************
	File: TurtleRaceCircle.java 
	Purpose: Program that uses a multithreads to create a race track, then has a race between two different turtles that go at random speeds
	Author: Waleed Sawan
	Date: December 9, 2016
   Time: 10:20AM
	Based on: ICS3U Java Assignment 3, Question 3
   
   Quick tips:
   * The canvas size should be 1000*1000
   * The turtle size should be 70
   * The frame rate should be 25     
**********************************************************/

//Including the turtle java libraries

import ch.aplu.turtle.*;
import java.awt.Color;
  

public class TurtleRaceCircle implements Runnable      
{  
   static Turtle sam = new Turtle(Color.yellow); // Define static sam turtle to color yellow
   static Turtle emma = new Turtle(sam, Color.cyan); // Define static emma turtle to color cyan
   static boolean drawRace = true; // Boolean to know when drawing the race track
   static int speed = 1000; // Set starting speed to 1000
   static int result = 0; // Set result to a tie
   static boolean start = false; // Set started race to false
   static boolean racing = true; // Set racing to true
   public static void main (String[] args)  
   {  
      // Set both turtles speed to 2 billion, hide the turtle, set the line width to 10 and the pen color to black, pos to (0, 500), and point towards the east
      sam.speed(200000000).ht().setLineWidth(10).setPenColor(Color.black).setPos(0, 500).setH(90);
      emma.speed(200000000).ht().setLineWidth(10).setPenColor(Color.black).setPos(0, 500).setH(90);
      
      //Create a new thread called draw to draw the race track
      TurtleRaceCircle draw = new TurtleRaceCircle();   
      Thread thread = new Thread(draw);  
      thread.start(); //Start the thread
      
      //Get sam to draw outer circle
      for(int i = 0; i < 360; i++)
         sam.fd(8.65).rt(1);
      
      //Get sam to draw the middle line
      sam.setPos(0, 375).setH(90);
      for(int i = 0; i < 17; i++)
      {
         //Draw the curved line 
         for(int n = 0; n < 11; n++)
            sam.penDown().fd(6.45).rt(1);
         
         //Pen up for the middle space
         for(int j = 0; j < 11; j++)
            sam.penUp().fd(6.45).rt(1);
      }
      
      //Set turtle positions to starting
      sam.setPos(0, 437.5).penUp().st().setH(90);
      emma.setPos(-30, 308.5).penUp().st().setH(90);
      drawRace = false; // Set draw race to false to make sure that emma the turtle doesn't draw another race track
      
      //Create new thread to for the race
      TurtleRaceCircle worker = new TurtleRaceCircle();   
      Thread race = new Thread(worker);  
      race.start();
      
      //While loop for racing for turtle sam
      while(racing)
      { 
           if(sam.getX() > 0 && !start) // After the turtle passes inital starting position then set start to true 
             start = true;
                         
           for(int i = 0; i < 360; i++)
           {
             sam.speed(speedSam()).fd(7.525).rt(1); //Move forward 7.525 at turn right one degree
             if(i > 181)
               checkWinner(); //After 181 degrees start to check for a winner
           }
      }
      //Print current turtle positions to console
      System.out.println(emma.getPos()); 
      System.out.println(sam.getPos());
      
      //Get the winner
      getWinner();
      
   }
  
   public void run()   
   { 
      if(drawRace) // When boolean draw race is true   
      {
         //Draw the inner circle of the race track with turtle emma
         emma.setPos(0,230).setH(90).setPenColor(Color.black);
         for(int i = 0; i < 360; i++)
          {
             emma.fd(3.9).rt(1);
          }        
      }
      
      else if(!drawRace) // When boolean draw race is false
      {
         while(racing)
         {           
               for(int i = 0; i < 360; i++)
               {
                  emma.speed(speedEmma()).fd(5.375).rt(1); //Move forward 5.375 and turn right 1 degree
                   if(i > 181)
                     checkWinner(); // After 181 degrees start to check for the winner 
               }         
         }
      }
   }
  
   static void checkWinner() // Function to check for the winner
   {
      //Get current x position for both turtles
      int emmaDistanceFinish = (int)emma.getX();
      int samDistanceFinish = (int)sam.getX();
      if(emmaDistanceFinish == 0) // If Emma turtle position at -30 
      {
         // Set Emma as winner and racing as false
         racing = false;
         result = 2;
      }
      else if(samDistanceFinish == 0) // If Sam turtle position at 0
      {
         // Set Sam as winner and racing as false
         racing = false; 
         result = 1;
      }
       
   }
   
   static int speedEmma() // Function to set emma's speed between 1000 and 5000
   {   
      return (((int)(Math.random()*(5000 - 1000 + 1))) + 1000);
   }
   
   static int speedSam() // Function to set sam's speed between 1000 and 5000
   {
      return (((int)(Math.random()*(5000 - 1000 + 1))) + 1000);
   }
      
   static void getWinner() // Function to print the winner
   {
      if(result == 1) // Result is one, Sam is the winning turtle
      {  
         System.out.println("The yellow turtle, Sam won!");
         sam.setPos(-200,20).label("Sam, the yellow turtle won the race!!"); // Get Sam to print that he is the winner
         sam.setPos(0,-10);
         emma.setPos(500,0);
      }
      
      else if(result == 2) // Result is two, Emma is the winning 
      {
         System.out.println("The cyan turtle, Emma won!");
         emma.setPos(-200,20).label("Emma, the cyan turtle won the race!!"); // Get Emma to print that she is the winning turtle
         emma.setPos(0,-10);
         sam.setPos(500,0);
      }
   }

}
