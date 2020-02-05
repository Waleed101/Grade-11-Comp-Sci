import ch.aplu.turtle.*;
import java.awt.Color;
  
public class TurtleRaceRun implements Runnable      
{  
   static Turtle sam = new Turtle(Color.yellow);
   static Turtle emma = new Turtle(sam, Color.cyan);
   static boolean drawRace = true;
   static int speed = 1000;
   static int result = 0;
   public static void main (String[] args)  
   {  
   
      TurtleRaceRun run = new TurtleRaceRun();   
      Thread thread = new Thread(run);  
      thread.start(); 
      sam.setPenColor(Color.black).setPos(-500, -450).setH(90).fd(1000);
      sam.setPos(-500, 0);
      for(int i = 0; i < 24; i++)
      {
         sam.setH(90).fd(25).penUp().fd(25).penDown();
      }
      sam.setPos(-490, -250).penUp();
      emma.setPos(-490, 250).penUp();
      drawRace = false;
      TurtleRaceRun worker = new TurtleRaceRun();   
      Thread fun = new Thread(worker);  
      fun.start();
    
      while(!(emma.getX() >= 500) && !(sam.getX() >= 500))
      {
         sam.setH(90).speed(speed).fd(createTurtleDistance());  
         for(int i = 0; i > turtleCrash(); i++)
            sam.speed(100).rt(360);     
      }
      System.out.println(emma.getPos());
      System.out.println(sam.getPos());
      getWinner();
      
   }
  
   public void run()   
   { 
      if(drawRace)   
      {
         emma.setPenColor(Color.black).setPos(-500, 450).setH(90).fd(1000);
            
      }
      else if(!drawRace)
      {
         while(!(emma.getX() >= 500) && !(sam.getX() >= 500))
         {
            emma.setH(90).speed(speed).fd(createTurtleDistance());
            for(int i = 0; i > turtleCrash(); i++)
               emma.speed(100).rt(360);   
         }
      }
   }
  
   static int createTurtleDistance()
   {  
      return (((int)(Math.random()*(15 - 1 + 1))) + 1);
   }
  
   static int turtleCrash()
   {
      int random = (((int)(Math.random()*(10 - 1 + 1))) + 1);
      switch(random)
      {
         case 1:
            random = 5;
            break;
         
         default:
            random = 0;
            break;
      }
      return random;
   }
  
   static void getWinner()
   {
      if(sam.getX() > emma.getX())
      {  
         result = 1;
         System.out.println("The yellow turtle, Sam, won!");
         sam.setPos(-200,20).label("Sam, the yellow turtle won the race!!");
      }
      
      else if(sam.getX() < emma.getX())
      {
         result = 2;
         System.out.println("The cyan turtle, Emma won!");
         emma.setPos(-200,20).label("Emma, the cyan turtle won the race!!");
      }
      
      else
      {
         result = 0;
         System.out.println("The turtles tied!");
      }
   }

}
