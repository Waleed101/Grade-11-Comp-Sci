
//Question 12: Write a program that prompts the user to input the dimensions of a box, and outputs its volume and surface area
import java.util.Scanner;
public class CalcBox {
    public static Scanner user_input;
    public static void main(String[] args) {
         System.out.println("This program will calculate the dimensions of a box");
         System.out.print("Enter the Length: ");
         Scanner length = new Scanner(System.in);
         int leng = length.nextInt();
         System.out.print("Enter the Width: ");
         Scanner width = new Scanner(System.in);
         int widt = width.nextInt();
         System.out.print("Enter the Depth: ");
         Scanner depth = new Scanner(System.in);
         int dept = depth.nextInt();
         int vol = leng * dept * widt;
         int dw = dept * widt;
         int dl = dept * leng;
         int wl = widt * leng;
         int area = 2 * dw + 2 * dl + 2 * wl;
         System.out.println("The volume of the box is " + vol );
         System.out.println("The Surface area of the box is " + area );
        }
}