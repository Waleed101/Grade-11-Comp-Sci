/**********************************************************
	File: Worker.java 
	Purpose: Design logo
	Author: Albert Jia
	Date: November 30 , 2015
	Based on: ICS3U Java Assignment 3, Question 3
*********************************************************
great but needs comments

*/
import ch.aplu.turtle.*;
import java.awt.Color;
  
public class Worker implements Runnable      
{  
  static Turtle joe = new Turtle(Color.red);
  public static void main (String[] args)  
  {  

    Worker worker = new Worker();   
    Thread thread = new Thread(worker);  
    thread.start(); 
    joe.ht().setPenColor(Color.black);                 
    joe.setPos(200,0);         
    joe.lt(90).fd(100);
    joe.rt(90);
    for (int i=0; i < 50; i++) 
    {
       joe.lt(3.6).fd(Math.PI*100/50);         

    }
    joe.setH(90).fd(80);
    joe.pu().fd(40);
    joe.pd().fd(80);
    joe.setPos(0,15);
    for (int i=0; i < 100; i++) 
    {
    joe.rt(3.6).fd(Math.PI*15/50);         

    }
    joe.setPos(0,50).setFillColor(Color.red);
    joe.fill();
    joe.setPos(-60,180);
    joe.setPenColor(Color.blue).label("POKEMON");
    } 
    
  public void run()   
  {  

    Turtle jia = new Turtle(joe); 
    jia.ht().setPenColor(Color.black);                 
    jia.setPos(-200,0);
    jia.rt(90).fd(100);
    jia.rt(90);
    for (int i=0; i < 50; i++) 
    {
    jia.lt(3.6).fd(Math.PI*100/50);         

    }
    jia.setH(270).fd(80);            
    jia.pu().fd(40);
    jia.pd().fd(80);
    jia.setPos(0,20);
    for (int i=0; i < 100; i++) 
    {
    jia.lt(3.6).fd(Math.PI*20/50);         
    }
    jia.setPos(0,0).setFillColor(Color.black);
    jia.fill();
    jia.setPos(25,0);
    jia.fill();
    jia.setPos(-25,0);
    jia.fill();
    jia.setPos(0,150).setFillColor(Color.yellow);
    jia.fill();
    jia.setPos(0,-150);
    jia.fill();
    jia.setPos(-120,-180);
    jia.setPenColor(Color.blue).label("GOTTA CATCH'EM ALL");
    }
}
