
/**
 * Lab11h
 *
 * @author Nick Choi
 * @version 4/28/23
 */

import java.util.Scanner;

public class Lab11h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        int size;
        char moreData = 'y';
        
        while (moreData == 'y') {
            System.out.print("Enter a letter: ");
            letter = input.next().charAt(0);
            System.out.print("Enter a size: ");
            size = input.nextInt();
            System.out.println();
            
            TriangleFive.printLetterPattern(letter, size);
            
            System.out.println();
            System.out.print("Do you want to enter more data? (y/n) ");
            moreData = input.next().charAt(0);
            if (moreData == 'y') {
                System.out.println();
            }
        }
    }
}
