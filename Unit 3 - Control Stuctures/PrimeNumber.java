
/**
 * PrimeNumber
 *
 * @author Nick Choi
 * @version 2/27/23
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int num2 = 0;
        
        System.out.print("Enter a number --> ");
        num = input.nextInt();

        for(int i = 2; i <= num/2; ++i) {
        if(num % i == 0)
        {
            num2 = 1;
            break;
        }
        }      
        if (num2 == 0)
            System.out.println(num + " is prime.");
        else
            System.out.println(num + " is not prime.");
  }
}
