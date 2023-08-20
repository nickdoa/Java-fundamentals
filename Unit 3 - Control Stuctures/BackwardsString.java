
/**
 * BackwardsString 
 *
 * @author Nick Choi
 * @version 2/23/23
 */

import java.util.Scanner;

public class BackwardsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        System.out.println();
        System.out.println(word);
    }
}
