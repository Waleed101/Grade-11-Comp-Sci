import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class drawingWithMeTurtle
{
   static void drawTriangle()
   {
      Turtle joe = new Turtle(Color.blue); // Create a green turtle in her 
                                          //own window.
      joe.setPos(-100,100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < 3; i++) {
          joe.rt(120).fd(50);                 // turn 90 degrees to the right
      }     
   }
   
   static void drawSquare()
   {
      Turtle john = new Turtle(Color.yellow); // Create a green turtle in her 
                                          //own window.
      john.setPos(-100,100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < 4; i++) {
          john.rt(90).fd(50);                 // turn 90 degrees to the right
      }     
   }
   
   static void drawPentagon()
   {
      Turtle john = new Turtle(Color.green); // Create a green turtle in her 
                                          //own window.
      john.setPos(-100,100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < 5; i++) {
          john.rt(60).fd(50);                 // turn 90 degrees to the right
      }     
   }
   
   static void drawHexagon()
   {
      Turtle john = new Turtle(Color.orange); // Create a green turtle in her 
                                          //own window.
      john.setPos(-175,100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < 6; i++) {
          john.rt(60).fd(50);                 // turn 90 degrees to the right
      }     
   }
   
   static void drawOctogan()
   {
      Turtle john = new Turtle(Color.orange); // Create a green turtle in her 
                                          //own window.
      john.setPos(-175,100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < 8; i++) {
          john.rt(45).fd(50);                 // turn 90 degrees to the right
      }     
   }
   
   public static void main (String[]args)
   {
    Scanner action = new Scanner(System.in);
    System.out.println("Choose one of the following: Triangle(t), Square (s), Pentagon (p), Hexagon (h), Octogan(o)");
    String choice = action.nextLine();
    choice = choice.toUpperCase();
    switch(choice)
    {
      case "T":
        drawTriangle(); 
        break;
     
      case "S":
        drawSquare();
        break;
      
      case "P":
        drawPentagon();
        break;
      
      case "H":
        drawHexagon();
        break;
      
      case "O":
        drawOctogan();
        break;
      
    } 
   }
}