
/**
 * MontyHall
 *
 * @author Nick Choi
 * @version 5/18/23
 */

import java.util.Arrays;
import java.util.Random;

public class MontyHall {
    public static void main(String args[]) {
        System.out.println("Wins without switching: " + montyHall(false, 1000));
        System.out.println();
        System.out.println("Wins with switching: " + montyHall(true, 1000));
    }
    
    public static int montyHall(boolean shouldSwitch, int numTests) {
        int winners = 0;
    
        for (int i = 0; i < numTests; i++) {
            int[] doors = new int[3];
            int winningDoor = new Random().nextInt(3);
            doors[winningDoor] = 10;
    
            int contestantChoice = new Random().nextInt(3);
    
            int revealedDoor = -1;
            int switchDoor = -1;
    
            for (int j = 0; j < doors.length; j++) {
                if (j != contestantChoice && doors[j] == 0) {
                    revealedDoor = j;
                } else if (j != contestantChoice && doors[j] == 10) {
                    switchDoor = j;
                }
            }
    
            if (shouldSwitch) {
                contestantChoice = switchDoor;
            }
    
            if (contestantChoice == winningDoor) {
                winners++;
            }
        }
    
        return winners;
    }
}
