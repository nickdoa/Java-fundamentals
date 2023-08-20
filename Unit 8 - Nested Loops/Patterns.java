
/**
 * Patterns
 *
 * @author Nick Choi
 * @version 4/21/23
 */

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number --> ");
        int size = scanner.nextInt();
        System.out.println();
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
