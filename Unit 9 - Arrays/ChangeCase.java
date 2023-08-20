
/**
 * ChangeCase
 *
 * @author Nick Choi
 * @version 5/12/23
 */

import java.util.*;

public class ChangeCase {
    private String[] words = new String[50];
    private int size = 0; 
    private Scanner keyboard = new Scanner(System.in);
    
    public void readWords() {
        String input = keyboard.nextLine();
        
        while (!input.equals("stop")) {
            words[size] = input;
            size++;
            input = keyboard.nextLine();
        }
    }
    
    public void printWords() {
        for (int i = 0; i < size; i++) {
            String word = words[i];
            System.out.println(word + " " + word.toUpperCase() + " " + word.toLowerCase());
        }
    }
    
    public static void main(String[] args) {
        ChangeCase app = new ChangeCase();
        app.readWords();
        System.out.println();
        app.printWords();
    }
}