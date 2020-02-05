import ch.aplu.turtle.*;
import java.awt.Color;

class TurtleMethods
{
   //method for a given Turtle to draw a square with a given side length
   static void drawSquare(Turtle t, int length)
   {
      for (int i = 1; i <= 4; i++)
         t.fd(length).rt(90);
   }
   
   //MAIN
   public static void main(String[] args)
   {
      Turtle steve = new Turtle();
      //drawSquare(steve, 40);
      
      
      
      steve.ht().speed(100000);
      
      for(int n = 1; n <= 4; n++)
      {
         for(int i = 1; i <= 40; i++)
            drawSquare(steve, 5*i);
         steve.rt(90);
      }
      
      
   }
}