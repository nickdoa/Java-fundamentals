
/**
 * Powers 
 *
 * @author Nick Choi
 * @version 1/20/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Powers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        
        int num = input.nextInt();
        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        int fourthPower = (int) Math.pow(num, 4);
        
        System.out.println(" ");
        System.out.println("The Square = " + square);
        System.out.println("The Cube = " + cube);
        System.out.println("The Fourth Power = " + fourthPower);
    }
}

    