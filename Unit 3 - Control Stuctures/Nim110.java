
/**
 * Nim110
 *
 * @author Nick Choi
 * @version 3/3/23
 */

import java.util.Scanner;

public class Nim110 {
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
            System.out.println(currentPlayer + "'s turn:");
            System.out.print("A: ");
            for (int i = 0; i < pileA; i++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.print("B: ");
            for (int i = 0; i < pileB; i++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.print("C: ");
            for (int i = 0; i < pileC; i++) {
                System.out.print("*");
            }
            System.out.println();

            String pileChoice;
            do {
                System.out.print("Choose a pile: ");
                pileChoice = input.nextLine().toUpperCase();
                if (!pileChoice.equals("A") && !pileChoice.equals("B") && !pileChoice.equals("C")) {
                    System.out.println("Enter a valid choice.");
                    System.out.println();
                }
                else if ((pileChoice.equals("A") && pileA <= 0) || (pileChoice.equals("B") && pileB <= 0) || (pileChoice.equals("C") && pileC <= 0)) {
                    System.out.println("That pile has no coins. Please choose another pile.");
                    System.out.println();
                }
            } while (!pileChoice.equals("A") && !pileChoice.equals("B") && !pileChoice.equals("C") || ((pileChoice.equals("A") && pileA <= 0) || (pileChoice.equals("B") && pileB <= 0) || (pileChoice.equals("C") && pileC <= 0)));

            int numCoins = 0;
            boolean invalidInput = true;
            while (invalidInput) {
                System.out.print("How many coins do you want to take from pile " + pileChoice + "? ");
                numCoins = input.nextInt();
                input.nextLine();
                if (numCoins < 1) {
                    System.out.println("You must take at least one coin. Please try again.");
                    System.out.println();
                }
                else if ((pileChoice.equals("A") && numCoins > pileA) || (pileChoice.equals("B") && numCoins > pileB) || (pileChoice.equals("C") && numCoins > pileC)) {
                    System.out.println("Enter a valid number.");
                    System.out.println();
                }
                else {
                    invalidInput = false;
                }
            }

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
                System.out.println();
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