
/**
 * WordList
 *
 * @author Nick Choi
 * @version 5/10/23
 */

import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[10];
        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            words[i] = input.nextLine();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(words[i]);
        }
    }
}

