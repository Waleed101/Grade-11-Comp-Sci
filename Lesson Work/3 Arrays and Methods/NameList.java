import java.util.Scanner;

class NameList
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner (System.in);
      Scanner scString = new Scanner (System.in);
      int numberOfNames, nameRecall = 0;
      boolean stay = true;
      System.out.print("How many names would you like to enter?");
      numberOfNames = sc.nextInt();
      String[] nameArrays = new String[numberOfNames];
      for (int i = 0; i < numberOfNames; i++)
      {
         System.out.print("Enter in the "+ (i+1) + " name: ");
         nameArrays[i] = scString.nextLine();
      }
      while (stay)
      {
         System.out.print("Which name do you want to recall? (Enter 0 to quit.)");
         nameRecall = sc.nextInt();
         stay = false;
        
         if (nameRecall!=0)
         {  
            stay = true;   
            System.out.println(nameArrays[nameRecall-1]);
         }
      }
     
   }
}