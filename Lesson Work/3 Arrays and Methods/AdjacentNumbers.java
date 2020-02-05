import java.util.Scanner;

class AdjacentNumbers
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner (System.in);
      int[] averageArrays = new int[10];
      for (int i = 0; i < 10; i++)
       {
         System.out.print("Enter in the number"+ (i+1) + ": ");
         averageArrays[i] = sc.nextInt();
       }
      for (int j = 0; j < 9; j++)
      {
       if(averageArrays[j]+1 == averageArrays[j+1] && averageArrays[j+1]+1 == averageArrays[j+2])
       {
         System.out.println("True! For number:  " + averageArrays[j]);
         j = 9;
       }
      }
               
   }
}