import java.util.Scanner;

class DivideRemind
{
   public static void main (String [] args)
   {
    System.out.println("Please enter a numerator, and then a denominator!");
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();
    double den = sc.nextDouble();
    double res = num/den;
    double rem = num - res;
    System.out.println("The Result is " + (int)res + ", with a reminder of " + (int)rem );  
   }
}