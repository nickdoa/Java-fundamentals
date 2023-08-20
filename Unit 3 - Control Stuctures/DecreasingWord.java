
/**
 * DecreasingWord
 *
 * @author Nick Choi
 * @version 2/22/23
 */

import java.util.Scanner;

public class DecreasingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        sc.close();
        
        int length = word.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(word.substring(0, i+1));
        }
    }
}
 