import java.util.Scanner;

class FractionMulti
{
   public static void main (String [] args)
   {
      double num1, den1, num2, den2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a numerator:");
      num1 = sc.nextDouble();
      System.out.println("Please enter a denominator:");
      den1 = sc.nextDouble();
      System.out.println("Please enter another numerator:");
      num2 = sc.nextDouble();
      System.out.println("Please enter another denominator:");
      den2 = sc.nextDouble();
      double res = (num1 / den1) * (num2 / den2);
      double fraction1 = num1 / den1;
      System.out.println((int)(res * 10) + "/" + (int)(fraction1 * 10));
      System.out.println();
      
   }
}