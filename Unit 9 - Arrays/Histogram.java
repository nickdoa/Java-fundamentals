
/**
 * Histogram
 *
 * @author Nick Choi
 * @version 5/16/23
 */

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int[] occurrences = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(" *"); 
        
        System.out.println("Enter a list of numbers (0-9) separated by space:");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number >= 0 && number <= 9) {
                occurrences[number]++;
            }
        }
        
        System.out.println();
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(i + " - " + occurrences[i]);
        }
    }
}

