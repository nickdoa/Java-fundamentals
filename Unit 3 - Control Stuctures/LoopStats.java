
/**
 * LoopStats
 *
 * @author Nick Choi
 * @version 2/24/23
 */

import java.util.Scanner;

public class LoopStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the stop number: ");
        int stop = scanner.nextInt();

        int total = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = start; i <= stop; i++) {
            total += i;
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(start + " " + stop);
        System.out.println("total " + total);
        System.out.println("even count " + evenCount);
        System.out.println("odd count " + oddCount);
    }
}

