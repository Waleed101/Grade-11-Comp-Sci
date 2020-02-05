import java.util.Scanner;

class SalesPerformance
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Scanner scString = new Scanner(System.in);
      Scanner scDouble = new Scanner(System.in);
      int numOfEmployees;
      String[] personName;
      double[][][][] monthlySales;
      double monthTotal, monthOne, monthTwo, monthThree;
      
      System.out.print("Enter Number of Employees: ");
      numOfEmployees = sc.nextInt();     
      monthlySales = new int[numOfEmployees][numOfEmployees][numOfEmployees][numOfEmployees];
      
      for(int employee = 0; employee < numOfEmployees; employee++)
      {
         System.out.print("Enter employee " + (employee+1) + "'s name: ");
         personName[employee] = scString.nextLine();
         for (int month = 0; month < 3; month++)
         {
            System.out.print("Enter " + (personName[employee]) + "'s month " + (month+1)+" sales: "); 
            
            if(month=0)
               monthOne = scDouble.nextDouble();
            
            if(month=1)
               monthTwo = scDouble.nextDouble();
               
            if(month=2)
               monthThree = scDouble.nextDouble();
         }
         monthTotal = (monthOne + monthTwo + monthThree)/3.0;
         monthlySales
      }
   }
}