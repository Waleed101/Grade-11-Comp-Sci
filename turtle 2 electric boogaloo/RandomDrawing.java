import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class RandomDrawing
{
  static Turtle doug = new Turtle();
  static void drawRandom()
   {
      int m = (int)(Math.random()*100);
      doug.setPos(Math.random()*100, Math.random()*100);   
      doug.speed(1000000);
      doug.ht();
      for (int i=0; i < m; i++) {
          doug.rt(360.0/m).fd(360.0/m);
      }     
   }
   
   public static void main (String[]args)
   {
      drawRandom();  
   }
}