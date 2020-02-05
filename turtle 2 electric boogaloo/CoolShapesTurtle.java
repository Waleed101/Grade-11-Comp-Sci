import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class CoolShapesTurtle
{
      
   static void drawShape()
   {
      Turtle john = new Turtle(Color.green); // Create a green turtle in her 
                                          //own window.
      john.setPos(0,0);  
      john.speed(2000000000); 
      john.ht();
      for(int i = 0; i < 7; i++)
      {
         john.rt(90);
         if(i%30==0)
         {
            for(int n = 0; n < 30; n++)
            {
               john
            }
         }
      }
      
   }
   
   public static void main (String[]args)
   {
      drawShape();      
   }
}