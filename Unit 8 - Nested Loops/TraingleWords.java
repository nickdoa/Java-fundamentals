
/**
 * TriangleWords
 *
 * @author Nick Choi
 * @version 5/2/23
 */

import java.util.Scanner;

public class TraingleWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response = "y";
        
        while (response.equals("y")) {
            System.out.print("Enter a word: ");
            String word = input.nextLine().toUpperCase();
            printTriangle(word);
            System.out.println();
            
            System.out.print("Do you want to enter more data? (y/n) ");
            response = input.nextLine();
        }
        
        input.close();
    }
    public static void printTriangle(String word) {
        int length = word.length();
        String output = "";
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                output += " ";
            }
            output += word.charAt(i);
            
            for (int k = 0; k < 2 * i - 1; k++) {
                output += " ";
            }
            
            if (i > 0 && i < length - 1) {
                output += word.charAt(i);
            }
            output += "\n";
        }
        
        String word1 = word.substring(1);
        StringBuilder reverse = new StringBuilder(word1).reverse();
        output += reverse.substring(0);
        
        System.out.println(output + word);
    }
}