
/**
 * QuadraticRunner
 *
 * @author Nick Choi
 * @version 3/28/23
 */

import java.util.Scanner;
import static java.lang.System.*;

public class QuadraticRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        System.out.print("Enter a :: ");
        int a = input.nextInt();

        System.out.print("Enter b :: ");
        int b = input.nextInt();

        System.out.print("Enter c :: ");
        int c = input.nextInt();

        Quadratic quad = new Quadratic();
        quad.setEquation(a, b, c);
        quad.calcRoots();

        quad.print();
    }
}

