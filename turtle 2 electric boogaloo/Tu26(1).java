// Tu26.java
// Key Event: the turtle can be moved using the arrow keys

import ch.aplu.turtle.*;
import java.awt.event.*;

class Tu26 extends Turtle
{
  
  Tu26()
  {
    setFontSize(10);
    setPos(-180, 180);
    label("Use cursor keys to move me!");
    home();
    
    addKeyListener(new KeyAdapter()
    {
      public void keyPressed(KeyEvent evt)
      {
        int step = 10;
        int keyCode = evt.getKeyCode();
        switch (keyCode)
        {
          case KeyEvent.VK_LEFT :
            setHeading(-90);
            forward(step);
            break;

          case KeyEvent.VK_RIGHT :
            setHeading(90);
            forward(step);
            break;

          case KeyEvent.VK_UP :
            setHeading(0);
            forward(step);
            break;

          case KeyEvent.VK_DOWN :
            setHeading(180);
            forward(step);
            break;
        }
      }
    });
  }

  public static void main(String[] args)
  {
    new Tu26();
  }
}