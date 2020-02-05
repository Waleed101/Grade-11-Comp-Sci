import java.util.Scanner;

class TrianglePattern
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int row, numRow, numStar;
      System.out.print("Enter the number of rows: ");
      numRow = sc.nextInt();
      for(row = 1; row <= numRow; row++)
      {
         for(numStar = 1; numStar <= row; numStar++)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
      
   }
}