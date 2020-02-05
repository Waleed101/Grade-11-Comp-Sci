import java.util.Scanner;

class EvenOdd
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      int val = num%10;
      if(val == 1 || val == 3 || val == 5 || val == 7 || val == 9)
         System.out.println("Your number is odd");
         
      else
         System.out.println("Your number is even");
   }
}