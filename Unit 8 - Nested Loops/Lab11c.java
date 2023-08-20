
/**
 * Lab11c
 *
 * @author Nick Choi
 * @version 4/24/23
 */

import java.util.Scanner;

public class Lab11c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char moreData = 'y';
        while (moreData == 'y') {
            System.out.print("Enter the size of the triangle and the letter to use: ");
            int size = input.nextInt();
            char letter = input.next().charAt(0);
            System.out.println();
            
            TriangleThree triangle = new TriangleThree(size, letter);
            triangle.printPattern();
            System.out.println();
            
            System.out.print("Do you want to enter more data? (y/n) ");
            moreData = input.next().charAt(0);
            
            if (moreData == 'y') {
                System.out.println();
            }
        }
    }
}


