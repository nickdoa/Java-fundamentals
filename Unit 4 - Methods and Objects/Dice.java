
/**
 * Dice
 *
 * @author Nick Choi
 * @version 3/23/23
 */

import java.util.Random;

public class Dice {
    public int rollDie() {
        Random rand = new Random();
        int result = rand.nextInt(6) + 1;
        return result;
    }
    public void printRolls() {
        for (int i = 1; i <= 3; i++) {
            int roll = rollDie();
            System.out.println("Roll " + i + " :: " + roll);
        }
    }
}