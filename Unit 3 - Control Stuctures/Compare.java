
/**
 * Compare 
 *
 * @author Nick Choi
 * @version 2/17/23
 */

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number 1 --> ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 --> ");
        int num2 = sc.nextInt();
        sc.close();
        
        if (num1 < num2) {
            System.out.println(" ");
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 > num2) {
            System.out.println(" ");
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(" ");
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
