
/**
 * PrimeReturn
 *
 * @author Nick Choi
 * @version 3/22/23 
 */

import java.util.Scanner;

public class PrimeReturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        int num = input.nextInt();
        
        boolean isPrime = isPrime(num);
        System.out.println(num + " is a prime number: " + isPrime);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
