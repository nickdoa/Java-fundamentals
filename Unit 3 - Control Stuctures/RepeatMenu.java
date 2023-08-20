
/**
 * RepeatMenu
 *
 * @author Nick Choi
 * @version 3/2/23
 */
import java.util.Scanner;

public class RepeatMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\tMenu");
            System.out.println("---------------------");
            System.out.println("1. Dr. Pepper");
            System.out.println("2. Coke");
            System.out.println("3. Sprite");
            System.out.println("4. 7-UP");
            System.out.println("5. Diet Coke");
            System.out.print("Selection: ");
            choice = input.nextInt();

             if (choice < 1 || choice > 5) {
                System.out.println("\nInvalid selection. Please try again.\n");
            }

        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                System.out.println("\nYou have chosen Dr. Pepper");
                break;
            case 2:
                System.out.println("\nYou have chosen Coke");
                break;
            case 3:
                System.out.println("\nYou have chosen Sprite");
                break;
            case 4:
                System.out.println("\nYou have chosen 7-UP");
                break;
            case 5:
                System.out.println("\nYou have chosen Diet Coke");
                break;
            default:
                break;
        }
    }
}