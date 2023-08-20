
/**
 * DistanceRunner
 *
 * @author Nick Choi
 * @version 3/28/23
 */

import java.util.Scanner;

public class DistanceRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Distance d = new Distance();

        System.out.print("Enter X1 :: ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y1 :: ");
        int y1 = sc.nextInt();
        System.out.print("Enter X2 :: ");
        int x2 = sc.nextInt();
        System.out.print("Enter Y2 :: ");
        int y2 = sc.nextInt();

        d.setCoordinates(x1, y1, x2, y2);
        d.calcDistance();

        d.print();
    }
}
