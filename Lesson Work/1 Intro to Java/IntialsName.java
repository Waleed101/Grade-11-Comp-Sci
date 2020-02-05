import java.util.Scanner;

class IntialsName
{
   public static void main (String [] args)
   {
      String first;
      String last;
      String intialsf;
      String intialsl;
      System.out.println("Print your first name, followed by your last name: ");
      Scanner sc = new Scanner(System.in);
      first = sc.nextLine();
      last = sc.nextLine();
      intialsf = first.substring(0,1);
      intialsl = last.substring(0,1);
      System.out.print("Your intials are: ");
      System.out.println(intialsf + intialsl);
      
      
   }
}