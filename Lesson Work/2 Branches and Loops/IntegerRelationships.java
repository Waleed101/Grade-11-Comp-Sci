import java.util.Scanner;

class IntegerRelationships
{
   public static void main(String [] args)
   {
      int integer1, integer2;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter an Integer: ");
      integer1 = sc.nextInt();
      System.out.print("Enter another Integer: ");
      integer2 = sc.nextInt();
      
      if (integer1 > integer2)
         System.out.println(integer1 + " is greater than " + integer2 + " is true!");
      else
         System.out.println(integer1 + " is greater than " + integer2 + " is false!");
      
      if (integer1 < integer2)
         System.out.println(integer1 + " is less than " + integer2 + " is true!");
      else
         System.out.println(integer1 + " is less than " + integer2 + " is false!");
      
      if (integer1 == integer2)
         System.out.println(integer1 + " is equal than " + integer2 + " is true!");
      else
         System.out.println(integer1 + " is equal than " + integer2 + " is false!");
   }
}