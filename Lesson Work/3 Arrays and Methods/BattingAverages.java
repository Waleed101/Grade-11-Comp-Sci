import java.util.Scanner;

class BattingAverages
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner (System.in);
      Scanner scString = new Scanner (System.in);
      Scanner scDouble = new Scanner (System.in);
      int numberOfBatters, highest, lowest;
      System.out.print("How many people would you like to enter? ");
      numberOfBatters = sc.nextInt();
      String[] nameArrays = new String[numberOfBatters];
      double[] averageArrays = new double[numberOfBatters];
      for (int i = 0; i < numberOfBatters; i++)
       {
         System.out.print("Enter in the "+ (i+1) + " batter's name: ");
         nameArrays[i] = scString.nextLine();
         System.out.print("Enter " + nameArrays[i] + "'s batter average: ");
         averageArrays[i] = scDouble.nextDouble();
       }
      lowest = 0;
      for (int n = 1; n < numberOfBatters; n++)
      {
         if (averageArrays[n] < averageArrays[lowest])
            lowest = n;
      }  
      highest = 0;
      for (int n = 1; n < numberOfBatters; n++)
      {
         if (averageArrays[n] > averageArrays[highest])
            highest = n;
      } 
      System.out.println("Batter " + nameArrays[lowest] + " has the lowest batting average of " + averageArrays[lowest]);   
      System.out.println("Batter " + nameArrays[highest] + " has the highest batting average of " + averageArrays[highest]);  
   }
}