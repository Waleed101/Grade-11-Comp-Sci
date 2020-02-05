import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class TurtleParabola
{
   public static void main(String[] args)
   {
      Turtle waleed = new Turtle(Color.black);
      waleed.setPos(-200,0).setH(90).fd(400).setPos(0,200).setH(180).fd(400);
      waleed.setPos(0,100).setH(90);
      for(int i = 0; i < 25; i++)
      {
         waleed.fd(10).rt(5);
         double y = waleed.getY();
         if((int)y == 0)
         {
            i = 25;
         }
      }
   }
}