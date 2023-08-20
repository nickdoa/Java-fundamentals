
/**
 * RepeatWords
 *
 * @author Nick Choi
 * @version 2/28/23
 */

import java.util.Scanner;

public class RepeatWords {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        String word = "";
        int count = 0; 
        
        System.out.print("Enter words, type (stop or exit) to stop:");
        
        while (!word.equals("stop") && !word.equals("exit")) {
            word = input.nextLine();
            if (!word.equals("stop") && !word.equals("exit")) {
                count++;
            }
        }      
        
        System.out.println("You entered " + count + " words.");
    }
}

