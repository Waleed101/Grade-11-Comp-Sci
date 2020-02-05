import java.awt.*;
import com.otherwise.jurtle.*;

public class BorderBox extends Turtle
{

    public void runTurtle()
    {
        // Do some setup.
        setAutoUpdatePause( 200 );
        setPenWidth( 20 );
        setPenColor( Color.orange );

        // Get the display's size.
        Dimension size = getDisplaySize();

        // Position the turtle in the upper left
        penUp();
        setPosition( 20, 20 );
        penDown();

        // Now move to the four corners with the pen down.
        setPosition( size.width - 10, 10 );
        setPosition( size.width - 10, size.height - 10 );
        setPosition( 10, size.height - 10 );
        setPosition( 10, 10);
        hideTurtle();
    }

}