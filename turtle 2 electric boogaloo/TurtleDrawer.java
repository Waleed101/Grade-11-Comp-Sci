/**********************************************************
	File: TurtleDrawer.java 
	Purpose: Program that has several methods 
	Author: Waleed Sawan
	Date: December 9, 2016
   Time: 10:20AM
	Based on: ICS3U Java Assignment 3, Question 5, Enrichment 2
   
   Quick tips:
   * The canvas size should be 1000*1000
   * The turtle size should be 70
   * The frame rate should be 25     
**********************************************************/

//Including the turtle and scanner java libraries
import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;


class TurtleDrawer
{
   static Turtle pencil = new Turtle(); // Defining the Turtle that will draw everyting
   static int color = 1; // Defining the color of the pen
   static boolean drawing = true; // Boolean is only defined false when user exits
   public static void main(String[] args)
   {
    Scanner inData = new Scanner(System.in); // Scanner for data
     String data; // String to hold the user input
     
     //Introudction for the user
     System.out.println("Welcome to the turtle drawer!");
     System.out.println("What would you like to draw? (/h for all commands)");
     while(drawing) // While loop that only ends when drawing = false
     {
      // Check user input then send to the checkUserInput function
      data = inData.nextLine();
      checkUserInput(data);
      resetTurtle(); // Reset turtle's position and pencolor
      System.out.print("Type a command: "); 
     }
     // End of program
     System.out.println("Thank you for using the turtle drawer!");
   }
   
   static void resetTurtle() // Reset turtle's position to the center and pencolor to blue
   {
      pencil.ht().setPos(0,0).setPenColor(Color.blue).speed(2000000000);  
   }
   
   static void drawRectangle3d() // Draw a Rectangular Prism
   {
    pencil.setH(180).fd(200).setH(315).fd(200).setH(0).fd(200).setH(135).fd(200).setH(90).fd(200).setH(180).fd(200).setH(270).fd(200).setPos(200,0).setH(315).fd(200).setH(270).fd(200);
   }
   
   static void drawSquare3d() // Draw a Cube
   {
    pencil.setH(180).fd(200).setH(315).fd(100).setH(0).fd(200).setH(135).fd(100).setH(90).fd(200).setH(180).fd(200).setH(270).fd(200).setPos(200,0).setH(315).fd(100).setH(270).fd(200);
   }
   
   static void drawSquare2d() // Draw a basic square
   {
    pencil.setH(180).fd(200).setH(270).fd(200).setH(0).fd(200).setH(90).fd(200);
   }
   
   static void drawRectangle2d() // Draw a basic rectangle
   {
    pencil.setH(180).fd(100).setH(270).fd(200).setH(0).fd(100).setH(90).fd(200);
   }
   
   static void clearCanvas() // Clear the canvas 
   {
    pencil.clean();
   }
   
   static void checkUserInput(String userInput) // Check the user input with string variable userInput
   {
      switch(userInput)
      {
         case "/h": // User inputs '/h' - Help
         printAllCommands(); 
         break;
         
         case "/r": // User inputs '/r' - Draw Rectangle
         drawRectangle2d();
         break;
         
         case "/s": // User inputs '/s' - Draw square
         drawSquare2d();
         break;
         
         case "/p": // User inputs '/p' - Draw Rectangular Prism
         drawRectangle3d();
         break;
         
         case "/c": // User inputs '/c' - Draw Cube
         drawSquare3d();
         break;
         
         case "/a": // User inputs '/a' - Draw Basic Turtle Artwork
         turtleArtworkSimple();
         break;
         
         case "/ac": // User inputs '/ac' - Draw Complex Turtle Artwork
         turtleArtworkComplex();
         break;
         
         case "/asc":
         turtleArtworkSuperComplex(); // User inputs '/asc' - Draw Super Complex Turtle Artwork
         break;
         
         case "/e": // User inputs '/e' - Clear the canvas
         clearCanvas();
         break;
         
         case "/exit": // User inputs '/exit' - User exits the main thread of the program
         drawing = false;
         break;    
         
         default: // Unknown user input - Asks them to type again 
         incorrectTerm();
         break;   
      }
   }
   
   static void incorrectTerm() // Print if incorrect term
   {
      System.out.println("Oops! You typed an unknown command, if you don't know any commands type /h for help.");
   }
   
   static void printAllCommands() // Print all commands
   {
      System.out.println("/h - Help Commands\n/r - Draws Rectangle\n/s - Draws Square\n/p - Draws Rectangular Prism\n/c - Draws Cube\n/a - Draws Artwork Simple\n/ac - Turtle Artwork Complex\n/asc - Turtle Artwork Super Complex\n/e - Clears Canvas\n/exit - Exits Program");
   }
   
   static void turtleArtworkComplex() // Draw complex turtle artwork
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
   
   static void turtleArtworkSimple() // Draw simple turtle artwork
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
   
   static void turtleArtworkSuperComplex() // Draw super complex turtle artwork
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

   
   
   static void setTurtleColor() // Set turtle pencolor
   {
      switch(color) // Using static color variable
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
