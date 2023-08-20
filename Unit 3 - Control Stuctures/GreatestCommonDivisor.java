
/**
 * GreatestCommonDivisor
 *
 * @author Nick Choi
 * @version 2/27/23
 */

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n1 = 0, n2 = 0, gcd = 1;
        
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        
        System.out.print("Enter the second number: ");  
        n2 = input.nextInt();
        
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
        if(n1 % i==0 && n2 % i==0)
            gcd = i;
        }
         if (gcd == 1) {
           System.out.printf("There is no GCD for %d and %d", n1, n2);
         } else {
           System.out.printf("The G.C.D of %d and %d is %d", n1, n2, gcd);
        }
    }
}
