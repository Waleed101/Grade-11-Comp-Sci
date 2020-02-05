import java.util.Scanner;

class NameLength
{
   public static void main (String [] args)
   {
      String name;
      int nameleng;
      Scanner sc = new Scanner (System.in);
      System.out.println("Please enter your name: ");
      name = sc.nextLine();
      nameleng = name.replace(" ", "").length();
      System.out.println("There are " + nameleng + " characters in your name.");
   }
}