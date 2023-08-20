
/**
 * RemoveX
 *
 * @author Nick Choi
 * @version 3/22/23 
 */

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word to remove all x characters: ");
        String word = input.nextLine();

        String fixedWord = removeX(word);
        System.out.println(word + " -> " + fixedWord);
    }
    public static String removeX(String word) {
        return word.replaceAll("[xX]", "");
    }
}
