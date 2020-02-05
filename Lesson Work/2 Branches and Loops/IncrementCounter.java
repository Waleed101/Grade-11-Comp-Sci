import java.util.Scanner;

class IncrementCounter
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int inc, min, max;
      System.out.print("Enter the min: ");
      min = sc.nextInt();
      System.out.print("Enter the max: ");
      max = sc.nextInt();
      System.out.print("Enter the increment: ");
      inc = sc.nextInt();
      while (min < max + 1)
      {
         System.out.print(min + "\t");
         min = min + inc;     
      }
      
   }
}