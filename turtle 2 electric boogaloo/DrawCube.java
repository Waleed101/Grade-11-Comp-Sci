/**********************************************************
	File: TurtleDrawer.java 
	Purpose: Program that has several methods 
	Author: Waleed Sawan
	Date: October 17, 2016
   Time: 10:20AM
	Based on: ICS3U Java Assignment 2, Question 1      
**********************************************************/

import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

//The box should be 1000*1000

class TurtleDrawer
{
   static Turtle pencil = new Turtle();
   static int color = 1;
   public static void main(String[] args)
   {
     boolean drawing = true;
     Scanner inData = new Scanner(System.in);
     String data;
     System.out.println("Welcome to the turtle drawer!");
     while(drawing)
     {
      System.out.println("What would you like to draw? (/h for all commands)");
      data = inData.nextLine();
      pencil.ht().setPos(0,0);  
      pencil.speed(2000000000); 
      checkUserInput(data);
     }
   }
   
   static void drawRectangle3d()
   {
    pencil.ht().setH(180).fd(200).setH(315).fd(200).setH(0).fd(200).setH(135).fd(200).setH(90).fd(200).setH(180).fd(200).setH(270).fd(200).setPos(200,0).setH(315).fd(200).setH(270).fd(200);
   }
   
   static void drawSquare3d()
   {
    pencil.ht().setH(180).fd(200).setH(315).fd(100).setH(0).fd(200).setH(135).fd(100).setH(90).fd(200).setH(180).fd(200).setH(270).fd(200).setPos(200,0).setH(315).fd(100).setH(270).fd(200);
   }
   
   static void drawSquare2d()
   {
    pencil.ht().setH(180).fd(200).setH(270).fd(200).setH(0).fd(200).setH(90).fd(200);
   }
   
   static void drawRectangle2d()
   {
    pencil.ht().setH(180).fd(100).setH(270).fd(200).setH(0).fd(100).setH(90).fd(200);
   }
   
   static void clearCanvas()
   {
    pencil.clean();
   }
   
   static void checkUserInput(String userInput)
   {
      switch(userInput)
      {
         case "/h":
         printAllCommands();
         break;
         
         case "/r":
         drawRectangle2d();
         break;
         
         case "/s":
         drawSquare2d();
         break;
         
         case "/p":
         drawRectangle3d();
         break;
         
         case "/c":
         drawSquare3d();
         break;
         
         case "/a":
         turtleArtworkSimple();
         break;
         
         case "/ac":
         turtleArtworkComplex();
         break;
         
         case "/asc":
         turtleArtworkSuperComplex();
         break;
         
         case "/e":
         clearCanvas();
         break;       
      }
   }
   
   static void printAllCommands()
   {
      System.out.println("/h - Help Commands\n/r - Draws Rectangle\n/s - Draws Square\n/p - Draws Rectangular Prism\n/c - Draws Cube\n/a - Draws Artwork Simple\n/ac - Turtle Artwork Complex\n/asc - Turtle Artwork Super Complex\n/e - Clears Canvas");
   }
   
   static void turtleArtworkComplex()
   {
      for (int i=0; i < 300; i++) 
         {
            setTurtleColor();
            pencil.rt(5).fd(20);
            for (int n=0; n < 14; n++)
            {
               pencil.rt(24).fd(20);
            } 
         }

   }
   
   static void turtleArtworkSimple()
   {
      for (int i=0; i < 300; i++) 
         {
            setTurtleColor();
            pencil.rt(5).fd(20);
            for (int n=0; n < 9; n++)
            {
               pencil.rt(40).fd(20);
            } 
         }

   }
   
   static void turtleArtworkSuperComplex()
   {
      for (int i=0; i < 300; i++) 
         {
            setTurtleColor();
            pencil.rt(5).fd(20);
            for (int n=0; n < 25; n++)
            {
               pencil.rt(14.4).fd(20);
            } 
         }

   }

   
   
   static void setTurtleColor()
   {
      switch(color)
         {
               case 1:
                  pencil.setPenColor(Color.green);
                  break;
            
               case 2:
                  pencil.setPenColor(Color.yellow);
                  break;
            
               case 3:
                  pencil.setPenColor(Color.blue);
                  break;
            
               case 4:
                  pencil.setPenColor(Color.orange);
                  break;
            
               case 5:
                  pencil.setPenColor(Color.pink);
                  break;
            
               case 6:
                  pencil.setPenColor(Color.cyan);
                  break;
            }
       color++;
       if(color == 6)
         color = 1;

   }
}
