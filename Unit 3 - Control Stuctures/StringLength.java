
/**
 * StringLength - This lab was designed to teach you more about the String class and how if statements are used.
 *
 * @author Nick Choi
 * @version 2/16/23
 */

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Word --> ");
        String firstWord = input.nextLine();
        System.out.print("Enter Second Word --> ");
        String secondWord = input.nextLine();

        if (firstWord.length() == secondWord.length()) {
            System.out.println(" ");
            System.out.println(firstWord + " has the same # of letters as " + secondWord);
        } else {
            System.out.println(" ");
            System.out.println(firstWord + " does not have the same # of letters as " + secondWord);
        }
    }
}
