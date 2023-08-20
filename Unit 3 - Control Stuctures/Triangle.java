
/**
 * Triangle
 *
 * @author Nick Choi
 * @version 2/16/23
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Side 1 --> ");
    int side1 = input.nextInt();
    
    System.out.print("Enter Side 2 --> ");
    int side2 = input.nextInt();
    
    System.out.print("Enter Side 3 --> ");
    int side3 = input.nextInt();
    
         if (side1 == side2 && side2 == side3) {
            System.out.println(" ");
            System.out.println("This triangle is an equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println(" ");
            System.out.println("This triangle is an isosceles");
        } else {
            System.out.println(" ");
            System.out.println("This triangle is a scalene");
        }
    }
}
