
/**
 * Mixup
 * 
 * @author Nick Choi
 * @version 2/8/23
 */

import java.util.Scanner;

public class Mixup {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String str = keyboard.nextLine();
        
        int length = str.length();
        int halfLength = length / 2;
        
        String firstHalf = str.substring(halfLength);
        String secondHalf = str.substring(0, halfLength);
        String mixed = firstHalf + secondHalf;
        
        System.out.println(" ");
        System.out.println("Mixed up string = " + mixed);
    }
}