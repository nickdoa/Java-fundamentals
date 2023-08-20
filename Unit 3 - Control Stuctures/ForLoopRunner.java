
/**
 * ForLoopRunner
 *
 * @author Nick Choi
 * @version 2/22/23
 */

import java.util.Scanner;

public class ForLoopRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start value: ");
        int start = input.nextInt();

        System.out.print("Enter the stop value: ");
        int stop = input.nextInt();

        System.out.print("Enter the increment value: ");
        int increment = input.nextInt();

        System.out.print("start " + start + " : stop " + stop + " : increment " + increment + "\n");
        for (int i = start; i <= stop; i += increment) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
