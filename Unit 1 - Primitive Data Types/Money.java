
/**
 * Money
 *
 * @author Nick Choi
 * @version 1/20/23
 */

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int quarters = 0; 
        int dimes = 0;
        int nickels = 0; 
        int pennies = 0;
        int totalCents = 0; 
        int dollars = 0; 
        int cents = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many pennies do you have? --> ");
        pennies = input.nextInt();
        
        System.out.print("How many nickels do you have? --> ");
        nickels = input.nextInt();
        
        System.out.print("How many dimes do you have? --> ");
        dimes = input.nextInt();
        
        System.out.print("How many quarters do you have? --> ");
        quarters = input.nextInt();
        
        totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies * 1;
        dollars = totalCents / 100;
        cents = totalCents % 100;
        System.out.println(" ");
        System.out.println("Total value = " + dollars + " dollars and " + cents + " cents");
    }
}

