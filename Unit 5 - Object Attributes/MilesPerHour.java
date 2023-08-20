
/**
 * MilesPerHour
 *
 * @author Nick Choi
 * @version 3/27/23
 */

import java.util.Scanner;
import static java.lang.System.*;

public class MilesPerHour {
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }
    public MilesPerHour(int dist, int hrs, int mins) {
        setNums(dist, hrs, mins);
    }
    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }
    public void calcMPH() {
        double totalHours = hours + minutes / 60.0;
        mph = distance / totalHours;
    }
    public int getDistance() {
        return distance;
    }   
    public void print() {
        System.out.println(" ");
        out.printf("%d miles in %d hour(s) and %d minute(s) = %.0f MPH.\n", distance, hours, minutes, mph);
    }
}

