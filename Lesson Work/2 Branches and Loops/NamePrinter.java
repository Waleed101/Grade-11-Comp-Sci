import java.util.Scanner;

class NamePrinter
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      String name;
      int numberOfLetters;
      System.out.print("Hi, what's your name? ");
      name = sc.nextLine();
      System.out.println(name + ", here's your name one letter a time:");
      numberOfLetters = name.length();      
      while (numberOfLetters > 0)
      {
         System.out.println(name.substring(numberOfLetters - 1, numberOfLetters));
         numberOfLetters--;
      } 
      
   }
}