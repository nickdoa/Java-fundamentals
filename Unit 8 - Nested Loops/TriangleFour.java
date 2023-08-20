
/**
 * TriangleFour
 *
 * @author Nick Choi
 * @version 4/27/23
 */

public class TriangleFour {
    private int size;
    private char letter;

    public TriangleFour(int size, char letter) {
        this.size = size;
        this.letter = letter;
    }

    public void printTriangle() {
        String output = "";
        for (int i = size; i >= 1; i--) {
            for (int k = 1; k <= size - i; k++) {
                output += " ";
            }
            for (int j = 1; j <= i; j++) {
                output += letter;
            }
            output += "\n";
        }
        System.out.println(output);
    }
}

