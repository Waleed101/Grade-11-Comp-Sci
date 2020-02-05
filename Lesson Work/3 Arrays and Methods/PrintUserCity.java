import java.util.Scanner;
class PrintUserCity
{
   static void printUser(String city, String province)
   {
      System.out.println(city + " is a city in " + province);
   }
   
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a city: ");
      String city = sc.nextLine();
      System.out.print("Enter a province: ");
      String province = sc.nextLine();
      printUser(city, province);
   }
}