
/**
 * OddorEven
 *
 * @author Nick Choi
 * @version 2/14/23
 */

import java.util.Scanner;

public class OddorEven {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a word :: ");
    String word = keyboard.nextLine();

    int length = word.length();
    if (length % 2 == 0) {
      System.out.println(word + " is even.");
    } else {
      System.out.println(word + " is odd.");
    }
  }
}



