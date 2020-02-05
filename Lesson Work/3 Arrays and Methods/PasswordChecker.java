import java.util.Scanner;
class PasswordChecker
{
   static boolean passwordLength(String pass)
   {
      if(pass.length()>=8)
         return true;
      else
         return false;
   } 
   
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your password: ");
      if(passwordLength(sc.nextLine()))
         System.out.println("Great Password!");
      
      else
         System.out.println("Bad Password");
      
   } 
}