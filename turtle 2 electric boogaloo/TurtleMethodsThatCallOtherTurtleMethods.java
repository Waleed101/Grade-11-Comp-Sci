import ch.aplu.turtle.*;
import java.awt.Color;

class TurtleMethodsThatCallOtherTurtleMethods
{
   //method for a given Turtle to draw a square with a given side length
   static void drawSquare(Turtle t, int length)
   {
      for (int i = 1; i <= 4; i++)
         t.fd(length).rt(90);
   }
   
   //method to make a diagonal pattern of squares using drawSquare method
   static void drawDiagonalSquares(Turtle t, int length, int numberOfSquares)
   {
      for (int i = 1; i <= numberOfSquares; i++)
      {
         drawSquare(t, length);
         t.setPos(5*i,5*i);
      }
   }
   
   //MAIN
   public static void main(String[] args)
   {
      Turtle steve = new Turtle();
      
      //drawDiagonalSquares(steve, 15, 20); 







      
      steve.ht().speed(100000000);

      for (int i = 1; i <= 10; i++)
      {
         drawDiagonalSquares(steve, 5*i, 20);
      }  
      
   }
}