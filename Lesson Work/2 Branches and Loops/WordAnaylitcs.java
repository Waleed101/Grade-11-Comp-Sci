import java.util.Scanner;

class WordAnaylitcs
{
   public static void main(String [] args)
   {
      Scanner name = new Scanner(System.in);
      String nameVal;
      int nameLength, val;
      
      System.out.print("Enter a word: ");
      nameVal = name.nextLine();
      nameLength = nameVal.length();
      
      val = nameLength%10;
      
      if (nameLength > 5)
         System.out.println("Greater than 5");
      
      else 
         System.out.println("Less than 5");
      
      if (val == 1 || val == 3 || val == 5 || val == 7 || val == 9)
         System.out.println("Odd");
         
      else
         System.out.println("Even"); 
   }
}