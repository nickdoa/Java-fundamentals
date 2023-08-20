
/**
 * LastLetter
 *
 * @author Nick Choi
 * @version 2/8/23
 */

import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String str = keyboard.nextLine(); 
        int len = str.length();
        
        System.out.println(" ");        
        System.out.println("Last letter = " + str.substring(len - 1));
        
    }
}
