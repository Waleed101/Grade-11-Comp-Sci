//Question 13: Write a program that asks for a user’s name and age, then calculates what their age will be in the year 2050.  The output can be something like “Doug, you will be 58 in the year 2050.” (This time you should create two Scanner objects!)
import java.util.Scanner;
public class Age2050
{
   public static void main (String [] args)
   {
      System.out.println("Please enter your name: ");
      Scanner nom = new Scanner(System.in);
      String name = nom.nextLine();
      System.out.println("Please enter in your age: ");
      Scanner ages = new Scanner(System.in);
      int age = ages.nextInt();
      int currentyr = 2016;
      int diffYear = 2050 - 2016;
      int ageAtYear = diffYear + age;
      System.out.println("Hey " + name + "! Your age is " + age + ", so you will be " + ageAtYear + " in 2050");
   }
}