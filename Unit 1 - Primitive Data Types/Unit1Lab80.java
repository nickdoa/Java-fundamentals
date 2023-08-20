
/**
 * Unit1Lab80 
 *
 * @author Nick Choi
 * @version 1/25/23
 */
public class Unit1Lab80 {
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;
    public static void main(String[] args) {
        int totalSeconds = 10000;
        int hours = totalSeconds / SECONDS_IN_HOUR;
        int remainingSeconds = totalSeconds % SECONDS_IN_HOUR;
        int minutes = remainingSeconds / SECONDS_IN_MINUTE;
        remainingSeconds = remainingSeconds % SECONDS_IN_MINUTE;
            
        System.out.println("Starting seconds: " + totalSeconds);
        System.out.println("Hours:            " + hours);
        System.out.println("Minutes:          " + minutes);
        System.out.println("Seconds:          " + remainingSeconds);
    }    
}
