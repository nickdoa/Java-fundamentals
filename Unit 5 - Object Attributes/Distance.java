
/**
 * Distance
 *
 * @author Nick Choi
 * @version 3/28/23
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Distance {
    private int xOne, yOne, xTwo, yTwo;
    private double distance;

    public Distance() {
    }
    public Distance(int x1, int y1, int x2, int y2) {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }
    public void setCoordinates(int x1, int y1, int x2, int y2) {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }
    public void calcDistance() {
        distance = sqrt(pow(xTwo - xOne, 2) + pow(yTwo - yOne, 2));
    }
    public void print() {
        System.out.printf("Distance == %.3f\n", distance);
    }
}
