/**
 * Unit1Lab100
 *
 * @author Nick Choi
 * @version 1/25/23
 */

import java.util.Scanner;

public class Unit1Lab100 {
    private static final int MILLISECONDS_IN_HOUR = 3600000;
    private static final int MILLISECONDS_IN_MINUTE = 60000;
    private static final int MILLISECONDS_IN_SECOND = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of milliseconds: ");
        
        long totalMilliseconds = sc.nextLong();
        int hours = (int)totalMilliseconds / MILLISECONDS_IN_HOUR;
        int remainingMilliseconds = (int)totalMilliseconds % MILLISECONDS_IN_HOUR;
        int minutes = (int)remainingMilliseconds / MILLISECONDS_IN_MINUTE;
        remainingMilliseconds = remainingMilliseconds % MILLISECONDS_IN_MINUTE;
        int seconds = (int)remainingMilliseconds / MILLISECONDS_IN_SECOND;
        remainingMilliseconds = remainingMilliseconds % MILLISECONDS_IN_SECOND;
       
        System.out.println("Starting milliseconds: " + totalMilliseconds);
        System.out.println("Hours:            " + hours);
        System.out.println("Minutes:          " + minutes);
        System.out.println("Seconds:          " + seconds);
        System.out.println("Milli Seconds:    " + remainingMilliseconds);
    }
}
