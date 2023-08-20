
/**
 * TriangleThree
 *
 * @author Nick Choi
 * @version 4/24/23
 */

public class TriangleThree {
    private int size;
    private char letter;

    public TriangleThree(int size, char letter) {
        this.size = size;
        this.letter = letter;
    }
    public void printPattern() {
        String output = "";
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                output += " ";
            }
            for (int k = 1; k <= i; k++) {
                output += letter;
            }
            output += "\n";
        }
        System.out.print(output);
    }
}


