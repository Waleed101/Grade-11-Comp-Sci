import java.util.Scanner;

class NameLongShort
{
   static String[] fillArray(String[] arrayToFill)
   {
    Scanner inData = new Scanner(System.in);
    int n = arrayToFill.length;
    
    for(int i=0; i < n; i++)
    {
     System.out.print("Enter Number " + (i+1) + ": ");
     arrayToFill[i] = inData.nextLine();
    } 
    
    return arrayToFill;
   }
   
   static void printShortNames()
   {
      
   }
   
   public static void main(String [] args)
   {
      Scanner inData = new Scanner(System.in);
      String[] names;
      int numberOfNames;
      System.out.print("How many names would you like to enter? ");
      numberOfNames = inData.nextInt();
      
      names = new String[numberOfNames];
      
      names = fillArray(names);
      
   }
}