
/**
 * MinMax 
 *
 * @author Nick Choi
 * @version 1/27/23
 */

import java.util.Scanner;
import java.lang.Math;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first = 0;
        int second = 0; 
        int third = 0;
        int min = 0;
        int max = 0;
        
        System.out.print("Enter 1st Integer --> ");
        first = input.nextInt();
        
        System.out.print("Enter 2nd Integer --> ");
        second = input.nextInt();
        
        System.out.print("Enter 3rd Integer --> ");
        third = input.nextInt();
        
        min = Math.min(Math.min(first, second), third);
        max = Math.max(Math.max(first, second), third);
        
        System.out.println(" ");
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
        
    }
}
