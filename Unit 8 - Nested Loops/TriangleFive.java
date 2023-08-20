
/**
 * TriangleFive
 *
 * @author Nick Choi
 * @version 4/28/23
 */

public class TriangleFive {
    public static void printLetterPattern(char letter, int size) {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k < size - j; k++) {
                    System.out.print((char) (letter + j > 'Z' ? letter + j - 26 : letter + j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
