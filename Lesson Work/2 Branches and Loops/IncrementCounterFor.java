import java.util.Scanner;

class IncrementCounterFor
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
      for(int i = min; i <= max; i+=inc)
      {
         System.out.println(i);
      }      
   }
}