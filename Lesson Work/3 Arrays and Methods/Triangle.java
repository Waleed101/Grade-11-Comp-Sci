import java.util.Scanner;
class Triangle
{
   static double hypotenuseCalc(double a, double b)
   {
      double cPower = Math.pow(a,2) + Math.pow(b,2);
      return Math.sqrt(cPower);
   }
   
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
     double a = sc.nextDouble();
     double b = sc.nextDouble();
     System.out.print(hypotenuseCalc(a,b));
   }
}