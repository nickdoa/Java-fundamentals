
/**
 * FullName
 *
 * @author Nick
 * @version 2/7/23
 */

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first name--> ");
        String firstName = keyboard.nextLine();
        System.out.print("Enter last name--> ");
        String lastName = keyboard.nextLine();
        System.out.println(" ");
        System.out.println(lastName + ", " + firstName);
    }
}
