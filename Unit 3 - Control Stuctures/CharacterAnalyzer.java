
/**
 * CharacterAnalyzer
 *
 * @author Nick choi
 * @version 2/15/23
 */

import java.util.Scanner;

public class CharacterAnalyzer {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a letter :: ");
    char ch = input.next().charAt(0);
        
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase character. ASCII == " + (int) ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " is an uppercase character. ASCII == " + (int) ch);
            } else if (ch >= '0' && ch <= '9') {
                System.out.println(ch + " is a digit. ASCII == " + (int) ch);
            } else {
                System.out.println(ch + " is neither a character or digit.");
        }
    }
}