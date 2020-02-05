import java.util.Scanner;

class Average
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      double avg=0, num;
      System.out.print("How many numbers would you like to find the average for? ");
      num = sc.nextDouble();
      
      for (double i = 1; i <= num; i++)
      {
         System.out.print("Enter your " + (int)i + " number: ");
         avg = avg + sc.nextDouble();
      }
      avg = avg/num;
      System.out.println("Your average is " + Math.round(avg));
   }
}