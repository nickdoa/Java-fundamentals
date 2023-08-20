
/**
 * Lab11b
 *
 * @author Nick Choi
 * @version 4/20/23
 */

import java.util.Scanner;

public class Lab11b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        char letter;
        String moreData = "y";

        while (moreData.equals("y")) {
          System.out.print("Enter size: ");
          size = input.nextInt();
          input.nextLine(); // consume the newline character left by nextInt()
    
          System.out.print("Enter letter: ");
          letter = input.nextLine().charAt(0);
    
          String triangle = TriangleTwo.getTriangle(size, letter);
          System.out.print(triangle);
    
          System.out.println();
          System.out.print("Do you want to enter more data? (y/n) ");
          moreData = input.nextLine();
    
          if (moreData.equals("y")) {
            System.out.println();
          }
        }
    }
}