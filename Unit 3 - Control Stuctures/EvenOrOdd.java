
/**
 * EvenOrOdd
 *
 * @author Nick Choi
 * @version 2/14/23 
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number :: ");
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }   
}