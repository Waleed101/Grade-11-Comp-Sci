import ch.aplu.turtle.*;
import java.awt.Color;

class drawingWithMeTurtle
{
   static void drawTriangle()
   {
      Turtle joe = new Turtle(Color.blue); // Create a green turtle in her 
                                          //own window.
      joe.setPos(-100,100);                 // Place joe to the Point(-100,100).
      for (int i=0; i < Math.random()*100; i++) {
          joe.rt(60).fd(200);                 // turn 90 degrees to the right
      }     
   }
   
   public static void main (String[]args)
   {
    drawTriangle();  
   }
}