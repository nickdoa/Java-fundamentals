
/**
 * Reverse
 *
 * @author Nick Choi
 * @version 5/11/23
 */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 20 integers.");
        
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Num " + (i+1) + " --> ");
            nums[i] = input.nextInt();
        }
        
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        input.close();
    }
}
