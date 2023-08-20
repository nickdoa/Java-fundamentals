
/**
 * Lab11d
 *
 * @author Nick Choi
 * @version 4/27/23
 */

import java.util.Scanner;

public class Lab11d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char moreData = 'y';
        while (moreData == 'y') {
            System.out.print("Enter the size of the triangle: ");
            int size = input.nextInt();
            System.out.print("Enter the letter to use: ");
            char letter = input.next().charAt(0);
            System.out.println();

            TriangleFour triangle = new TriangleFour(size, letter);
            triangle.printTriangle();

            System.out.print("Do you want to enter more data? (y/n) ");
            moreData = input.next().charAt(0);
            if (moreData == 'y') {
                System.out.println();
            }
        }
    }
}
