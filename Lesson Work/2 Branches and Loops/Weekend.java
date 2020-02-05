import java.util.Scanner;

class Weekend
{
   public static void main (String [] args)
   {
      int daynum;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a day of the week (1 to 7): ");
      daynum = sc.nextInt();
      switch (daynum)
      {
         case 1:
         System.out.println("Its the weekend!!!!!!");
         break;
         
         case 2:
         System.out.println("Yawnnn, its Monday :(");
         break;
         
         case 3:
         System.out.println("2 days down, 3 to go");
         break;
         
         case 4:
         System.out.println("Go have some fun, its Wednesday");
         break;
         
         case 5:
         System.out.println("Who invented Thursday? Why don't we just go to Friday");
         break;
         
         case 6:
         System.out.println("Woo hoo - it's almost the weekend");
         break;
         
         case 7:
         System.out.println("It's the weekend!!! GO SATURDAY!");
         break;
         
         default:
         
         break;
      }
   }
}