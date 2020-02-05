import java.util.Scanner;

class Average
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner (System.in);
      Scanner scDouble = new Scanner (System.in);
      int numberOfNumbers, average;
      double sum=0;
      System.out.println("How many numbers would you like?");
      numberOfNumbers = sc.nextInt();
      double[] averageNumbers = new double[numberOfNumbers];
      for (int i = 0; i < numberOfNumbers; i++)
      {
         System.out.print("Enter in the "+ (i+1) + " number: ");
         averageNumbers[i] = scDouble.nextDouble();
         sum = averageNumbers[i] + sum; 
      }
      System.out.println("The average of the " + numberOfNumbers + " numbers is " + sum/numberOfNumbers);
   }
}