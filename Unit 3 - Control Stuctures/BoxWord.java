
/**
 * BoxWord 
 *
 * @author Nick Choi
 * @version 2/22/23
 */

import java.util.Scanner;

public class BoxWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            System.out.println(word);
        }
    }
}