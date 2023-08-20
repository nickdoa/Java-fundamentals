
/**
 * TriangleTwo
 *
 * @author Nick Choi
 * @version 4/21/23
 */

public class TriangleTwo {
  public static String getTriangle(int size, char letter) {
    String output = "";
    
    for (int i = 1; i <= size; i++) {
      for (int j = size; j >= i; j--) {
        output += letter;
      }
      output += "\n";
    }
    
    return output;
  }
}