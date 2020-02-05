import java.util.Scanner;

class CircleCalculations
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner (System.in);
      double rad, selec;
      System.out.print("Enter a radius: ");
      rad = sc.nextDouble();
      System.out.print("Enter 1 for diameter, 2 for circumference, or 3 for the area: ");
      selec = sc.nextDouble();
      switch((int)selec)
      {
         case 1:
         System.out.println("The diameter is " + rad*2);
         break;
         
         case 2:
         System.out.println("The circumference is " + (2*Math.PI*rad));
         break;
         
         case 3:
         System.out.println("The area is " + (Math.pow((Math.pi
      }
      
   }
}