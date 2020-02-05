import java.util.Scanner;

class MyGrade
{
   public static void main(String [] args)
   {
      int grade;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your average: ");
      grade = sc.nextInt();
      if (grade < 0 || grade > 100)
         System.out.println("Error Message: That is not a grade");
         
      if (grade >= 90)
         System.out.println("Your letter grade is A+");
         
      if (grade >= 80 && grade <= 89)
         System.out.println("Your letter grade is A");
         
      if (grade >= 70 && grade <= 79)
         System.out.println("Your letter grade is B");
         
      if (grade >= 60 && grade <= 69)
         System.out.println("Your letter grade is C");
         
      if (grade >= 50 && grade <= 59)
         System.out.println("Your letter grade is D");
         
      if (grade <= 49)
         System.out.println("Your letter grade is F");
         
         
   }
}
