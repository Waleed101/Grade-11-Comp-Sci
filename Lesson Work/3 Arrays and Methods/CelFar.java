import java.util.Scanner;

class CelFar
{
   static double celConvert(double val)
   {
      return Math.round(((val-32)*5/9)*10)/10;
   }
   
   static double farConvert(double val)
   {
      return Math.round(((val*9)/5+32)*10)/10;
   }
   
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      Scanner scTemp = new Scanner(System.in);
      double val;
      String choice;
      System.out.print("Celsius(c) or Fahrenheit(f) to convert to: ");
      choice = sc.nextLine();
      System.out.print("Enter the value: ");
      val = scTemp.nextDouble();
      choice = choice.toUpperCase();
      if (choice.equals("C"))
         System.out.println("The value " + val + "\u00b0F in celsius is " + celConvert(val) + "\u00b0C");
      else if (choice.equals("F"))
         System.out.println("The value " + val + "\u00b0C in fahrenheit is " + farConvert(val) + "\u00b0F");
   }
}