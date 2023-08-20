
/**
 * Rectangle
 *
 * @author Nick Choi
 * @version 1/19/23
 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length --> ");
        
        int length = scanner.nextInt();
        System.out.print("Enter the Width --> ");
        
        int width = scanner.nextInt();
        int perimeter = 2 * length + 2 * width;
        int area = length * width;

        System.out.println(" ");
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
