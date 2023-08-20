
/**
 * DistanceFormula
 *
 * @author Nick Choi
 * @version 2/15/23
 */

import java.util.Scanner;

public class DistanceFormula {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int truckAX = 0;
        int truckAY = 0;
        int truckBX = 0;
        int truckBY = 0;
        
        System.out.print("Enter truck A's X coordinate :: ");
        truckAX = input.nextInt();
        System.out.print("Enter truck A's Y coordinate :: ");
        truckAY = input.nextInt();
        System.out.print("Enter truck B's X coordinate :: ");
        truckBX = input.nextInt();
        System.out.print("Enter truck B's Y coordinate :: ");
        truckBY = input.nextInt();
        
        double distA = Math.sqrt(truckAX * truckAX + truckAY * truckAY);
        double distB = Math.sqrt(truckBX * truckBX + truckBY * truckBY);
        
            if (distA < distB) {
                System.out.println(" ");
                System.out.println("A is closer to (0,0).");
            } else if (distB < distA) {
                System.out.println(" ");
                System.out.println("B is closer to (0,0).");
            } else if (distA == distB) {
                System.out.println(" ");
                System.out.println("Both trucks are equidistant from (0,0).");
            }
    }    
}