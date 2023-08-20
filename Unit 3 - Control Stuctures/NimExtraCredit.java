
/**
 * NimExtraCredit
 *
 * @author Nick Choi
 * @version 3/3/23
 */

import java.util.Scanner;

public class NimExtraCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pileA = 4;  // Increase starting number of coins in each pile to 4
        int pileB = 4;
        int pileC = 4;
        boolean keepPlaying = true;    

        System.out.println("--==* Nim *==--");
        System.out.println(" ");
        
        System.out.print("Enter your name player 1: ");
        String player1 = input.nextLine();
        System.out.print("Enter your name player 2: ");
        String player2 = "Computer"; // Player 2 is the computer player
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
            if (currentPlayer.equals(player1)) {  // Player 1's turn
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
            }
            else {  
            int totalCoins = pileA + pileB + pileC;
            int numCoins = 0;
                if (totalCoins % 4 == 0) {
            // If the total number of coins is a multiple of 4, choose a random pile and take 1 coin
            do {
                int randomPile = (int) (Math.random() * 3);
                switch (randomPile) {
                    case 0:
                        if (pileA > 0) {
                            pileA--;
                            numCoins = 1;
                        }
                        break;
                    case 1:
                        if (pileB > 0) {
                            pileB--;
                            numCoins = 1;
                        }
                        break;
                    case 2:
                        if (pileC > 0) {
                            pileC--;
                            numCoins = 1;
                        }
                        break;
                }
            } while (numCoins == 0);
        } else {
            // If the total number of coins is not a multiple of 4, choose a pile to make it a multiple of 4
            int pileChoice;
            if (pileA % 4 == 0) {
                pileChoice = 0;
            } else if (pileB % 4 == 0) {
                pileChoice = 1;
            } else if (pileC % 4 == 0) {
                pileChoice = 2;
            } else {
                // If no pile has a number of coins that is a multiple of 4, choose a random pile
                pileChoice = (int) (Math.random() * 3);
            }

            switch (pileChoice) {
                case 0:
                    numCoins = pileA - (pileA % 4) - 1;
                    pileA -= numCoins + 1;
                    break;
                case 1:
                    numCoins = pileB - (pileB % 4) - 1;
                    pileB -= numCoins + 1;
                    break;
                case 2:
                    numCoins = pileC - (pileC % 4) - 1;
                    pileC -= numCoins + 1;
                    break;
            }
        }

        System.out.println("The computer takes " + numCoins + " coins from pile " + (char) ('A' + pileChoice) + ".");

        if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
            keepPlaying = false;
            System.out.println(" ");
            System.out.println("The computer wins the game! Better luck next time.");
        } else {
            System.out.println();
            currentPlayer = player1;
        }
    }
}
}
}