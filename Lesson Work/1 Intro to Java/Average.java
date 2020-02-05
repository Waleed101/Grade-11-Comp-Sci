//Question 5: Using double variables, write a program that finds the average of 3 decimal numbers and outputs the average as a sentence such as “The average of 4.0, 5.0, and 6.0 is 5.0.” 
class Average
{
   public static void main (String [] args)
   {
      double avg1 = 4.0;
      double avg2 = 5.0;
      double avg3 = 6.0;
      double totalavg = (avg1 + avg2 + avg3)/3;
      System.out.println("The average of " + avg1 + ", "  + avg2 + ", " + avg3 + " is " + totalavg); 
   }
}