import java.util.Scanner;

class SavingsCalc
{
   public static void main (String [] args)
   {
      System.out.println("Please enter the the principal amount orginally disposed, interest rate, and annual compund rate");
      Scanner sc = new Scanner(System.in);
      int prin = sc.nextInt();
      int inte = sc.nextInt();
      double comp = sc.nextDouble();
      double amount = prin(Math.pow((1+inte), comp));
      System.out.println("The amount of money is " + amount );
      
   }
}