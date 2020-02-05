// Question 9: Without copy/pasting, create from scratch a program that asks for a user’s name and prints a message using their name.  
import java.util.Scanner;
public class DisplayName 
   {
      public static void main(String[] args) {
           System.out.println("Enter your username: ");
           Scanner scanner = new Scanner(System.in);
           String username = scanner.nextLine();
           System.out.println("Your username is " + username);
   }
}