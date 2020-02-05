import java.util.Scanner;

class ArrayDefine
{
   static int[] arrayDefine(int leng)
   {
      Scanner sc = new Scanner(System.in);
      int[] numberArray = new int[leng];
      for (int i = 0; i < leng; i++)
      {
         System.out.print("Enter value for number " + (i+1) + ": "); 
         numberArray[i] = sc.nextInt();
      }
      return numberArray;
   }
   
   static void arrayRetrieve(int [] array)
   {
      Scanner sc = new Scanner(System.in);
      boolean cont = true;
      int numToRetrieve, leng = array.length;
      while(cont)
      {
         System.out.print("Which number would you like to retrieve? (Enter 0 to quit): ");
         numToRetrieve = sc.nextInt();
         if (numToRetrieve == 0)
           cont = false; 
         
         else if(numToRetrieve > leng+1)
           cont = false;
         
         else
            System.out.println(array[numToRetrieve]);
      }
   }
   
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of your array: ");
      int leng = sc.nextInt();
      int[] numberArray = new int[leng];
      numberArray = arrayDefine(leng);
      arrayRetrieve(numberArray);
      System.out.print("Thanks for using the program ;)"); 
   }
}