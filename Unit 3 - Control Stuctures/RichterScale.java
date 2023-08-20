
/**
 * RichterScale
 *
 * @author Nick Choi
 * @version 2/18/23
 */
import java.util.Scanner;

public class RichterScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a magnitude on the Richter scale ==>> ");
        double magnitude = input.nextDouble();

        if (magnitude < 0) {
            System.out.println(" ");
            System.out.println("This number is not valid.");
        } else if (magnitude >= 8.0) {
            System.out.println(" ");
            System.out.println("Damage = Most structures fall");
        } else if (magnitude >= 7.0) {
            System.out.println(" ");
            System.out.println("Damage = Most buildings destroyed");
        } else if (magnitude >= 6.0) {
            System.out.println(" ");
            System.out.println("Damage = Many buildings considerably damaged, some collapse");
        } else if (magnitude >= 4.5) {
            System.out.println(" ");
            System.out.println("Damage = Damage to poorly constructed buildings");
        } else if (magnitude >= 3.5) {
            System.out.println(" ");
            System.out.println("Damage = Felt by many people, no destruction");
        }else {
            System.out.println(" ");
            System.out.println("Damage = Generally not felt by people");
        }
    }
}
