//Question 14: Write a program that calculates the area of a circle after asking the user for a radius.  Use Math.PI and Math.pow to do the calculation.
import java.util.Scanner;

class AreaCircle
{
   static public void main (String [] args)
   {
      System.out.println("Please enter the Radius of the Circle, and we will calculate the Area and Circumference");
      Scanner sc = new Scanner(System.in);
      double rad = sc.nextDouble();
      
      //Calculate the Area of the Circle
      
      double area = Math.PI * (rad * rad);
      
      //Calculate the Circumference of the Circle
      
      double circ = Math.PI * 2 * rad;
      
   }
}