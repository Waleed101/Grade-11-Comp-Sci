import ch.aplu.turtle.*;
import java.awt.Color;

public class TurtlePinwheel
{
  public static void main (String[] args) {
    Turtle boogaloo = new Turtle(Color.pink);    
   
    for (int i=0; i<9; i++) { 
    boogaloo.penWidth(1); 
    boogaloo.setPos(-50,50);
    boogaloo.setPenColor(Color.magenta);             
    boogaloo.fd(100).rt(90).fd(100); 
    boogaloo.rt(135).fd(150);

  
    }
  }
}