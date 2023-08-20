
/**
 * Lab11fBoxWord
 *
 * @author Nick Choi
 * @version 5/1/23
 */

import java.util.Scanner;

public class Lab11fBoxWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char moreData = 'y';
        while (moreData == 'y') {
            System.out.print("Enter a word: ");
            String word = input.nextLine().toUpperCase();

            int size = word.length();

            String output = "";
            for (int i = 0; i < size; i++) {
                output += word.charAt(i) + " ";
            }
            output += "\n";

            for (int i = 1; i < size - 1; i++) {
                output += word.charAt(size - i - 1) + " ";
                for (int j = 1; j < size - 1; j++) {
                    output += "  ";
                }
                output += word.charAt(i) + " ";
                output += "\n";
            }

            for (int i = size - 1; i >= 0; i--) {
                output += word.charAt(i) + " ";
            }
            output += "\n";

            System.out.println(output);

            System.out.print("Do you want to enter more data? (y/n) ");
            moreData = input.next().charAt(0);
            input.nextLine(); // consume the new line character
            if (moreData == 'y') {
                System.out.println();
            }
        }
    }
}
