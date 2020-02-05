import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class SpirographShape
{
      
   static void drawShape()
   {
      Turtle john = new Turtle(Color.green); // Create a green turtle in her 
                                          //own window.
      john.setPos(0,0);  
      john.speed(2000000000); 
      john.ht();
      int color = 0;
                     // Place joe to the Point(0,0).
      for (int i=0; i < 300; i++) {
         {
            color++;
            if(color == 7)
            {
               color = 1;
            }
            switch(color)
            {
               case 1:
                  john.setPenColor(Color.green);
                  break;
            
               case 2:
                  john.setPenColor(Color.yellow);
                  break;
            
               case 3:
                  john.setPenColor(Color.blue);
                  break;
            
               case 4:
                  john.setPenColor(Color.orange);
                  break;
            
               case 5:
                  john.setPenColor(Color.pink);
                  break;
            
               case 6:
                  john.setPenColor(Color.black);
                  break;
            }
            john.rt(5).fd(20);
            for (int n=0; n < 14; n++)
            {
               john.rt(24).fd(20);
            } 
         }                // turn 90 degrees to the right
      }     
   }
   
   public static void main (String[]args)
   {
      Scanner letsGo = new Scanner(System.in);
      String go = letsGo.nextLine();
      if(go.equals("s"))
         drawShape();      
   }
}