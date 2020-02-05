import java.util.Scanner;

class UpsideTriangle
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int row, numRow, numStar;
      System.out.print("Enter the number of rows: ");
      numRow = sc.nextInt();
      for(row = numRow; row >= 0; row--)
      {
         for(numStar = numRow; numStar >= 0; numStar--)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
      
   }
}