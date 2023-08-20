
/**
 * Nim80
 *
 * @author Nick Choi
 * @version 3/3/23
 */

import java.util.Scanner;

public class Nim80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        boolean keepPlaying = true;    

        System.out.println("--==* Nim *==--");
        System.out.println(" ");
        
        while (keepPlaying) {
            System.out.println("A: " + pileA + "   B: " + pileB + "   C: " + pileC);
            
            System.out.print("Choose a pile: ");
            String pileChoice = input.nextLine();
            
            System.out.print("How many coins do you want to take from pile " + pileChoice + "? ");
            int numCoins = input.nextInt();
            System.out.println();
            input.nextLine(); 
            switch(pileChoice.toUpperCase()) {
                case "A":
                    pileA -= numCoins;
                    break;
                case "B":
                    pileB -= numCoins;
                    break;
                case "C":
                    pileC -= numCoins;
                    break;
                default:
                    System.out.println("Invalid pile choice. Please try again.");
                    continue;
            }
            
            if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
                keepPlaying = false;
                System.out.println(" ");
                System.out.println("All the piles are empty! Well done!");
            }
        }
        input.close();
    }
}

