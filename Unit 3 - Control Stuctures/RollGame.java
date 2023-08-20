
/**
 * RollOff 
 *
 * @author Nick Choi
 * @version 3/6/23
 */

import java.util.Random;
import java.util.Scanner;

public class RollGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int max = 9999;
        int player1 = random.nextInt(max) + 1;
        System.out.println("Player 1 rolled: " + player1);

        int player2;
        do {
            max = player1;
            System.out.print("Press enter to roll.");
            scanner.nextLine();
            player2 = random.nextInt(max) + 1;
            System.out.println("You rolled a " + player2);
            if (player2 == 1) {
                System.out.println("Player 2 loses!");
                break;
            }

            max = player2;
            System.out.print("Press enter to roll.");
            scanner.nextLine();
            player1 = random.nextInt(max) + 1;
            System.out.println("You rolled a " + player1);
            if (player1 == 1) {
                System.out.println("You rolled a 1! You lose the game.");
                break;
            }
        } while (true);
    }
}
