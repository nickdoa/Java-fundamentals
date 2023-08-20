
/**
 * Quadratic
 *
 * @author Nick Choi
 * @version 3/28/23
 */

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic {
    private int a, b, c;
    private double rootOne;
    private double rootTwo;

    public Quadratic() {
    }
    public Quadratic(int quadA, int quadB, int quadC) {
        setEquation(quadA, quadB, quadC);
    }
    public void setEquation(int quadA, int quadB, int quadC) {
        a = quadA;
        b = quadB;
        c = quadC;
    }
    public void calcRoots() {
        double discriminant = pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            out.println("No real roots.");
        } else {
            rootOne = (-b + sqrt(discriminant)) / (2 * a);
            rootTwo = (-b - sqrt(discriminant)) / (2 * a);
        }
    }
    public void print() {
        out.printf("rootone :: %.2f\n", rootOne);
        out.printf("roottwo :: %.2f\n", rootTwo);
    }
}

