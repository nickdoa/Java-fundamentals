
/**
 * PopeyesTimeEstimator
 *
 * @author Nick Choi
 * @version 1/23/23
 */

import java.util.Scanner;

public class PopeyesTimeEstimator {
    public static final int maxCapacity = 127;
    public static final int timePerGroup = 25;
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    
        int customers = 0;
        int hours = 0;
        int minutes = 0;
        
        System.out.println("=======> Popeyes Time Estimator <=======");
        System.out.print("Enter number of expected customers: ");
        customers = keyboard.nextInt();
        
        int groups = customers / maxCapacity;
        int remaining = customers % maxCapacity;
        
        System.out.println("Leftover Customers: " + remaining);
        
        int totalTime = groups * timePerGroup;
        
        if (remaining > 0 ) {
            totalTime += timePerGroup;
        }
        
        hours = totalTime / 60;
        minutes = totalTime % 60;
    
        System.out.print("Total Hours: " + hours + " Minutes: " + minutes);
        
        
        
        
    }
}