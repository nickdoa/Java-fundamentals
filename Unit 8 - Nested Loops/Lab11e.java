
/**
 * Lab11e
 *
 * @author Nick Choi
 * @version 4/24/23
 */

import java.util.Scanner;

public class Lab11e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char moreData = 'y';

        while (moreData == 'y') {
            System.out.print("Enter the size of the box pattern: ");
            int size = input.nextInt();
            System.out.println();
            
            Box box = new Box(size);
            box.draw();
            System.out.println();
            
            System.out.print("Do you want to enter more data? (y/n) ");
            moreData = input.next().charAt(0);

            if (moreData == 'y') {
                System.out.println();
            }
        }

        input.close();
    }
}
