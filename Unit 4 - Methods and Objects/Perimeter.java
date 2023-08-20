
/**
 * Perimeter
 *
 * @author Nick Choi
 * @version 3/20/23
 */

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = sc.nextInt();

        calculatePerimeterVoid(length, width);

        int perimeter = calculatePerimeterReturn(length, width);
        System.out.println("Return Method :: ");
        System.out.println("The perimeter is :: " + perimeter);
        System.out.println(" ");    
        
        sc.close();
    }
        public static void calculatePerimeterVoid(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println("Void Method :: ");
        System.out.println("The perimeter is :: " + perimeter);
    }
    public static int calculatePerimeterReturn(int length, int width) {
        return 2 * (length + width);
    }
}