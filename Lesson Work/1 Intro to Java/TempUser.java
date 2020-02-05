import java.util.Scanner;

class AddCalc
{
   public static void main (String [] args)
   {
      System.out.println("Please enter the temperature in celsius to convert to fahrenheit!");
      Scanner sc = new Scanner(System.in);
      double cel = sc.nextDouble();
      double fah = cel * 9/5 + 32;
      System.out.println("The temperature in Fahrenheit is " + fah );
      
   }
}