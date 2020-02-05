import java.util.Scanner;

class SpellingBee
{
   public static void main (String [] args)
   {
      String wordSpelt = "";
      Scanner sc = new Scanner(System.in);
      System.out.print("Type the word 'success': ");
      wordSpelt = sc.nextLine();
      wordSpelt = wordSpelt.toUpperCase();
      if (wordSpelt.equals("SUCCESS"))
         System.out.println("To say that you were successful is true");
      else
         System.out.println("To say that you were successful is false");
   }
}