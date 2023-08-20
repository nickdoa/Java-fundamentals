
/**
 * CombinationLockTest
 *
 * @author Nick Choi
 * @version 4/3/23
 */

import java.util.Scanner;

public class CombinationLockTest {
    public static void main(String[] args) {
        CombinationLock lock = new CombinationLock("11-22-33");

        System.out.println("The current combination is " + lock.getCombination());

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter combination -->");
        String guess = input.nextLine();
        if (guess.equals(lock.getCombination())) {
            lock.open();
            System.out.println(lock.toString());
        } else {
            System.out.println(lock.toString());
        }

        System.out.print("\nChange combination to ");
        String newCombination = input.nextLine();
        lock.changeCombination(newCombination);

        System.out.print("\nEnter combination -->");
        guess = input.nextLine();
        if (guess.equals(lock.getCombination())) {
            lock.open();
            System.out.println(lock.toString());
        } else {
            System.out.println(lock.toString());
        }

        System.out.print("\nType an incorrect combination.\nEnter combination -->");
        guess = input.nextLine();
        if (guess.equals(lock.getCombination())) {
            lock.open();
            System.out.println(lock.toString());
        } else {
            lock.close();
            System.out.println(lock.toString());
        }
    }
}
