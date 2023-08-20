
/**
 * Grades
 *
 * @author Nick Choi
 * @version 1/18/23
 */
public class Grades {
    public static void main (String[] args) {
        double dailyAvg = 88;
        double quizAvg = 74;
        double testAvg = 95;
        double sixWeeksAvg = 0;
        int roundedAvg = 0;
        
        sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5;
        roundedAvg = (int) (sixWeeksAvg + 0.5);
        
        System.out.println("Daily Average = " + dailyAvg);
        System.out.println("Quiz Average = " + quizAvg);
        System.out.println("Test Average = " + testAvg);
        System.out.println("--------------------------");
        System.out.println("Six Weeks Average = " + roundedAvg);
    }
}
