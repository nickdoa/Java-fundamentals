
/**
 * Lab11a
 *
 * @author Nick Choi
 * @version 4/20/23
 */

import java.util.Scanner;

public class Lab11a {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char moreData = 'y';

      while (moreData == 'y') {
         System.out.print("Enter the size of the triangle : ");
         int size = input.nextInt();
         System.out.print("Enter a letter : ");
         String letter = input.next();

         TriangleOne triangle = new TriangleOne(size, letter);
         triangle.printTriangle();
         
         System.out.println();
         System.out.print("Do you want to enter more data? ");
         moreData = input.next().charAt(0);
         if (moreData == 'y') {
            System.out.println();
         }
      }
   }
}

