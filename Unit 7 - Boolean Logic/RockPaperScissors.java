
/**
 * RockPaperScissors
 *
 * @author Nick Choi
 * @version 4/18/23
 */

import java.util.Random;

public class RockPaperScissors {
    private String playerChoice;
    private String computerChoice;
    public RockPaperScissors() {
    }
    public RockPaperScissors(String player) {
        playerChoice = player;
        generateComputerChoice();
    }
    private void generateComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
    
        if (choice == 0) {
            computerChoice = "R";
        } else if (choice == 1) {
            computerChoice = "P";
        } else {
            computerChoice = "S";
        }
    }   
    public void setPlayers(String player) {
        playerChoice = player;
    }   
    public String determineWinner() {
        String winner = "";
    
        if (playerChoice.equals(computerChoice)) {
            winner = "Draw Game!";
        } else if (playerChoice.equals("R") && computerChoice.equals("S")
                || playerChoice.equals("P") && computerChoice.equals("R")
                || playerChoice.equals("S") && computerChoice.equals("P")) {
            winner = "Player wins <<"
                    + getWinningMove(playerChoice, computerChoice)
                    + ">>!";
        } else {
            winner = "Computer wins <<"
                    + getWinningMove(computerChoice, playerChoice)
                    + ">>!";
        }
    
        return winner;
    } 
    private String getWinningMove(String move1, String move2) {
        String winningMove = "";
    
        if (move1.equals("R") && move2.equals("S")) {
            winningMove = "Rock Breaks Scissors";
        } else if (move1.equals("P") && move2.equals("R")) {
            winningMove = "Paper Covers Rock";
        } else if (move1.equals("S") && move2.equals("P")) {
            winningMove = "Scissors Cuts Paper";
        }
    
        return winningMove;
    } 
    public String toString() {
        String output = "player had " + playerChoice + "\n" + "computer had "
                + computerChoice + "\n" + "!" + determineWinner() + "\n";
        return output;
    }
}