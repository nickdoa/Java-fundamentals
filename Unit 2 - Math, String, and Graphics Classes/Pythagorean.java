
/**
 * Pythagorean
 *
 * @author Nick Choi
 * @version 1/27/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double hypotenuse = 0;
        
        System.out.print("Enter side A: ");
        a = input.nextDouble();
        
        System.out.print("Enter side B: ");
        b = input.nextDouble();
        
        hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("The length of hypotenuse C: " + Math.round(hypotenuse));
    }
}
