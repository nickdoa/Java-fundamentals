
/**
 * Nim90
 *
 * @author Nick Choi
 * @version 3/3/23
 */

import java.util.Scanner;

public class Nim90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        boolean keepPlaying = true;    

        System.out.println("--==* Nim *==--");
        System.out.println(" ");
        
        System.out.print("Enter your name player 1: ");
        String player1 = input.nextLine();
        System.out.print("Enter your name player 2: ");
        String player2 = input.nextLine();
        System.out.println(" ");
        
        String currentPlayer = player1;
        
        while (keepPlaying) {
            System.out.println(currentPlayer + "'s turn");
            System.out.println("A: " + pileA + "   B: " + pileB + "   C: " + pileC);
            String pileChoice;
            do {
                System.out.print("Choose a pile: ");
                pileChoice = input.nextLine().toUpperCase();
            } while (!pileChoice.equals("A") && !pileChoice.equals("B") && !pileChoice.equals("C"));
            
            System.out.print("How many coins do you want to take from pile " + pileChoice + "? ");
            int numCoins = input.nextInt();
            input.nextLine(); 
            System.out.println();
            switch(pileChoice) {
                case "A":
                    pileA -= numCoins;
                    break;
                case "B":
                    pileB -= numCoins;
                    break;
                case "C":
                    pileC -= numCoins;
                    break;
            }
            
            if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
                keepPlaying = false;
                System.out.println(" ");
                System.out.println(currentPlayer + " wins the game! Well done!");
            }
            else {
                if (currentPlayer.equals(player1)) {
                    currentPlayer = player2;
                }
                else {
                    currentPlayer = player1;
                }
            }
        }
        input.close();
    }
}

