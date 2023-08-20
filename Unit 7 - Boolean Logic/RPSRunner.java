
/**
 * RPSRunner
 *
 * @author Nick Choi
 * @version 4/18/23
 */

import java.util.Scanner;

public class RPSRunner {
    public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    char response;
        do {
            System.out.print("Rock-Paper-Scissors - pick your weapon [R,P,S]:: ");
            String player = keyboard.nextLine().toUpperCase();
    
            while (!player.equals("R") && !player.equals("P")
                    && !player.equals("S")) {
                System.out.print("Invalid input. Please choose R, P, or S: ");
                player = keyboard.nextLine().toUpperCase();
            }
    
            RockPaperScissors game = new RockPaperScissors(player);
            System.out.println(game);
    
            System.out.print("Do you want to play again? [y/n]: ");
            response = keyboard.nextLine().charAt(0);
        } while (response == 'y' || response == 'Y');
    
        System.out.println("Thanks for playing!");
    }
}
