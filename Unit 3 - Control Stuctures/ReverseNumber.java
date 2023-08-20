
/**
 * ReverseNumber
 *
 * @author Nick Choi
 * @version 3/1/23
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        long original = number; 
        long reversed = 0;
        while (number != 0) {
            long digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println(original + " reversed is " + reversed);
    }
}



