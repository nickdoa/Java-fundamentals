
/**
 * Box
 *
 * @author Nick Choi
 * @version 4/24/23
 */

public class Box {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    public void draw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size + 1; j++) {
                if (j < size - i) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}


