
/**
 * Baseball
 *
 * @author Nick Choi
 * @version 1/18/23
 */
public class Baseball {
    public static void main(String[] args) {
        int hits = 27;
        int atBats = 80;
        double battingAvg = 0;
        int roundedAvg = 0;
        
        battingAvg = (double) hits / atBats ; 
        battingAvg = (battingAvg + 0.0005) * 1000;
        roundedAvg = (int) battingAvg; 
        
        System.out.println("Hits = " + hits);
        System.out.println("At Bats = " + atBats);
        System.out.println("-------------------------");
        System.out.println("Batting Average = " + roundedAvg);
    }
}
