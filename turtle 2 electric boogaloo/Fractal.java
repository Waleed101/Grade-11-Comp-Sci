import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class Fractal
{
   static void drawTriangle()
   {
      Turtle joe = new Turtle(Color.blue); // Create a green turtle in her 
      int fd = 100; 
      int lt = 120;                                   //own window.
      joe.setPos(-100,-100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < 7; i++) {
          joe.lt(lt).fd(fd);
          if (i == 3)
          {
            fd=40;
            lt=160;
            joe.penUp();
            joe.lt(150).fd(fd);
            joe.penDown();
          }                 // turn 90 degrees to the right
      }     
   }
   
    public static void main (String[]args)
   {
    drawTriangle();
   }
}