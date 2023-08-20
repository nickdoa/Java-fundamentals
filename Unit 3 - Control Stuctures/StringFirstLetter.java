
/**
 * StringFirstLetter - This lab was designed to teach you more about the String class and how if statements are used.
 *
 * @author Nick Choi
 * @version 2/16/23
 */

import java.util.Scanner;

public class StringFirstLetter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Word--> ");
        String word1 = input.nextLine();
        
        System.out.print("Enter Second Word--> ");
        String word2 = input.nextLine();
        
            if (word1.charAt(0) == word2.charAt(0)) {
                System.out.println(" ");
                System.out.println(word1 + " has the same first letter as " + word2);
            } else {
                System.out.println(" ");
                System.out.println(word1 + " does not have the same first letter as " + word2);
            }
    }
}





