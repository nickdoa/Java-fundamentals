
/**
 * Blackjack
 *
 * @author Nick Choi
 * @version 3/31/23
 */

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to blackjack!");
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        Hand player = new Hand(name);
        System.out.println("\nYour hand:");
        System.out.println("\nName: " + player.getName());
        System.out.println("Hand: " + player.toString());
        System.out.println("Total: " + player.handTotal());

        while (!player.getBust() && !player.getStay()) {
            System.out.print("\nMenu:\n1. Hit\n2. Stay\nEnter choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                player.hit();
                System.out.println("\nName: " + player.getName());
                System.out.println("Hand: " + player.toString());
                System.out.println("Total: " + player.handTotal());
            } else if (choice == 2) {
                player.stay();
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        System.out.println("\nYour total: " + player.handTotal());
        if (player.handTotal() > 21) {
            System.out.println("Bust! You lose.");
        } else {
            System.out.println("You win!");
        }
    }
}