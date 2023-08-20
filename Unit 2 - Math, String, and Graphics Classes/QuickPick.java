
/**
 * Quick Pick
 *
 * @author Nick Choi
 * @version 1/30/23
 */

import java.util.Random;

public class QuickPick {
    public static void main(String[] args) {
        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("===========================");
        
        Random random = new Random();
        
        int num1 = random.nextInt(50) + 1;
        int num2 = random.nextInt(50) + 1;
        int num3 = random.nextInt(50) + 1;
        int num4 = random.nextInt(50) + 1;
        int num5 = random.nextInt(50) + 1;
        int num6 = random.nextInt(50) + 1;
        
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
    }
}

