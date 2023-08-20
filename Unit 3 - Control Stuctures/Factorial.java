
/**
 * Factorial
 *
 * @author Nick Choi
 * @version 2/24/23
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        long factorial = 1L;
        
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        
        System.out.println("factorial of " + num + " is " + factorial);
    }
}

