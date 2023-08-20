
/**
 * TriangleOne
 *
 * @author Nick Choi
 * @version 4/21/23
 */

public class TriangleOne {
   private int size;
   private String letter;

   public TriangleOne(int size, String letter) {
      this.size = size;
      this.letter = letter;
   }
   public void printTriangle() {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= row; col++) {
            System.out.print(letter);
         }
         System.out.println();
      }
   }
}

