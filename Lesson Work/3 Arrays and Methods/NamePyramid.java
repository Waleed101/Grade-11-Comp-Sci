import java.util.Scanner;

class NamePyramid
{
   static void pyramidPrinter(String name, int numOfTimes)
   {
      for(int i = 1; i<=numOfTimes; i++)
      {
         System.out.println();
         for(int n = i; n > 0; n--)
         {
            System.out.print(name);
         } 
        
      }
   }
   
   public static void main(String[]args)
   {
      Scanner stringData = new Scanner(System.in);
      Scanner integerData = new Scanner(System.in);
      System.out.print("Enter the name you would like to repeat: ");
      String name = stringData.nextLine();
      System.out.print("How many lines would you like to enter: ");
      int numOfTimes = integerData.nextInt();
      pyramidPrinter(name, numOfTimes);
   }
}