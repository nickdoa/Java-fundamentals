
/**
 * GoingUpOrDown
 *
 * @author Nick Choi
 * @version 5/9/23
 */

import java.util.*;

public class GoingUpOrDown {
    public static void main(String args[]) {
        int[] one = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] two = {1, 2, 3, 9, 11, 20, 30};
        int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
        int[] four = {3, 6, 9, 12, 9, 6, 3};

        System.out.println(Arrays.toString(one));
        System.out.println("is going Up? " + goingUp(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Up? " + goingUp(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Up? " + goingUp(three));
        System.out.println(Arrays.toString(four));
        System.out.println("is going Up? " + goingUp(four));

        System.out.println();

        System.out.println(Arrays.toString(one));
        System.out.println("is going Down? " + goingDown(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Down? " + goingDown(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Down? " + goingDown(three));
        System.out.println(Arrays.toString(four));
        System.out.println("is going Down? " + goingDown(four));
    }

    public static boolean goingUp(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean goingDown(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
