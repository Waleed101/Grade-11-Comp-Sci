import java.util.Scanner;

class RectangleDraw
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int row, height, width, numX;
      System.out.print("Enter the width: ");
      width = sc.nextInt();
      System.out.print("Enter the height: ");
      height = sc.nextInt();
      for(row = 1; row <= height; row++)
      {
         for(numX = 1; numX <= width; numX++)
         {
            System.out.print("X");
         }
         System.out.println("");
      }
      
   }
}