import ch.aplu.turtle.*;
import java.awt.Color;

class TurnForMe
{
      
   static void drawShape()
   {
      Turtle john = new Turtle(Color.green); // Create a green turtle in her 
                                          //own window.
      john.setPos(0,0);  
      john.speed(1000000000);
      for(int i = 0; i < 20; i++)
         john.rt(360).fd(5); 
      Turtle texter = new Turtle(john, Color.magenta);
      texter.ht().label("Everybody Do the \nTurtle Jiggle :P");
   }
   
   public static void main (String[]args)
   {
      drawShape();      
   }
}