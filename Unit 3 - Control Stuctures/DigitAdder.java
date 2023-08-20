
/**
 * DigitAdder 
 * 
 * @author Nick Choi
 * @version 3/1/23
 */

import java.util.Scanner;

public class DigitAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        long original = number; 
        long sum = 0;
        
        while (number > 0) {
            long digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println(sum + " is the sum of the digits of " + original);
    }
}
