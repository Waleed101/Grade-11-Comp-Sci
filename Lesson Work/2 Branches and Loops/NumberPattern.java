import java.util.Scanner;

class NumberPattern
{
   public static void main(String [] args)
   {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      while (num > 0 || num < 10)
      {
         switch (num)
         {
            case 1:
            System.out.println("1");
            num--;
            break;
            
            
            case 2:
            System.out.println("12");
            num--;
            break;
            
            
            case 3:
            System.out.println("123");
            num--;
            break;
            
            
            case 4:
            System.out.println("1234");
            num--;
            break;
            
            
            case 5:
            System.out.println("12345");
            num--;
            break;
            
            
            case 6:
            System.out.println("123456");
            num--;
            break;
            
            
            case 7:
            System.out.println("1234567");
            num--;
            break;
            
            
            case 8:
            System.out.println("12345678");
            num--;
            break;
            
            
            case 9:
            System.out.println("123456789");
            num--;
            break;
            
            
            
       }     
      }
   }
}