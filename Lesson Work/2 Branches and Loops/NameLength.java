import java.util.Scanner;

class NameLength
{
   public static void main(String [] args)
   {
      Scanner name = new Scanner(System.in);
      String userName;
      int numOfLetters;
      
      System.out.print("Enter your name: ");
      userName = name.nextLine();
      
      numOfLetters = userName.length();
      
      if (numOfLetters <= 5)
         System.out.println("Wow! You have a short name");
      
      
      if (numOfLetters >= 6 && numOfLetters <= 8)
         System.out.println("Wow! You have a medium length name");
        
      
      if (numOfLetters >= 9)
         System.out.println("Wow! You have a long name");
          
   }
}