
/**
 * LetterGrade
 *
 * @author Nick Choi
 * @version 2/18/23
 */

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Numerical Grade--> ");
        int grade = input.nextInt();
        input.close();
        String letterGrade = "";
        
        if (grade >= 97 && grade <= 100) {
            letterGrade = "A+";
        } else if (grade >= 94 && grade <= 96) {
            letterGrade = "A";
        } else if (grade >= 90 && grade <= 93) {
            letterGrade = "A-";
        } else if (grade >= 87 && grade <= 89) {
            letterGrade = "B+";
        } else if (grade >= 84 && grade <= 86) {
            letterGrade = "B";
        } else if (grade >= 80 && grade <= 83) {
            letterGrade = "B-";
        } else if (grade >= 77 && grade <= 79) {
            letterGrade = "C+";
        } else if (grade >= 74 && grade <= 76) {
            letterGrade = "C";
        } else if (grade >= 70 && grade <= 73) {
            letterGrade = "C-";
        } else {
            letterGrade = "F";
        }
        System.out.println("Letter Grade = " + letterGrade);
    }
}
