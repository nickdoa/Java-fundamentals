
/**
 * GradeReturn
 *
 * @author Nick Choi
 * @version 3/22/23 
 */

import java.util.Scanner;

public class GradeReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number grade: ");
        int grade = sc.nextInt();
        System.out.println("You earned a: " + getGradeLetter(grade));
    }
    public static char getGradeLetter(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 75) {
            return 'C';
        } else if (grade >= 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
