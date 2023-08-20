
/**
 * Square
 *
 * @author Nick Choi
 * @version 2/23/23
 */

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String width = "";
        for (int i = 1; i < word.length() - 1; i++) {
            width += " ";
        }

        System.out.println(word);

        for (int i = 0; i < word.length() - 2; i++) {
        System.out.println(word.charAt(i + 1) + width + word.charAt(word.length() - i - 2));
        }
        
        System.out.println(word);
    }
}

