import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.Scanner;

class TurtleRace implements Runnable   
{
   static Turtle john = new Turtle(Color.green);
   static Turtle sam = new Turtle(john, Color.yellow);
   static Turtle emma = new Turtle(john, Color.cyan);
   static int[] turtleSpeed = new int[3];
   
   
   public static void main(String [] args)
   {
    System.out.println("Boo Ya!!");
   } 
   
   static void createTurtleSpeed()
   {
      for(int i = 0; i < 3; i++)
      {
         turtleSpeed[i] = (((int)(Math.random()*(1000 - 500 + 1))) + 500);
      }
   }
    public void run() 
      {
         john.setPenColor(Color.black).setPos(-200, -150).setH(90).fd(400);
         sam.setPenColor(Color.black).setPos(-200, 150).setH(90).fd(400);
         emma.setPenColor(Color.yellow).setPos(-200, -50);
         for(int i = 0; i < 17; i++)
         {
            emma.setH(90).fd(25).penUp().fd(25).penDown();
         }
         
         emma.setPos(-200, 50);
         for(int i = 0; i < 17; i++)
         {
            emma.setH(90).fd(25).penUp().fd(25).penDown();
         }
         john.setPos(-190, -100);
         sam.setPos(-190, 0);
         emma.setPos(-190, 100);
      } 
}