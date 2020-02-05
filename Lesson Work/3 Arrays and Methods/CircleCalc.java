import java.util.Scanner;

class CircleCalc
{
   static double areaCalc(double rad)
   {
      double radPow = Math.pow(rad, 2);
      return Math.PI*radPow;
   }
   
   static double permCalc(double rad)
   {
      return 2*(Math.PI*rad);
   }
   
   static double diamCalc(double rad)
   {
      return rad*2;
   }
   
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      Scanner scRad = new Scanner(System.in);
      double rad;
      String convert;
      System.out.print("Enter your radius: ");
      rad = scRad.nextDouble();
      System.out.print("Calculate the Area, Perimeter, or Diameter: ");
      convert = sc.nextLine();
      convert = convert.toUpperCase();
      if(convert.equals("A"))
         System.out.println("The area of a circle with radius " + rad + " is " + areaCalc(rad));
      else if(convert.equals("P"))
         System.out.println("The perimeter of a circle with radius " + rad + " is " + permCalc(rad));
      else if(convert.equals("D"))
         System.out.println("The diamter of a circle with radius " + rad + " is " + diamCalc(rad));
   }
}