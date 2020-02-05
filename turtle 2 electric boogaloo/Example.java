import ch.aplu.turtle.*;
import java.awt.Color;

public class Example
{
  public static void main (String[] args) {
    Turtle joe = new Turtle(Color.green); // Create a green turtle in her 
                                          //own window.
    joe.setPos(-100,100);                 // Place joe to the Point(-100,100).
    for (int i=0; i < 4; i++) {
      joe.rt(90).fd(200);                 // turn 90 degrees to the right, then 
                                          // move forward 200 pixels.
    }
    joe.setPenColor(Color.red);           // set the pen color to red.
    joe.pu();                             // lifts the pen off the canvas
    joe.bk(50).lt(90).bk(50).rt(90).pd();
    for (int i=0; i < 4; i++) {
      joe.rt(90).fd(100);
    }
    Turtle anne = new Turtle(joe);        // Create a new Turtle (named anne)
                                          // in the same window as joe
    anne.speed(1000).fd(150).lt(90);      // sets the speed to 1000 pixels/sec,
                                          // then do some moves.
    anne.ht().fd(150).lt(90).stampTurtle(); // ht(): hide the turtle
    anne.fd(300);
    anne.st();                            // lets the turtle reappear on the 
                                          // screen
    anne.wrap();                          // Tells anne to wrap around the edges
    anne.setPos(200,200);
    for (int i=0; i < 4; i++) {
      anne.rt(90).fd(400);
    }
    anne.reinit();                        // Resets anne to her standard settings,
                                          // e.g. home position,facing north 
    Turtle filly = new Turtle(joe, Color.yellow); // yellow Turtle in joe's
                                          // Playground.
    filly.setPos(75,75);
    filly.setFillColor(Color.black);      // Sets the fill color to black.
    filly.fill();                         // fills the region bounded by any 
                                          // non-background colored pixel, 
					  // containing filly's position.
    filly.setPos(175,175);
    filly.setFillColor(Color.orange);
    filly.fill();

    Turtle texter = new Turtle(joe, Color.magenta);
    texter.ht().label("Hello Turtle");
  } 
}