import java.util.Scanner;

class MathRound
{
   public static void main (String [] args)
   {
    System.out.println("Please enter a decimal number to round too");
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();
    double roun = Math.round(num * 100) / 100;
        
    System.out.println(num + ", was rounded to " + roun );  
   }
}