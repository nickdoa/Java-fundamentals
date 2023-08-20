
/**
 * DiscountDeterminer
 *
 * @author Nick Choi
 * @version 2/14/23
 */

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original bill amount :: ");
        double bill = input.nextDouble();
        
            if (bill > 2000) {
                double discount = bill * 0.15;
                double total = bill - discount;
                System.out.printf("Bill after discount :: %.2f\n", total);
            } else {
                System.out.printf("Bill after discount :: %.2f\n", bill);
            }
    }
}
