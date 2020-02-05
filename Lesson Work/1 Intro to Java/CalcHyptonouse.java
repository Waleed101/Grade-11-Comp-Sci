//Question 17: Write a program that calculates the hypotenuse of a right triangle after prompting the user for the lengths of the other two sides.  
import java.util.Scanner;

class CalcHyptonouse
{
   public static void main (String [] args)
   {
      System.out.println("Please enter the the base, and height in the triangle, and we will calculate the hypotenuse");
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int height = sc.nextInt();
      int hyptosq = ((base * base) + (height * height));
      int hypto =  Math.sqrt(hyptosq);
      
   }
}