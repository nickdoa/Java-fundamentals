
/**
 * Grades
 *
 * @author Nick Choi
 * @version 5/15/23
 */

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of grades: ");
        int numGrades = input.nextInt();
        
        double[] grades = new double[numGrades];
        
        System.out.println("Enter the grades:");
        for (int i = 0; i < numGrades; i++) {
            System.out.printf("Grade %d: ", i);
            grades[i] = input.nextDouble();
        }
        
        double total = 0;
        for (int i = 0; i < numGrades; i++) {
            System.out.printf("Grade %d :: %.2f\n", i, grades[i]);
            total += grades[i];
        }
        
        double average = total / numGrades;
        System.out.println();
        System.out.printf("Average = %.2f\n", average);
    }
}
