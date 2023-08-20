
/**
 * ArrayFunHouse
 *
 * @author Nick Choi
 * @version 5/8/23
 */

public class ArrayFunHouse {
    
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == val) {
                count++;
            }
        }
        return count;
    }
}
