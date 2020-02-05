import ch.aplu.turtle.*;
import java.awt.Color;


class TurtleMedal
{
   public static void main(String [] args)
   {
      Turtle waleed = new Turtle(Color.yellow);
      waleed.setPos(0,0).setH(90).ht();
      waleed.speed(2000000000);
      for(int i = 0; i < 180; i++)
         waleed.fd(2).rt(2);
      for(int i = 0; i < 80; i++)
         waleed.fd(1).rt(1);

   }
}