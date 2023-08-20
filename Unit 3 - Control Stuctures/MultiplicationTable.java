
/**
 * MultiplicationTable
 *
 * @author Nick Choi
 * @version 2/23/23
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        
        System.out.println(" ");
        System.out.println("Multiplication table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }
}

