
/**
 * DashedWordVoidMethod
 *
 * @author Nick Choi
 * @version 3/21/23
 */

import java.util.Scanner;

public class DashedWordRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        DashedWord dashedWord = new DashedWord();

        System.out.println("Void Method :: ");
        dashedWord.printDashedWord(word);

        System.out.println("Return Method :: ");
        String dashed = dashedWord.returnDashedWord(word);
        System.out.println(dashed);
    }
}
