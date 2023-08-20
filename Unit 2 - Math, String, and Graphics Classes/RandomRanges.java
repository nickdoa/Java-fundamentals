
/**
 * RandomRanges
 *
 * @author Nick Choi
 * @version 2/6/23
 */

import java.lang.Math;

public class RandomRanges {
  public static void main(String[] args) {
    System.out.println("Random Ranges");
    System.out.println("================");

    int num1 = (int)(Math.random() * 26);
    System.out.println("1. Range: 0 to 25 = " + num1);

    int num2 = (int)(Math.random() * 3) + 1;
    System.out.println("2. Range: 1 to 3 = " + num2);

    int num3 = (int)(Math.random() * 51) + 50;
    System.out.println("3. Range: 50 to 100 = " + num3);

    int num4 = (int)(Math.random() * 10) - 10;
    System.out.println("4. Range: -10 to -1 = " + num4);

    int num5 = (int)(Math.random() * 201) - 100;
    System.out.println("5. Range: -100 to 100 = " + num5);

    int num6 = (int)(Math.random() * 26) + 65;
    System.out.println("6. Range: A to Z = " + (char)num6);

    double num7 = (double)((int)(Math.random() * 1000)) / 1000.0;
    System.out.println("7. Range: 0.0 to 1.0 = " + String.format("%.3f", num7));

    int num8 = (int)(Math.random() * 9001) + 1000;
    num8 = num8 / 1000 * 1000;
    System.out.println("8. Range: 1000 to 10000 = " + num8);
  }
}


