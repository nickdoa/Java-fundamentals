
/**
 * Replace
 *
 * @author Nick Choi
 * @version 2/8/23
 */

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String str = keyboard.nextLine();
        
        int index = str.indexOf('a'); 
        int length = str.length();
    
        System.out.println(" ");
        System.out.println(str.substring(0,index) + "*" + str.substring(index + 1, length));
    }
}
